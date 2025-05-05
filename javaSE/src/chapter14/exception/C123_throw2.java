package chapter14.exception;

public class C123_throw2 {
	public static void main(String[] args) {
		String name = null;
		
		try {			
			System.out.println(1);
			printLength(name);
			System.out.println(2);
		} catch (NullPointerException e) {
			System.out.println( e.getMessage() );
		}
		
		System.out.println("프로그램 실행 완료");
	}
	
	static void printLength(String name) {
		if (name == null) {
			// throw : 예외를 발생시키는 키워드
			throw new NullPointerException("이름이 무효입니다.");
		}
		System.out.println(name.length());
	}
}
