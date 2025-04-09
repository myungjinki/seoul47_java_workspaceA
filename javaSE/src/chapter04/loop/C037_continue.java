package chapter04.loop;

public class C037_continue {
	public static void main(String[] args) {
		// continue (skip, 증감식으로 바로 감)
		for (int i = 1; i <= 10; i++) {
			System.out.println("반복 회차: " + i);
			if (i == 7) {
				continue;
			}
			System.out.println("반복 회차: " + i);
		}
		
		// 1~100 짝수의 합 구하기
		int sum = 0;
		for (int i = 0; i <= 100; i = i + 2) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		int sum2 = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 2 != 0)
				continue;
			sum2 += i;
		}
		System.out.println(sum2);
		
		// 1 ~ 100짝수구하기 (while, do-while)
		
		int num = 2;
		int sum3 = 0;
		while (num <= 100) {
			if (num % 2 == 0)
				sum3 += num;
			num++;
		}
		System.out.println(sum3);
		
		int num2 = 2;
		int sum4 = 0;
		do  {
			if (num2 % 2 != 0)
				continue;
			sum4 += num2;
			num2 += 2;
		} while (num2 <= 100); 
		System.out.println(sum4);
	}
}
