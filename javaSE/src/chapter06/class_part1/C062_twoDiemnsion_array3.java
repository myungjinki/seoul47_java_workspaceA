package chapter06.class_part1;

public class C062_twoDiemnsion_array3 {
	public static void main(String[] args) {
		int[][] score = {
				{ 77, 56, 70, 82, 95, 96, 98, 100 },
				{ 99, 96 },
				{ 81, 69, 62, 80 },
		};
		
		for (int i = 0; i < score.length; i++) {
			System.out.print((i+1) + "번 학생의 성적: ");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + " ");
			}
			System.out.println();
		}
	}
}
