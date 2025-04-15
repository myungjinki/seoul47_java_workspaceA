package chapter06.class_part1;

public class C053_static2 {
	// 정적 메서드, 멤버 메서
	public static int add(int x, int y) {
		return x + y;
	}
	// 인스턴스 메서드, 멤버 메서드
	public int minus(int x, int y) {
		return x - y;
	}
	
	public static void main(String[] args) {
		// static 메서드이므로 객체 생성없이 클래스의 이름으로 호출 가능
//		C053_static2.add(1,2);
		int sum = add(1, 2);
		System.out.println(sum);
		
		
		// static 메서드가 아니므로 객체 생성 후에 사용 가능
//		C053_static2.minus(2, 1); // err
		C053_static2 cal = new C053_static2();
		int sum2 = cal.minus(21, 2);
		System.out.println(sum2);
//		int sum3 = cal.add(2, 5); // Warning
//		System.out.println(sum3);
	}
}
