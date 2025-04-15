package chapter06.class_part1;
/*
	접근 지정자(접근 제어자)
	클래스, 메서드, 변수 등에 대한 접근 범위를 지정하여 외부로부터 접근 제어
	 - public :
	 		클래스 = 같은 클래스, 같은 패키지, 다른 패키지에서 접근 가능
	 		메서드/변수 = 같은 클래스, 같은 패키지, 다른 패키지의
	 			모든 클래스에서 접근 가능
	 - protected:
	 		클래스 = 클래스에는 사용할 수 없음
	 		메서드/변수 = 같으 클래스, 같은 패키지,
	 			상속관계(다른 패키지의 하위 클래스에서 접근 가능)의
	 			클래스에서만 접근 가능
	 - default:
	 		클래스 = (아무 접근 지정자를 명시하지 않을 경우)
	 		메서드/변수 = 같은 클래스와 같은 패키지에서만 접근 가능
	 - private:
	 		클래스 = 클래스에는 사용할 수 없음
	 		메서드/변수 = 같은 클래스에서만 사용 가능
 */
class UserTest {
	public	String id = "홍길동";
	private	String pw = "1111";	// UserTest 내부에서만 사용 가능
	
	public String pwCheck() {
		return this.pw;
	}
}

public class C049_accessor1 {
	public static void main(String[] args) {
		UserTest user = new UserTest();
		System.out.println("id: " + user.id);
//		System.out.println("pw: " + user.pw); // 접근 불
		System.out.println("pw: " + user.pwCheck());
		
		System.out.println("=== 변경 후 ===");
		user.id = "이순신";
//		user.pw = "1234";	// 접근 범위 벗어나는 에러
		System.out.println("id: " + user.id);
		System.out.println("pw: " + user.pwCheck());
	}
}
