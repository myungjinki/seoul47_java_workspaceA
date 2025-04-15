package chapter06.class_part1;

/**
 * 생성자(constructor)
 * 		- 클래스를 통해 생성되는 인스턴스의 초기화를 도와주는 메서드의 일종
 * 		- 클래스 내에 선언되며, 클래스의 이름과 같으며, 리턴타입이 없다
 * 		- 생성자도 오버로딩이 가능하므로 하나의 클래스에 여러 생성자가 존재 가능
 * 
 * 생성자 규칙
 * 		- 생성자는 이름이 클래스와 같다
 * 		- 클래스 생성시 생성자를 넣지 않아도 기본 생성자가 생성된다
 * 		- 부모클래스는 자식클래스보다 먼저 생성되어야 한다(상속)
 * 		- 리턴타입을 갖지 않는다
 * 		- 하나 이상의 생성자가 존재한다면 컴파일러가 기본생성자를 제공하지 않는다
 * 			> 해결방법
 * 				: 기본 생성자를 만들어 주던지
 * 				: 명시적 생성자를 이용 하던지
 * 
 */
class User {
	String name;
	int age;
	
	void userInfo() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
	}
	
	//기본 생성자
	public User() {
		
	}
	
	//명시적 생성자
	public User(String aName) {
		name = aName;
	}
	
	//명시적 생성자
	public User(String aName, int aAge) {
		name = aName;
		age = aAge;
	}
}

public class C046_constructor1 {
	public static void main(String[] args) {
		User user1 = new User();
		user1.userInfo();
		
		User user2 = new User("홍길동");
		user2.userInfo();
		
		User user3 = new User("이순신", 50);
		user3.userInfo();
	}
}
