package chapter11.object;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class C097_calendar {
	public static void main(String[] args) {
		/*
		날짜/시간 관련 클래스
		 - GregorianCalendar
		 - SimpleDateFormat
		 - LocalDate, LocalTime, LocalDateTime <- 제일 많이 
		 */
		System.out.println("=== GergorianCalendar ===");
		GregorianCalendar today = new GregorianCalendar();
		System.out.printf("%d년 %d월 %d일 %s %d시 %d분 %d초\n"
				, today.get(Calendar.YEAR)
				, today.get(Calendar.MONTH) + 1
				, today.get(Calendar.DATE)
				, today.get(Calendar.AM_PM)
						== Calendar.AM ? "오전" : "오후"
				, today.get(Calendar.HOUR)
				, today.get(Calendar.MINUTE)
				, today.get(Calendar.SECOND)
				);
//		=== GergorianCalendar ===
//		2025년 4월 24일 오전 11시 13분 3초		
/*
		날짜정보를 원하는형태로 포매팅
		1) 날짜 관련 포맷 문자
			패턴					의미
			y / yy / yyyy		연도
			M / MM				월(숫자)
			MMM					월(짧은 이름)
			MMMM				월(전체 이름)
			d / dd				일(날짜)
			E / EEE				요일(짧은 이름)
			EEEE				요일(전체 이름)
			
		2) 시간 관련 포맷 문자
			패턴					의미
			a					오전/오후
			h / hh				시(12시간제)
			H / HH				시(24시간제)
			m / mm				분
			s / ss				초
			S / SSS				밀리초
 */
		System.out.println("=== SimpleDateFormat 사용 ===");
		SimpleDateFormat sdf =
				new SimpleDateFormat("yyyy년 M월 d일 a hh:mm:ss");
		String formattedDate = sdf.format(today.getTime());
		System.out.println(formattedDate);
//		=== SimpleDateFormat 사용 ===
//		2025년 4월 24일 오전 11:13:03
		
		System.out.println("=== LocalDate, LocalTime ===");
		LocalDate todayDate = LocalDate.now();
		LocalTime nowTime = LocalTime.now();
		System.out.printf("%d년 %d월 %d일 %d시 %d분 %d초\n"
				, todayDate.getYear()
				, todayDate.getMonthValue() // getMonthValue()
				, todayDate.getDayOfMonth() // getDayOfMonth()
				, nowTime.getHour()
				, nowTime.getMinute()
				, nowTime.getSecond()
		);
//		=== LocalDate, LocalTime ===
//		2025년 4월 24일 11시 15분 47초
		
		// DateTimeFormatter로 틀만 만들고
		// LocalDateTime으로 정보를 받아오기
		System.out.println("=== DateTimeFormmater ===");
		LocalDateTime currentDateTime = LocalDateTime.now();
		DateTimeFormatter formatter =
				DateTimeFormatter.ofPattern("yyyy년 M월 d일 a hh:mm:ss");
		String formattedCurrent = currentDateTime.format(formatter);
		System.out.println(formattedCurrent);
//		=== DateTimeFormmater ===
//		2025년 4월 24일 오전 11:20:20
		
	}
	
}
