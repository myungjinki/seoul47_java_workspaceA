package chapter11.object;

public class C092_string1 {
	public static void main(String[] args) {
		// 1. String 객체 생성 방법
		String str1 = new String("아름다운");
		System.out.println(str1);
		
		String str2 = "우리나라";
		System.out.println(str2);
		
		char[] ar = { 'k', 'o', 'r', 'e', 'a'};
		String str3 = new String(ar);
		System.out.println(str3);
		
		System.out.println(str3.length());
		System.out.println("대한민국".length());
		
		// 2. Escape Sequence
		System.out.println("줄바꿈\n탭\t 큰따옴표\", 작은따옴표\'");
		
		// 3. printf 사용법
		int i = 123;
		double d = 3.14159265;
		String str4 = "문자열";
		
		System.out.printf("기본출력: i=%d, d=%.2f, str=%s \n"
				, i, d, str4);
		
		//인덱스 지정자(출력 순서 조정)
		System.out.printf("순서바꾸기: str=%3$s, d=%2$f, i=%1$d \n"
				, i, d, str4);
		
		// 4. 출력 서식 예제
		System.out.printf("__%d__ \n"		, i);
		System.out.printf("__%5d__ \n"		, i); //폭5, 오른쪽 정렬
		System.out.printf("__%-5d__ \n"		, i); //폭5, 왼쪽 정렬
		System.out.printf("__%05d__ \n"		, i); //폭5, 0으로 채우기
		System.out.printf("__%.2f__ \n"		, i); //소수점 2자리
		System.out.printf("__%8.4f__ \n"	, i); //총8자리, 소수점 4자리
		
		// 5. String.format 사용
		String formattedStr = String.format("안녕 %s!!", "하세요");
		System.out.println(formattedStr);
		String formattedStr2 = String.format("응답하라 %d", 1997);
		System.out.println(formattedStr2);
		
	}
}
