package chapter02.operator;

import java.util.Scanner;

public class Oper_Example02 {
	public static void main(String[] args) {
		/**
		 * 과목 3개를 입력 받아 점수에 따른 합격여부를 출력한다.
		 * 합격조건 :
		 * 		1. 세 과목의 평균점수가 60점 이상일 것.
		 * 		2. 한 과목이라도 40점 미만일 경우 과락으로 불합격
		 * 출력결과 :
		 * 		국어: 80
		 * 		영어: 80
		 * 		수학: 35
		 * 		합격여부: false
		 */
		
		Scanner scan = new Scanner(System.in);
		int kor = 0;
		int eng = 0;
		int math = 0;
		double average = 0.0;
		boolean result = false;
		
		System.out.print("국어: ");
		kor = scan.nextInt();
		System.out.print("영어: ");
		eng = scan.nextInt();
		System.out.print("수학: ");
		math = scan.nextInt();
		
		average = (kor + eng + math) / 3;
		result = average >= 60
				&&
				kor >= 40
				&&
				eng >= 40
				&&
				math >= 40;
		System.out.print("합격여부: " + (result ? "합격" : "불합격"));
		
		scan.close();
	}
}
