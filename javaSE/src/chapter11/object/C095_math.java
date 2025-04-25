package chapter11.object;

public class C095_math {
	public static void main(String[] args) {
		System.out.println("=== Math 상수 ===");
		System.out.println("Math.E = " + Math.E);
		System.out.println("Math.PI = " + Math.PI);
//		=== Math 상수 ===
//		Math.E = 2.718281828459045
//		Math.PI = 3.141592653589793
		
		System.out.println("=== Math.floor() - 버림(내림) ===");
		System.out.println("Math.floor(1.6) = " + Math.floor(1.6));
		System.out.println("Math.floor(-1.6) = " + Math.floor(-1.6));
//		=== Math.floor() - 버림(내림) ===
//		Math.floor(1.6) = 1.0
//		Math.floor(-1.6) = -2.0
		
		System.out.println("=== Math.ceil() - 올림 ===");
		System.out.println("Math.ceil(1.6) = " + Math.ceil(1.6));
		System.out.println("Math.ceil(-1.6) = " + Math.ceil(-1.6));
//		=== Math.ceil() - 올림 ===
//		Math.ceil(1.6) = 2.0
//		Math.ceil(-1.6) = -1.0
		
		System.out.println("=== Math.round() - 반올림 ===");
		System.out.println("Math.round(1.6) = " + Math.round(1.6));
		System.out.println("Math.round(1.4) = " + Math.round(1.4));
//		=== Math.round() - 반올림 ===
//		Math.round(1.6) = 2
//		Math.round(1.4) = 1
		
		System.out.println("=== Math.abs() - 절대값 ===");
		System.out.println("Math.abs(-5) = " + Math.abs(-5));
		System.out.println("Math.abs(5) = " + Math.abs(5));
//		=== Math.abs() - 절대값 ===
//		Math.abs(-5) = 2
//		Math.abs(-5) = 2
		
		System.out.println("=== Math.max(), Math.min() - 최대, 최소값 ===");
		System.out.println("Math.max(10, 20) = " + Math.max(10, 20));
		System.out.println("Math.min(10, 20) = " + Math.min(10, 20));
//		=== Math.max(), Math.min() - 최대, 최소값 ===
//		Math.max(10, 20) = 20
//		Math.min(10, 20) = 10
		
		System.out.println("=== Math.pow(), Math.sqrt() - 제곱, 제곱근 ===");
		System.out.println("Math.pow(2, 3) = " + Math.pow(2, 3));
		System.out.println("Math.sqrt(4) = " + Math.sqrt(4));
//		=== Math.pow(), Math.sqrt() - 제곱, 제곱근 ===
//		Math.pow(2, 3) = 8.0
//		Math.sqrt(4) = 2.0
	}
}
