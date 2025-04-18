package chapter06.class_part1;

public class C063_enhancedForLoop1 {
	public static void main(String[] args) {
		// enhanced for문 or for-each문
		int[] score = { 88, 94, 72, 75, 23 };
		int sum = 0;
		for (int i : score) {
			sum += i;
		}
		System.out.println("총점: " + sum);
		System.out.println("평균: " + (float) sum / score.length);
		
		// 요소 i는 배열 요소의 사본일 뿐 원본에 영향을 주지 않는다
		// foreach문은 읽기 전용 반복문
		int[] score2 = { 88, 94, 72, 75, 23 };
		for (int i : score2) {
			i++;
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("score2[0] = " + score2[0]);
	}
}
