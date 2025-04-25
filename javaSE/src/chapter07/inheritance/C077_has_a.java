package chapter07.inheritance;

public class C077_has_a {
	public static void main(String[] args) {
/*
		has a relation
		포함, 구성 관계
 */
		Human4 h = new Human4("파이어스틸");
		System.out.println(h.tool.name);
		h.use();
	}
}

class Human4 {
	Tool tool;
	Human4(String toolName) {
		tool = new Tool(toolName);
	}
	void use() {
		System.out.println(tool.name + "을/를 사용하다");
	}
}
class Tool {
	String name;
	Tool(String name) {
		this.name = name;
	}
}

// 1. Association (연관 관계)
// 학생과 강의 관의 관계일때,
// 학생은 여러 강의를 들을 수 있고
// 강의는 여러 학생들이 들을 수 있다
// 서로 가질 수 있다!!!!!!!!!!!!!
class Student3 {
	private Course course;
}
class Course {
	private Student3 student;
}

// 2. Aggregation (집합 관계) - 약한 소유권
// 자동차와 엔진 간의 관계에서
// 자동차는 엔진을 포함할 수 있지만 엔진이 자동차에 속해 있다 해도
// 자동차가 사라진다고 엔진도 사라지지 않는다.
// 위의 Human4는 Tool이 고장나면 Human4 코드에 Tool을 수정해야 하지만
// Car는 생성자 호출 시 Engine만 교체하면 된다!!!!!!
// JDBC??
// Spring에서 배울 것
class Car {
	private Engine engine;
	
	public Car(Engine engine) {
		this.engine = engine;
	}
	public void assembleCar(Engine engine) { // <- 이것으로 엔진 교
		this.engine = engine;
	}
}
class Engine { }

// 3. Composition (구성 관계) - 강한 소유권
// 집과 방 간의 관계에서, 
// 집이 방을 포함하며 집이 없으면 방도 존재할 수 없다.
class House {
	private Room rooms = new Room();
}
class Room { }














