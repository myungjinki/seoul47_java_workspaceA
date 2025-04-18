package chapter06.class_part1;

public class Array_Example04 {
	public static void main(String[] args) {
/*
		임의의 배열 array를 역순으로 출력하시오.
		출력 결과:
			원래 배열 -> 브레드 월크 초코 소세지 치즈
			역순 배열 -> 
*/
		String[] foods = {"브레드", "윌크", "초코", "소세지", "치즈"};
		System.out.print("원래 배열 -> ");
		for (int i = 0; i < foods.length; i++) {			
			System.out.print(foods[i] + " ");
		}
		System.out.print("\n역순 배열 -> ");
		for (int i = foods.length-1; i >= 0; i--) {			
			System.out.print(foods[i] + " ");
		}
	}
}
