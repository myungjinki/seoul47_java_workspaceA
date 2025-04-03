package chapter02.operator;

import java.util.Scanner;

public class C019_Operator5 {
	public static void main(String[] args) {
		// 조건 연산자 & 삼항 연산자
		// 조건식 ? 결과1 : 결과2
		int fatherAge = 45;
		int motherAge = 47;
		
		String ch = fatherAge > motherAge
					?
					"아빠가 연상"
					:
					"엄마가 연상";
		System.out.println(ch);
		
		// 입력을 통해서 출력되도록 위의 코드를 추가 작성하시오
		Scanner scan = new Scanner(System.in);
		
		System.out.print("아버지의 나이: ");
		int fa = scan.nextInt();
		System.out.print("어머니의 나이: ");
		int ma = scan.nextInt();
		
		String result = fa > ma
						?
						"아빠가 연상"
						:
						"엄마가 연상";
		System.out.println(result);
		scan.close();
	}
}
