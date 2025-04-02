package chapter00.basic;

import java.util.Scanner;

public class Basic_Example01 {
	public static void main(String[] args) {
		// 스캐너 클래스 불러오기 & 생성
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		System.out.println("정수를 입력해 주세요: ");
		num = scan.nextInt();
		System.out.println("입력한 정수: ");
		System.out.println(num);
		
		// 실수를 입력받고 출력
		double dNum = 0.0;
		System.out.println("실수를 입력해 주세요: ");
		dNum = scan.nextDouble();
		System.out.println("입력한 실수: ");
		System.out.println(dNum);
		
		// 문자열
		String text = "";
		System.out.println("문자열을 입력해 주세요: ");
		text = scan.next();
		System.out.println(text);
		
		
		scan.close();
	}
}
