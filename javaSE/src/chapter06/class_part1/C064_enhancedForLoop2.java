package chapter06.class_part1;

public class C064_enhancedForLoop2 {
	public static void main(String[] args) {
		int[][] score = {
			{ 77, 56, 70, 82 },
			{ 99, 96, 89, 88 },
			{ 81, 69, 62, 80 },
		};
		
		for (int[] student : score) {
			for (int subject : student) {
				System.out.print(subject + " ");
			}
			System.out.println();
		}
	}
}
