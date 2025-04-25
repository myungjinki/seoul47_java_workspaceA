package chapter07.inheritance;

public class C073_overriding1 {
	public static void main(String[] args) {
/*
		메서드 오버라이딩 조건
		1. 상속관계에서만 가능
		2. 부모가 가지고 있는 메서드의 구조(파라미터 타입, 개수, 순서)가
		   동일해야하며, 메서드의 이름도 동일해야하고, 리턴타입도 동일해야 한다.
		3. 부모 <= 자식 범위의 접근제어자를 사용해야 한다.
 */
		class A {
			int num = 10;
			
			public void methodA() {
				System.out.println("A: " + num);
			}
		}
		
		class B extends A {
			int num = 100;
			
			@Override
			public void methodA() {
				System.out.println("B: " + this.num);
			}
		}
		
		// 다형적 변수
		A a = new A();
		A b = new B();
		B c = new B();
		
		// 변수는 컴파일 시점에 값이 결정(정적 바인딩) - 데이터 타입에 한정
		// 메서드의 호출은 런타임 시점에 결정(동적 바인딩) - 생성 타입에 한정
		System.out.println(a.num);
		System.out.println(b.num); // <---- ?!?!!?
		System.out.println(c.num);
		
		// 동적 바인딩
		a.methodA();
		b.methodA(); // <--- ?!?!?!
		c.methodA();
	}
}
