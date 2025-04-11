package chapter05.method;

import java.util.Scanner;

public class Method_Example {
	public static void main(String[] args) {
		// 구구단을 출력하는 메서드를 만드시오.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("단: ");
		int num = scan.nextInt();
//		timesTable();
//		methodEx();
		methodEx(num);
		scan.close();
	}

	public static void methodEx() {
		for (int i = 2; i <= 9; i++) {
			System.out.println("* [" + i + "] 단");
			methodEx(i);
			System.out.println();
		}
	}
	
	public static void methodEx(int number) {
		for (int i = 1; i <= 9; i++) {
			System.out.println(number + " x " + i + " = " + number * i);
		}
	}
	
	// 메서드
	public static void timesTable() {
		for (int i = 2; i < 10; i++) {
			System.out.println("* [" + i + "] 단");
			for (int j = 1; j < 10; j++) {
				System.out.println(j + " x " + i + " = " + j * i);
			}
		}
	}
}
