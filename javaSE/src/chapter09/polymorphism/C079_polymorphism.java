package chapter09.polymorphism;

class Rabbit extends Animal {
	@Override
	void move() { System.out.println("껑충"); }
}
class Cat extends Animal {
	@Override
	void move() { System.out.println("사뿐"); }
}

public class C079_polymorphism {
	public static void main(String[] args) {
		Animal animal1 = new Rabbit();
		Animal animal2 = new Cat();
		animal1.move();
		animal2.move();
		
		System.out.println("=====");
		Animal[] animals = { new Rabbit(), new Cat()
							, new Tiger() };
		
		for (Animal a: animals) {
			a.move();
		}
	}
}
