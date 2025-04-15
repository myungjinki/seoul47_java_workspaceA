package chapter06.class_part1;

/*
	멤버변수의 경우 보통 private 을 사용하여 외부로부터의 직접적 접근을 막고,
	getter / setter 라 부르는 멤버메스드를 만들어 사용함으로써
	내부 데이터에 제한적 접근을 할 수 있게 한다.
 */

class Member {
	private String id;
	private String password;
	private String phoneNumber;
	// 회원 ID는 변경되지 않으므로 getter만 존재 (읽기 전용)
	public String getPhoneNumber() {
		return phoneNumber;
	}
	// 비밀번호는 읽을 수 없으므로 setter만 존재
	public void setPassword(String password) {
		this.password = password;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getId() {
		return id;
	}
	
	public void memberInfo(String pwCheck) {
		if (this.password.equals(pwCheck)) {
			System.out.println("[ 회원 정보 ]");
			System.out.println(" * 아이디   : " + this.id);
			System.out.println(" * 전화번호  : "
					+ this.phoneNumber);
		}
	}
	
	public Member(String id, String password, String phoneNumber) {
		super();
		this.id = id;
		this.password = password;
		this.phoneNumber = phoneNumber;
	}
}

public class C051_encapsulation {
	public static void main(String[] args) {
		Member member1 = new Member("홍길동"
									, "123"
									, "01012345678");
//		System.out.println( member1.id ); // 직접적인 접근 불가
		System.out.println( member1.getId() );
//		System.out.println( member1.pw ); // 직접적인 접근 불가
		System.out.println( member1.getPhoneNumber() );
		member1.memberInfo("123");
	}
}
