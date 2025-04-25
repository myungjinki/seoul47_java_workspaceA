package chapter11.object;

public class C090_clone {
	public static void main(String[] args) {
		// clone() : Java의 객체 복사 메서드
		// 객체의 필드 값을 복사하여 새로운 개체를 생성하는데 사
		Human kim = new Human(29, "김상형");
		Human kim2 = (Human) kim.clone();
		
		kim2.name = "이순신";
		System.out.println(kim.hashCode());
		System.out.println(kim2.hashCode());
		System.out.println("kim.name: " + kim.name);
		System.out.println("kim2.name: " + kim2.name);
		
		kim2.score[0] = 999;
		System.out.println("kim.score[0]: " + kim.score[0]);
		System.out.println("kim.score 주소: " + kim.score);
		System.out.println("kim2.score[0]: " + kim2.score[0]);
		System.out.println("kim2.score 주소: " + kim2.score);
	}
}
