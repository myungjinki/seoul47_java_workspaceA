package chapter07.inheritance;

class Human {
	int age;
	String name;
	
	Human(int age, String name) {
		System.out.println("== Human 생성자 ==");
		this.age = age;
		this.name = name;
	}
	
	void intro() {
		System.out.printf("안녕, %d살 %s라고 해.\n", age, name);
	}
}

class Student extends Human {
	int stnum;
	String major;
	
	Student(int age, String name, int stnum, String major) {
		super(age, name);
		System.out.println("== Student 생성자 ==");
		this.stnum = stnum;
		this.major = major;
	}
	
	void study() {
		System.out.printf("이름: %s, 학번: %d, 전공: %s", super.name, stnum, major);
	}
}
class Graduate extends Student {
	String thesis;
	
	Graduate(int age, String name
			, int stnum, String major
			, String thesis) {
		super(age, name, stnum, major);
		System.out.println("== Graduate 생성자 ==");
		this.thesis = thesis;
	}
	
	void research() {
		System.out.printf("논문: %s, 저자: %s \n"
				, thesis, super.name);
	}
}



public class C072_super {
	public static void main(String[] args) {
		Human kim = new Human(29, "김상형");
		kim.intro();
		
		Student lee = new Student(42, "이승우", 9312345, "경영");
		lee.intro();
		lee.study();
		
		Graduate park = new Graduate(35, "박대희"
						, 950011213, "전산"
						, "웹 보안에 대한 연구");
		park.intro();
		park.study();
		park.research();
	}
}
