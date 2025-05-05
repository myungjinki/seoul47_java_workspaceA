package chapter14.exception;

public class C122_throw1 {
	public static void main(String[] args) {
		// NullPointerException은 일반적인 런타임 예외 클래스
//		String name = "빌게이츠";
		String name = null;
		printLength(name);
	}
	
	static void printLength(String name) {
		try {			
			System.out.println(name.length());
		} catch (NullPointerException e) {
			System.out.println("이름이 무효입니다.");
		}
	}
}
