package chapter06.class_part1;

public class C059_array4 {
	public static void main(String[] args) {
		
		int[] score = { 88, 94, 72, 85, 23 };
		
		// 총점, 평균
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		System.out.println(sum);
		System.out.println((double)sum / score.length);
		
	}
}
