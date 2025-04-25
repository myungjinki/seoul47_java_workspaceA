package chapter09.polymorphism;

class Dog extends Animal {
	void bark() { System.out.println("멍멍"); }
}
class Dove extends Animal {
	void fly() { System.out.println("퍼득"); }
}

public class C080_instanceof {
	public static void main(String[] args) {
		Dog a = new Dog();
		a.move();
		a.bark();
		
		Animal b = new Dog();
		b.move();
//		b.bark(); // err!!!!!!!!!!
		
		Animal c = new Dove();
		c.move();
//		c.fly(); // err!!!!!!!!!!
		
		testAnimal(b);	// 강아지타입 인스턴스
		testAnimal(c);  // 비둘기타입 인스턴스
		
		Animal d = new Animal();
		System.out.println("============");
		System.out.println( b instanceof Animal );
		System.out.println( b instanceof Dog );
		System.out.println( c instanceof Animal );
		System.out.println( c instanceof Dove );
		System.out.println( d instanceof Dog );
		System.out.println( d instanceof Dove );
	}
	
	static void testAnimal(Animal animal) {
		animal.move();
//		animal.bark(); // animal이 무엇일지 모르므로 에러!!!
//		animal.fly();
		
		//파라미터가 Dove 타입일 경우 에러
//		Dog mydog = (Dog) animal; // Dove가 오면 에러!!!!
//		mydog.bark();
		
		// 정석 방법!!!
		if (animal instanceof Dog) {
			Dog mydog = (Dog) animal;
			mydog.bark();
		}
		if (animal instanceof Dove) {
			Dove mydove = (Dove) animal;
			mydove.fly();
		}
		// 패턴 매칭
		// 새로운 문법 추가!!!
		// 매우 유용!!!
		if (animal instanceof Dog mydog) {
			mydog.bark();
		}
		if (animal instanceof Dove mydove) {
			mydove.fly();
		}
	}
}
