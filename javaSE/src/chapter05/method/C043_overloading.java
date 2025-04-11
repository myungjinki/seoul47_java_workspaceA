package chapter05.method;

public class C043_overloading {
	public static void main(String[] args) {
		/**
		 * 오버로딩(Overloading) - ex. print 메서드
		 * 하나의 이름으로 여러 처리를 한다. (다형성)
		 * 1. 메서드의 이름이 같아야 한다.
		 * 2. 파라미터 개수가 달라야 한다.
		 * 3. 파라미터 타입이 달라야 한다.
		 * 4. 파라미터 순서가 달라야 한다.
		 */
		
		methodTest(5);
		methodTest(5, 3.14);
		methodTest(3.14, 5);
		System.out.println( methodTest(3, 5) );
		System.out.println( methodTest(3.4, 5.6) );
	}
	
	static void methodTest(int a) {
		System.out.println(a);
	}
	
	// 파라미터 개수 차이
	static void methodTest(int a, double b) {
		System.out.println(a + b);
	}
	
	// 파라미터 순서 차이
	static void methodTest(double a, int b) {
		System.out.println(a * b);
	}
	
	// 파라미터 타입 차이
	static int methodTest(int a, int b) {
		if (a > b)	return a;
		else		return b;
	}
	
	// 파라미터 타입 차이
	static double methodTest(double a, double b) {
		if (a > b)	return a;
		else		return b;		
	}
}
