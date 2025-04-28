package chapter12.generic;

/*
	타입 한정 키워드 extends
	<T extends [제한 타입]>
*/
class Calculator<T extends Number> {
	void add(T a, T b) {}
	void min(T a, T b) {}
	void mul(T a, T b) {}
	void div(T a, T b) {}
}

public class C104_generic_range1 {
	public static void main(String[] args) {
		// Number
		Calculator<Number>	call1 = new Calculator<>();
		Calculator<Integer>	call2 = new Calculator<>();
		Calculator<Double>	call3 = new Calculator<>();
		
		//
//		Calculator<Object>	cal4 = new Calculator<>(); // error <- extends로 제한했기때문에 에
//		Calculator<String>	cal5 = new Calculator<>(); // error <- extends로 제한했기때문에 에
	}
}
