package chapter07.inheritance;

class AA {
	final static double PI = 3.14;
	
	void method() {
		System.out.println("method");
	}
	
	final void finalMethod() {
		System.out.println("final method");
	}
}

final class BB extends AA {
	@Override
	void method() {
		super.method();
		System.out.println("method BB");
	}
	
//	final 메소드는 오버라이딩 할 수 없다!
//	@Override
//	final void finalMethod() {
//		System.out.println("method BB");
//	}
}

//class CC extends BB { // final BB는 상속할 수 없음!!!
//	
//}

public class C075_final {
	public static void main(String[] args) {
/**
		final
		  - final 변수 : 상수, 값 변경 불가
		  - final 메서드 : Override 불가
		  - final 클래스 : 상속 불가
 */
		AA aa = new AA();
		AA ab = new BB();
		BB bb = new BB();
		
		System.out.println(aa.PI);
		System.out.println(ab.PI);
		System.out.println(bb.PI);
//		aa.PI = 3.14241254;		//err
		
		aa.method();
		aa.finalMethod();
		ab.method();
		ab.finalMethod();
		bb.method();
		bb.finalMethod();
	}
}
