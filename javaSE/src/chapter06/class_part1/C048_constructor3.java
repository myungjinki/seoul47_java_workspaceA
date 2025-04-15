package chapter06.class_part1;

/*
	클래스 변수 : 클래스가 처음 로딩될 때 단 한번 초기화
	인스턴스 변수 : 인스턴스가 생성될 때마다 각 인스턴스별로 초기화
	클래스 변수의 초기화 순서 : 기본값 > 명시적 초기화 > 클래스 초기화 블럭
	인스턴스 변수의 초기화 순서 : 기본값 > 명시적 초기화
								> 인스턴스 초기화 블럭 > 생성자
	
		- 기본값: ex. 숫자형 변수는 0, boolean은 false
					객체 참조 변수는 null로 자동 초기화
	static 영역에 할당된 메모리는 모든 객체가 공유하며 하나의 멤버를
	어디서든 참조할 수 있는 장점을 가지지만 Garbage Collector의
	관리 영역 밖에 존재하기에 static 영역에 있는 멤버들은
	프로그램 종료시까지 메모리가 할당된 채로 존재한다.
	남발하면 시스템 성능에 악영향을 줄 수 있다.
 */
class Product {
	static int count = 0;	// 생성된 인스턴스의 수를 저장하기 위한 변수
	int serialNo;			// 인스턴스 고유 번호
	
	static String productName;	// 클래스 변수(클래스 초기화)
	int num = 1;				// 인스턴스 변수(명시적 초기화)
	
	// 클래스 초기화 블럭
	static {
		productName = "SCIT47";
		System.out.println("static: " + productName);
		System.out.println("클래스 초기화 블럭 실행");
	}
	
	// 인스턴스 초기화 블럭
	{
		count++;
		serialNo = count;
		System.out.println("인스턴스 초기화 블럭");
	}
	
	// 기본생성자
	public Product() {
		num++;
		System.out.println("기본 생성자 실행");
	}

}

public class C048_constructor3 {
	public static void main(String[] args) {
		
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1의 제품번호(serialNo는) "
				+ p1.serialNo);
		System.out.println("p2의 제품번호(serialNo는) "
				+ p2.serialNo);
		System.out.println("p3의 제품번호(serialNo는) "
				+ p3.serialNo);
		System.out.println("생산된 제품의 수는 모두 "
				+ Product.count + "개 입니다.");
		
//		System.out.println(p1.productName); // 경고: 굳이
		System.out.println(Product.productName);
	}
}
