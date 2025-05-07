import subprocess
import glob
import re

# 테스트 케이스
test_cases = [
    {
        "name": "고객등록 - 주민번호 14자리 초과",
        "input": ["1", "1", "홍길동", "980101-1234567890", "3", "6"],
        "expected_outputs": ["고객정보 등록 실패"],
    },
    {
        "name": "고객등록 - 주민번호 14자리 미만",
        "input": ["1", "1", "홍길동", "980101-1890", "3", "6"],
        "expected_outputs": ["고객정보 등록 실패"],
    },
    {
        "name": "고객등록 - 하이픈 위치",
        "input": ["1", "1", "홍길동", "12345-61234567", "3", "6"],
        "expected_outputs": ["고객정보 등록 실패"],
    },
    {
        "name": "고객등록 - 주민번호 중복",
        "input": [
            "1",
            "1",
            "김민수",
            "901010-1234567",
            "1",
            "김민수",
            "901010-1234567",
            "3",
            "6",
        ],
        "expected_outputs": ["고객정보 등록 실패"],
    },
    {
        "name": "고객등록 - 정상 등록 후 검색",
        "input": [
            "1",
            "1",
            "이영희",
            "850505-2345678",
            "2",
            "850505-2345678",
            "3",
            "6",
        ],
        "expected_outputs": [
            "DSA_Bank-[고객명: 이영희, 주민등록번호: 850505-2345678], 계좌= []",
        ],
    },
    {
        "name": "고객등록 - 정상 등록 후 검색시 주민등록번호 오류",
        "input": [
            "1",
            "1",
            "이영희",
            "850505-2345678",
            "2",
            "850505-234678",
            "3",
            "6",
        ],
        "expected_outputs": [
            "고객정보가 없습니다.",
        ],
    },
    {
        "name": "계좌생성 - 고객 없는 경우",
        "input": ["2", "1", "990101-9999999", "3", "6"],
        "expected_outputs": ["고객 정보가 없습니다."],
    },
    {
        "name": "계좌생성 - 정상 등록 고객",
        "input": [
            "1",
            "1",
            "정우성",
            "800101-1111111",
            "3",
            "2",
            "1",
            "800101-1111111",
            "1000",
            "3",
            "6",
        ],
        "expected_outputs": ["(계좌번호: DSA_Bank1000, 잔고: 1000)"],
    },
    {
        "name": "계좌검색 - 존재하지 않는 계좌",
        "input": ["2", "2", "DSA_Bank9999", "3", "6"],
        "expected_outputs": ["계좌 정보가 없습니다."],
    },
    {
        "name": "입금 - 정상 입금",
        "input": [
            "1",
            "1",
            "박세리",
            "791010-3456789",
            "3",  # 고객등록
            "2",
            "1",
            "791010-3456789",
            "1000",
            "3",  # 계좌생성
            "3",
            "DSA_Bank1000",
            "500",
            "6",  # 입금
        ],
        "expected_outputs": [
            "입금 전 계좌정보 : (계좌번호: DSA_Bank1000, 잔고: 1000)",
            "입금 후 계좌정보 : (계좌번호: DSA_Bank1000, 잔고: 1500)",
        ],
    },
    {
        "name": "입금 - 음수값 입금",
        "input": [
            "1",
            "1",
            "유재석",
            "750101-2222222",
            "3",
            "2",
            "1",
            "750101-2222222",
            "1000",
            "3",
            "3",
            "DSA_Bank1000",
            "-1",
            "6",
        ],
        "expected_outputs": ["금액은 0보다 작을 수 없습니다."],
    },
    {
        "name": "출금 - 잔고 초과",
        "input": [
            "1",
            "1",
            "김태희",
            "890505-5555555",
            "3",
            "2",
            "1",
            "890505-5555555",
            "500",
            "3",
            "4",
            "DSA_Bank1000",
            "1000",
            "6",
        ],
        "expected_outputs": ["잔고가 부족합니다."],
    },
    {
        "name": "이체 - 정상",
        "input": [
            "1",
            "1",
            "아이유",
            "920101-1111222",
            "1",
            "박보검",
            "930202-3333444",
            "3",
            "2",
            "1",
            "920101-1111222",
            "2000",
            "3",
            "2",
            "1",
            "930202-3333444",
            "1000",
            "3",
            "5",
            "DSA_Bank1000",
            "DSA_Bank1001",
            "500",
            "6",
        ],
        "expected_outputs": ["이체 후 출금계좌 정보", "잔고: 1500"],
    },
    {
        "name": "이체 - 잔액 부족",
        "input": [
            "1",
            "1",
            "아이유",
            "920101-1111222",
            "1",
            "박보검",
            "930202-3333444",
            "3",
            "2",
            "1",
            "920101-1111222",
            "2000",
            "3",
            "2",
            "1",
            "930202-3333444",
            "1000",
            "3",
            "5",
            "DSA_Bank1000",
            "DSA_Bank1001",
            "50000",
            "6",
        ],
        "expected_outputs": ["잔고가 부족합니다."],
    },
]


