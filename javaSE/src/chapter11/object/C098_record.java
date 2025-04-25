package chapter11.object;

/*
		record
		  - 불변(immutable) 겍체를 쉽게 만드는 간결한 클래스
		 
		 특징
		   - 모든 필드는 자동으로 final
		   - 모든 필드를 포함하는 생성자 자동 생성
		   - getter 메서드 자동 생성
		   - equals(), hashcode(), toString() 자동 생성
		   - 상속 불가(final), abstract 선언 불가
		   - 다른 클래스 상속 불가(extends X),
		     인터페이스 구현 가능(implements O)
 */

// 단점은 수정할 수 없다.
// 데이터를 받아서 이동하는 용도로 사용
// Java DTO

class A {}
interface B {}

//record Member(String name, int memberCode) extends A {} // err 상속불가
//record Member(String name, int memberCode) implements A {} // 가능은 함
record Member(String name, int memberCode) implements B {
	// 사용자가 정의 생성자
	public Member(int memberCode) {
		this("홍길동", memberCode);
	}
}


public class C098_record {

	public static void main(String[] args) {
		Member m = new Member("홍길동", 101010);
		System.out.println(m);
		System.out.println(m.name());
		System.out.println(m.memberCode());
	}
}
