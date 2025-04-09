package chapter01.data;

public class C007_Constant {
	public static void main(String[] args) {
		// 상수
		// final 예약어(지정자) 붙음
		// 보통 대문자로 작성 (일반 변수와 구분하기 위해서)
		// 재할당 X
		
		final double RATE = 3.28;
		System.out.println("이자율: " + RATE + "%");
		int deposit = 10000;
		System.out.println("1년 후 이자: " + deposit * RATE / 100 + "");
		
		// 리터럴
		// 변수에 대입되거나 수식에 직접 사용되는 값
		// 수치값으로써 표기되며 이름이 없음
//		final double PI = 3.14;	// PI 상수, 3.14 리터
//		int number = 10000;		// number 변수, 10000 리터럴
	}
}
