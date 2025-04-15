package chapter06.class_part1;

import java.time.LocalTime;

public class Time {
	//멤버 변수
	boolean am;
	int hour;
	int minute;
	int second;
	
	//초기화 블럭
	{
		System.out.println("초기화 블럭 실행");
		
		LocalTime now = LocalTime.now();
		hour = now.getHour();
		if (hour >= 12) {
			hour -= 12;
			am = false;
		} else {
			am = true;
		}
		minute = now.getMinute();
		second = now.getSecond();
	}
	
	//기본 생성자
	public Time() {
		System.out.println("기본 생성자 실행");
	}
	
	//명시적 생성자
	public Time(int hour, int minute) {
		this.am = hour < 12;
		this.hour = hour % 12;
		this.minute = minute;
		System.out.println("명시적 생성자 실행2");
	}
	
	//명시적 생성자
	public Time(boolean am, int hour, int minute) {
		this(hour, minute);
		this.am = am;
		System.out.println("명시적 생성자 실행3");
	}
	
	//명시적 생성자
	public Time(boolean am, int hour, int minute, int second) {
		this(am, hour, minute);
		this.second = second;
		System.out.println("명시적 생성자 실행4");
	}
	
	//멤버 메서드
	void whatTime() {
		System.out.print(am ? "오전 " : "오후 ");
		System.out.println(hour + "시 "
				+ minute + "분 "
				+ second + "초");
	}
}
