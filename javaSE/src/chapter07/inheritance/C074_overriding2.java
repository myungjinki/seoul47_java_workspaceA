package chapter07.inheritance;

class Human2 {
	int age;
	String name;
	
	Human2(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	void intro() {
		System.out.println("안녕, " + age + "살 "
				+ name + "이야");
	}
}

class Student2 extends Human2 {
	int stnum;
	String major;
	
	Student2(int age, String name, int stnum, String major) {
		super(age, name);
		this.stnum = stnum;
		this.major = major;
	}
	
	// 부모로부터 물려받은 메서드의 "행동"을 자식클래스에 맞게 "변경"하기 위해서
	@Override
	void intro() {		
		System.out.println(major + "학과 " + stnum + "학번 "
				+ name + "입니다.");
	}
	
	void study() {
		System.out.println("하늘천 따지 검을현 누를황");
	}
}

public class C074_overriding2 {
	public static void main(String[] args) {
		Human2 kim = new Human2(29, "김상형");
		kim.intro();
		
		Student2 lee = new Student2(42, "이승우", 123214, "경영");
		lee.intro();
		lee.study();
		
		Human2 park = new Student2(33, "박장군", 143244, "컴공");
		System.out.println(park.name);
//		System.out.println(park.stnum); <- 변수는 데이터 타입을 따라가므로 에
		park.intro();
//		park.study(); // ERR!!!　학생이 사람으로 한정되어 버렸다!!!
		
		// 타입 캐스팅을 하면 사용가능!!!!!!!!
		Student2 casting = (Student2) park;
		casting.study();
	}
}
