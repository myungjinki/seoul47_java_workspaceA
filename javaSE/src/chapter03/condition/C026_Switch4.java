package chapter03.condition;

public class C026_Switch4 {
	public static void main(String[] args) {
		// switch-case문 활용
		
		int score = 82;
		
		switch ( score / 10 ) {
		case 10: case 9:
			System.out.println("A"); break;
		case 8:
			System.out.println("B"); break;
		case 7:
			System.out.println("C"); break;
		case 6:
			System.out.println("D"); break;
		default:
			System.out.println("F"); break;
		}
	}
}
