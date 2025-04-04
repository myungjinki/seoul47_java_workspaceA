package chapter03.condition;	// 패키지 이름

public class C020_If1 {	// 클래스 이름
	public static void main(String[] args) {
		// if
		int age = 15;
		
		if (age >= 19) {
			System.out.println("성인입니다.");
		}
		
		// if - else
		if (age >= 19) {
			System.out.println("성인입니다.");
		} else {	// age < 19
			System.out.println("어린이입니다.");
		}
		
		// if - else if - else
		if (age >= 19) {
			System.out.println("성인입니다.");
		} else if (age > 12) {
			// 12 < age < 19		틀린 표현식
			// 12 < age && age < 19	올바른 표현
			System.out.println("청소년입니다.");
		} else {	// age < 19
			System.out.println("어린이입니다.");
		}

	}
}
