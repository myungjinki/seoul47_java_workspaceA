package chapter06.class_part1;

public class C057_array2 {
	public static void main(String[] args) {
		
		// 선언 후 할당
		int[] score = new int[5];
		score[0] = 88;
		score[1] = 99;
		score[2] = 70;
		score[3] = 55;
		score[4] = 100;
		
		for (int i = 0; i < score.length; i++) {
			System.out.println((i+1) + "번 학생의 성적: "
					+ score[i]);
		}
	}
}
