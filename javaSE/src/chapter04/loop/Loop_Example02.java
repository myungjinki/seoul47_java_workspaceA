package chapter04.loop;

import java.util.Scanner;

public class Loop_Example02 {
	/**
	 * 정수 5개를 입력받아 그 합을 출력하시오
	 * 출력 결과 :
	 * 		정수 입력: 1
	 * 		정수 입력: 2
	 * 		정수 입력: 3
	 * 		정수 입력: 4
	 * 		정수 입력: 5
	 * 		15
	 */
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.print("정수 입력: ");
			int num = scan.nextInt(); 
			sum = sum + num;
		}
		System.out.println(sum);
	}
}
