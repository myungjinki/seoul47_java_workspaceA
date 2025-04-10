package chapter04.loop;

public class Loop_Example07 {
	public static void main(String[] args) {
		/**
		 * 1번			2번
		 * *			* * * * *
		 * * *			* * * *
		 * * * *		* * * 
		 * * * * *		* *
		 * * * * * *	*
		 */
		
		System.out.println("1번");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j < 5 - i - 1) {
					System.out.print("  ");
				} else {					
					System.out.print("* ");
				}
			}
			System.out.println("");
		}
		//3-3
		for (int i = 1; i <= 5; i++) {
			System.out.print(" ".repeat(5-i));
			System.out.println("*".repeat(i));
		}
		
		//3-4
		/**
		 * printf 출력서식 (자바 1.5이상)
		 * %b : boolean 형식으로 출력
		 * %d : 정수 형식으로 출력
		 * %f : 소수점 형식으로 출력
		 * %c : 문자형식으로 출력
		 * %s : 문자열 형식으로 출력
		 */
		for (int i = 1; i <= 5; i++) {
			System.out.printf("%5s%n", "*".repeat(i));
		}
		
		System.out.println();
		System.out.println("2번");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j < i) {
					System.out.print("  ");
				} else {					
					System.out.print("* ");
				}
			}
			System.out.println("");
		}
	}
}
