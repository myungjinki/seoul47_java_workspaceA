package chapter06.class_part1;

/*
	Character 클래스 생성
	0. 외부에서 접근할 수 없는 private 멤버변수를 선언한다.
		- String	id, job
		- int		level, str, dex, intel
	1. level, str, dex, intel 은 인스턴스 생성시 1을 기본값으로 초기화한다.
	2. 명시적 생성자 생성
		- id, job 을 파라미터로 가지는 생성자
		- id, job, level, str, dex, intel 을 파라미터로 가지는 생성자
	3. skill() 메서드 생성 (equals() 를 통한 비교)
		- 인스턴스의 job이 "마법사" 면 "파이어볼" 출력
		- 인스턴스의 job이 "전사" 면 "배쉬" 출력
		- 인스턴스의 job이 "궁수" 면 "크리티컬" 출력
		- 그 외 "기본공격" 출력
	4. 해당 인스턴스의 정보를 출력하는 info() 메서드 생성
		- 출력형식
		[고구마(궁수) Lv5]님의 스탯: str(3), dex(11), intel(2)
 */

public class Character {
	private String	id;
	private String	job;
	private int		level;
	private int		str;
	private int		dex;
	private int		intel;
	
	{
		this.level = 1;
		this.str = 1;
		this.dex = 1;
		this.intel = 1;
	}
	

	public Character(String id, String job) {
		super();
		this.id = id;
		this.job = job;
//		this.level = 1;
//		this.str = 1;
//		this.dex = 1;
//		this.intel = 1;
	}



	public Character(String id, String job, int level
			, int str, int dex, int intel) {
		super();
		this.id = id;
		this.job = job;
		this.level = level;
		this.str = str;
		this.dex = dex;
		this.intel = intel;
	}
	
	public void skill() {
		if ( this.job.equals("마법사") ) {
			System.out.println("파이어볼");
		} else if ( this.job.equals("전사") ) {
			System.out.println("배쉬");
		} else if ( this.job.equals("궁수") ) {
			System.out.println("크리티컬");
		} else {
			System.out.println("기본공격");
		}
	}
	
	public void info() {
		System.out.printf(
				"[%s(%s) Lv%d]님의 스탯: "
				+ "str(%d), dex(%d), intel(%d)\n"
				, id, job, level, str, dex, intel
				);
	}
}
