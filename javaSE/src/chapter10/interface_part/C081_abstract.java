package chapter10.interface_part;

public class C081_abstract {
	public static void main(String[] args) {
//		Animal animal = new Animal("동물"); // err
		Animal a = new Human("사람");
		Animal b = new Tiger("호랑이");
		Animal c = new Eagle("독수리");
		
		a.alive();
		a.move();
		b.move();
		c.move();
	}
}

//추상 클래스
// 추상 클래스도 일반 클래스와 마찬가지로 변수, 생성자, 메서드 선언 가능
// new 키워드를 통해 직접 생성자를 호출할 수는 없지만 자식 객체가 생성될 때
// super(..)를 호출하여 추상 클래스의 멤버를 초기화하므로
// 추상 클래스도 생성자가 필요하다.
abstract class Animal {
	String name;
	Animal (String name) {
		this.name = name;
	}
	
	void alive() {
		System.out.println("생물");
	}
	//추상 메서드
	abstract void move();
}

class Human extends Animal {
	Human(String name) {
		super(name);
	}
	@Override
	void move() {
		System.out.println("두 발로 걷다");
	}
}
class Tiger extends Animal {
	Tiger(String name) {
		super(name);
	}
	@Override
	void move() {
		System.out.println("네 발로 뛰다");
	}	
}
class Eagle extends Animal {
	Eagle(String name) {
		super(name);
	}
	@Override
	void move() {
		System.out.println("네 발로 뛰다");
	}	
}