# 자바 컴파일 함수
def compile_java():
    java_files = glob.glob("src/**/*.java", recursive=True)
    if not java_files:
        print("❌ Java 파일이 없습니다.")
        return False
    result = subprocess.run(
        ["javac", "-d", "bin"] + java_files, capture_output=True, text=True
    )
    if result.returncode != 0:
        print("❌ 컴파일 실패:")
        print(result.stderr)
        return False
    print("✅ 컴파일 성공")
    return True


# 자바 실행 함수
def run_java_with_input(inputs):
    joined_input = "\n".join(inputs) + "\n"
    process = subprocess.Popen(
        ["java", "-cp", "bin", "com.bank.Bank"],
        stdin=subprocess.PIPE,
        stdout=subprocess.PIPE,
        stderr=subprocess.PIPE,
        text=True,
        bufsize=1,
        close_fds=True,
    )
    try:
        stdout, stderr = process.communicate(input=joined_input, timeout=10)
        return stdout.strip(), stderr.strip(), joined_input.strip()
    except subprocess.TimeoutExpired:
        process.kill()
        return "(타임아웃)", "(타임아웃)", joined_input.strip()


# 출력 정리 함수
def clean_output(output: str) -> list[str]:
    # 개행 없이 붙은 프롬프트를 명시적으로 줄바꿈
    output = output.replace("선택 >", "선택 >\n")
    output = output.replace("이름 :", "이름 :\n")
    output = output.replace("주민번호 :", "주민번호 :\n")
    output = output.replace("입금할 금액 :", "입금할 금액 :\n")
    output = output.replace("출금할 금액 :", "출금할 금액 :\n")
    output = output.replace("입금할 계좌번호 :", "입금할 계좌번호 :\n")
    output = output.replace("출금할 계좌번호 :", "출금할 계좌번호 :\n")
    output = output.replace("검색할 고객의 주민번호 :", "검색할 고객의 주민번호 :\n")

    # 한 줄씩 분리해서 정제
    raw_lines = output.splitlines()
    ignore_lines = {
        "[ DSA_Bank ]",
        "[ 고객관리 ]",
        "[ 고객등록 ]",
        "[ 계좌관리 ]",
        "1. 고객관리",
        "2. 계좌관리",
        "3. 입금하기",
        "4. 출금하기",
        "5. 이체하기",
        "6. 프로그램 종료",
        "1. 고객등록",
        "2. 고객검색",
        "3. 상위 매뉴로",
        "1. 계좌생성",
        "2. 계좌검색",
        "계좌를 생성할 고객의 주민번호 :",
        "검색할 고객의 주민번호 :",
        "입금할 금액 :",
        "출금할 금액 :",
        "입금할 계좌번호 :",
        "출금할 계좌번호 :",
        "이름 :",
        "주민번호 :",
        "선택 >",
        "프로그램을 종료 합니다.",
    }

    filtered = []
    for line in raw_lines:
        line = line.strip()
        if not line or line in ignore_lines:
            continue
        filtered.append(line)
    return filtered


# 테스트 실행
def run_tests():
    if not compile_java():
        return

    for test in test_cases:
        print(f"\n🧪 테스트명: {test['name']}")
        output, error, actual_input = run_java_with_input(test["input"])
        filtered_output = clean_output(output)

        matched = all(
            any(expected in actual for actual in filtered_output)
            for expected in test["expected_outputs"]
        )

        if matched:
            print("✅ 테스트 통과")
            print(
                "🔍 실제 출력:\n" + "\n".join(f"  - {line}" for line in filtered_output)
            )
            print(f"👀 기대 출력: {test['expected_outputs']}")
        else:
            print("❌ 기대 출력 미일치")
            print(
                "🔍 실제 출력:\n" + "\n".join(f"  - {line}" for line in filtered_output)
            )
            print(f"👀 기대 출력: {test['expected_outputs']}")


if __name__ == "__main__":
    run_tests()
