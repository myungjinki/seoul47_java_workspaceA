package chapter06.class_part1;

class Student {
	public static int serialNum;
	private int studentID;
	public String studentName;
	
	// 정적 초기화 블럭
	static {
		serialNum = 1000;
	}
	// 인스턴스 초기화 블럭
	{
		serialNum++;
		studentID = serialNum;
	}
	
	public Student() {
		System.out.println("기본 생성자 호출");
	}
	public Student(String name) {
		System.out.println("명시적 생성자 호출");
		this.studentName = name;
	}
	public void setStudentName(String name) {
		this.studentName = name;
	}
	public int getStudentID() {
		return this.studentID;
	}
}

public class C054_static3 {
	public static void main(String[] args) {
		System.out.println(Student.serialNum);
		
		Student studentLee = new Student();
		studentLee.setStudentName("이지원");
		System.out.println("이지원의 학번: "
				+ studentLee.getStudentID());
		
		Student studentSon = new Student();
		studentSon.setStudentName("손흥민");
		System.out.println("손흥민의 학번: "
				+ studentSon.getStudentID());
		
		Student studentPark = new Student("박미경");
		System.out.println("박미경의 학번: "
				+ studentPark.getStudentID());
	}
}
