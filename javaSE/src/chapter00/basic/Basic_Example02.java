package chapter00.basic;

import java.util.Scanner;

//	int s = 1000;
//	System.out.println("입력하세요" + s);

//	문자열 + 숫자 = 문자
//	숫자 + 숫자 = 숫자

/**
 * 이름, 나이 키를 입력받아 출력하세요.
 * 
 * 출력결과
 * 이름 : 홍길동
 * 나이 : 20
 * 키 : 188.9
 * 이름은 홍길동이고 나이는 20세, 키는 188.9Cm입니다.
 */
public class Basic_Example02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 사용할 변수 선언 & 초기화
		String name = "";
		int age = 0;
		
		
		System.out.println("이름: ");
		name = scan.next();
		System.out.println("나이: ");
		age = scan.nextInt();
		System.out.println("키: ");
		double height = scan.nextDouble();
		
		System.out.println(
				"이름은 " + name +
				"이고 나이는 " + age +
				"세, 키는 " + height +
				"Cm입니다."
				);
		scan.close();
		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("이름, 나이 키를 입력받아 출력하세요.");
//		String name = scan.next();
//		int age = scan.nextInt();
//		double height = scan.nextDouble();
//		
//		System.out.println("출력결과");
//		System.out.println("이름은 " + name + "이고 나이는 " + age + "세, 키는 " + height + "Cm입니다.");
//		
//		scan.close();
	}
}
