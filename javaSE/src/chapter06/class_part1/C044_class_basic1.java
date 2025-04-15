package chapter06.class_part1;

// 클래스 정의
class Car {
	// 멤버 변수
	String name;
	boolean gasoline;
	
	// 멤버 메서드
	void run() {
		if (gasoline) {
			System.out.println("부릉 부릉");
		} else {
			System.out.println("덜컹 덜컹");
		}
	}
	
	void stop() {
		System.out.println("끼익");
	}
	
	// 생성자
	public Car( ) {
		System.out.println("기본 생성자 호출");
	}
}

public class C044_class_basic1 {
	
	public static void main(String[] args) {
		Car korando = new Car();
		korando.name = "코란도C";
		korando.gasoline = false;
		System.out.print( korando.name + " : ");
		korando.run();
		
		Car equus = new Car();
		equus.name = "에쿠스";
		equus.gasoline = true;
		System.out.print( equus.name + " : ");
		equus.run();
		equus.stop();
		
	}
}
