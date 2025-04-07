package chapter03.condition;

import java.util.Scanner;

public class Switch_Example01 {
	public static void main(String[] args) {
		/**
		 * 출생연도를 입력받아 띠를 출력한다.
		 * 띠는 12개이며, 연도를 12로 나누었을때의 나머지값에 따라
		 * 아래와 같이 구분된다.
		 * 
		 * 		원숭이	0		호랑이	6
		 * 		닭		1		토끼		7
		 * 		개		2		용		8
		 * 		돼지		3		뱀		9
		 * 		쥐		4		말		10
		 * 		소		5		양		11
		 * 
		 * 출력 결과 :
		 * 		연도를 입력하세요: 2001
		 * 		2001년생은 뱀띠입니다.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("연도를 입력하세요: ");
		int year = scan.nextInt();
		String chineseJodiacSign = "";
		
		switch (year % 12) {
			case 0 : chineseJodiacSign = "원숭이";	break;
			case 1 : chineseJodiacSign = "닭";		break;
			case 2 : chineseJodiacSign = "개";		break;
			case 3 : chineseJodiacSign = "돼지";		break;
			case 4 : chineseJodiacSign = "쥐";		break;
			case 5 : chineseJodiacSign = "소";		break;
			case 6 : chineseJodiacSign = "호랑이";	break;
			case 7 : chineseJodiacSign = "토끼";		break;
			case 8 : chineseJodiacSign = "용";		break;
			case 9 : chineseJodiacSign = "뱀";		break;
			case 10: chineseJodiacSign = "말";		break;
			case 11: chineseJodiacSign = "양";		break;
		}
		System.out.println(year + "년생은 " + chineseJodiacSign + "띠");
		
		scan.close();
	}
}
