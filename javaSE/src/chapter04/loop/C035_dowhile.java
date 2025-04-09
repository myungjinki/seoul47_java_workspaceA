package chapter04.loop;

import java.util.Scanner;

public class C035_dowhile {
	public static void main(String[] args) {
		// do-while
		Scanner scan = new Scanner(System.in);
		int num;
		int sum = 0;
		do {
			System.out.println("숫자를 입력하세요(끝낼 때 0): ");
			num = scan.nextInt();
			sum = sum + num;
		} while (num != 0);
		System.out.println("총 합계: " + sum);
		scan.close();
	}
}
