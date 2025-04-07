package chapter03.condition;

import java.time.Year;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class If_Example05 {
	public static void main(String[] args) {
		/**
		 * 윤년 구하기
		 * (연도가 4로 나누어 떨어지고, 100으로는 나누어 떨어지지 않거나, 400으로 나누어 떨어지는 년도)
		 * 
		 * 연도를 입력받고 입력받은 연도가 평년인지 윤녀인지를 출력한다.
		 * 1. 연수가 4로 나누어 떨어지는 해는 윤년
		 * 2. 연수가 100으로 나누어 떨어지는 해는 평년
		 * 3. 연수가 400으로 나누어 떨어지는 해는 윤년
		 * * 4년마다 오고 100년마다는 아니지만 400년마다는 윤년이 된다.
		 * 
		 * 출력 결과 : 
		 * 		연도: 2024
		 * 		윤년
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("연도: ");
		int year = scan.nextInt();
		String result = "평년";
		
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {			
			result = "윤년";
		}
		
		System.out.println(result);
		
		// 윤년 구하는 메서드
		boolean isLeap = Year.isLeap(year);
		if (isLeap)
			System.out.println(year + "년은 윤년");
		else
			System.out.println(year + "년은 평년");
		
		GregorianCalendar gc = new GregorianCalendar();
		String result2 = gc.isLeapYear(year) ? "윤년" : "평년";
		System.out.println(result2);
	}
}
