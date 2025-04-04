package chapter03.condition;

public class C027_SwitchExpression {
	// switch 표현식
	// Java 17
	public static void main(String[] args) {		
		int ranking = 1;
		String medal = switch (ranking) {
							case 1 -> {
								System.out.println("우승울 축하합니다.");
								yield "금메달";
							}
							case 2 -> "은메달";
							case 3 -> "동메달";
							case 4, 5 -> "장려상";
							default -> "참가상";
						};
		System.out.println(medal + "을 수여합니다.");
	}
}
