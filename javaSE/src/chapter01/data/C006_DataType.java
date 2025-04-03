package chapter01.data;

public class C006_DataType {
	public static void main(String[] args) {
		/**
		 * 들여쓰기 Tab, 내어쓰기 Shift + Tab
		 * 
		 * [데이터 타입]
		 * 1. 기본형 데이터타입
		 * - 정수형 byte(1), short(2), int(4), long(8)
		 * - 실수형 float(4), double(8)
		 * - 논리형 boolean(1)
		 * 2. 참조형 데이터타입
		 * - 기본형 데이터타입이 아닌 모든 "객체"
		 * - class, enum, array, interface ...
		 */
		
		byte a = 127; // 128은 err
		short b = 12345;
		int c = 1234567890;
		long d = 12345678900L; // l or L
		char e = 'A';
		float f = 3.14F; // f or F
		double g = 3.14;
		boolean h = true;
		
		String s = "안녕하세요";
		String n = null; // 참조형 데이터타입에서만 사용 가능!!!!!!!!
		
		var v1 = 'B'; // Java 10
		var v2 = 123;
		
		System.out.println("byte	: " + a);
		System.out.println("short	: " + b);
		System.out.println("int	: " + c);
		System.out.println("long	: " + d);
		System.out.println("char	: " + e);
		System.out.println("float	: " + f);
		System.out.println("double	: " + g);
		System.out.println("boolean	: " + h);
		System.out.println("string	: " + s);
		System.out.println("null	: " + n);
		System.out.println("var1	: " + v1);
		System.out.println("var2	: " + v2);
		
		System.out.println("======================");
		
		
		// 문자형 타입의 정수화
		char alpha = 'A';
		System.out.println(alpha);
		System.out.println( (int) alpha );
		
		// 정수형 타입의 문자화
		int beta = 67;
		System.out.println(beta);
		System.out.println( (char) beta );
		
		System.out.println( (char) (beta + 1) );
	}
}
