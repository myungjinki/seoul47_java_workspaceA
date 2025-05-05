package chapter14.exception;

public class C124_throw3 {
	public static void main(String[] args) {
/*
		checked Exception : 컴파일러가 예외 처리를 강제하는 예외
		예외가 발생할 수 있는 메서드를 호출할 때, 해당 예외를 try-catch 블럭으로
		처리하거나, 메서드에 throws 키워드를 사용해 명시적으로 예외를 던져야 한다.
		ex. IOException, SQLException, Exception ...
 */
		String name = null;
		try {
			printLength(name);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void printLength(String name) throws Exception {
		if (name == null) {
			// 컴파일 시점인지 런타인 시점인지 정해야 함!!!!
			// Exception은 기본적으로 checked에 해당됨
			// checked exception은 try catch를 하도록 강제됨!!!!
			//
			throw new Exception("이름이 무효합니다.");
		}
		System.out.println(name.length());
	}
}
