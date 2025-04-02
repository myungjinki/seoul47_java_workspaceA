package chapter00.basic;

public class C004_Variable_assign {
	public static void main(String[] args) {
		// 변수의 선언
		int number;
//		int number; // 중복 X
//		System.out.println(number); //초기화 X
		
		// 변수의 초기화 & 할당
		int value = 1234;
		System.out.println(value);
		
		// 재할당
		value = 1000;
		System.out.println(value);
	}
}
