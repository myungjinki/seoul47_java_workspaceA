package chapter03.condition;

public class C023_Switch {
	public static void main(String[] args) {
		// switch-case
		int ranking = 2;
		
		switch (ranking) {
		case 1:
			System.out.println("금메달");
			break;
		case 2:
			System.out.println("은메달");
			break;
		case 3:
			System.out.println("동메달");
			break;

		default:
			System.out.println("참가상");
			break;
		}
	}
}
