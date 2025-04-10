package chapter04.loop;

public class Loop_Example05 {
	public static void main(String[] args) {
		/**
		 * 1번			2번
		 * 1 0 0 0 0	1 2 3 4 5
		 * 0 2 0 0 0	2 3 4 5 6
		 * 0 0 3 0 0 	3 4 5 6 7
		 * 0 0 0 4 0	4 5 6 7 8
		 * 0 0 0 0 5	5 6 7 8 9
		 */
		
		System.out.println("1번");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				int num = 0;
				
				if (i == j) num = j + 1;
				System.out.print(num + " ");
			}
			System.out.println("");
		}
		
		System.out.println("2번");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(j + i + 1 + " ");
			}
			System.out.println();
		}
	}
}
