package chapter03.condition;

public class C021_If2 {
	public static void main(String[] args) {
		// if block
		
		int age = 12;
				
		if (age >= 19) {
			System.out.println("성인입니다.");
			System.out.println("술집 입장.");
		}
		
		System.out.println("=========");
		
		// if문은 { }가 없어도 명령어 1줄은 인정함
		if (age >= 19)
			System.out.println("성인입니다.");
			System.out.println("술집 입장.");
	}
}
