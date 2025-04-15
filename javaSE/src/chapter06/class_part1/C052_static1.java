package chapter06.class_part1;

class Test1 {
	// 인스턴스 변수, 멤버 변수
	// 인스턴스를 만들 때마다 생성되는 변수
	private String name1 = "홍길동";
	// 정적 멤버 변수
	// 모든 인스턴스가 가지는 변수이며 인스턴스를 처음 만들 때에만 생성됨
	// static final을 같이 주로 사용
	public static final String name2 = "고길동";
	
	public void printName() {
		System.out.println(this.name1);
	}
}

public class C052_static1 {
	public static void main(String[] args) {
		Test1 ex = new Test1();
//		System.out.println(ex.name1); // private
		ex.printName();
//		System.out.println(ex.name2); // warning
		
		// 정적 멤버 변수는 인스턴스의 생성없이 클래스의 이름으로 호출 가능
		System.out.println(Test1.name2);
	}
}
