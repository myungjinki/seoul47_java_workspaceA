package chapter05.method;

public class C042_moethod_valueCheck {
	public static void main(String[] args) {
		// Call by Value vs Call by Reference
		int num = 2;
		getDouble(num);
		System.out.println("num = " + num);
		
		int result = getDouble(num);
		System.out.println("result = " + result);
		
		int[] arr = { 2, 8, 6 };
		System.out.println(arr);
		getDouble2(arr);
		System.out.println(arr[0]);
	}
	
	// Call by Value (값에 의한 호출)
	// 메서드에 값을 전달할 때, 변수의 실제 값이 복사되어 전달됨
	// 기본형 데이터타입(int, double, ...)은 Call by Value 방식으로 전달
	// 메서드 내부에서 값이 변경되어도 원본 변수에는 영향을 주지 않음
	static int getDouble(int value) {
		value *= 2;
		return value;
	}
	
	// Call by Reference (참조에 의한 호출)
	// 객체를 전달할 때, "참조값" 복사되어 전달
	// 객체 내부 값은 변경될 수 있지만, 참조 자체를 변경하면 원본에 영향 미치지 않음
	static void getDouble2(int[] value) {
		value[0] *= 2;
		
	}
}
