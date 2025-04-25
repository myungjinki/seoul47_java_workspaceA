package chapter07.inheritance;

class Animal {
	String name = "동물";
	void move() {
		System.out.println("움직이다");
	}
}
class Person extends Animal {
	@Override
	void move() {
		System.out.println("걷다");
	}
}

public class C076_is_a {
	public static void main(String[] args) {
/*
		is a relation
		상속 관계, 다중 상속X
		클래스 간의 계층적 관계
 */
		Animal a = new Animal();	// 동물은 동물이다
		a.move();
		Person b = new Person();	// 사람은 사람이다
		a.move();
		Animal c = new Person();	// 사람은 동물이다
		a.move();
//		Person d = new Animal();	// 동물은 사람이다????? -  err
		
	}
}
