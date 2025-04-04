package chapter03.condition;

public class C025_Switch3 {
	public static void main(String[] args) {
		// String
		// String의 비교는 리터럴과 다르게 참조형 데이터 타입이기 때문에
		// 예전에는 Switch - case에서 String을 처리하지 못했다.
		// 
		
		String country = "China";
		
		switch (country) {
		case "Korea":
			System.out.println("Seoul");
			break;
		case "China":
			System.out.println("Beijing");
			break;
		case "Japan":
			System.out.println("Tokyo");
			break;
		}
		
		// String 비교 ( == , equals() )
		String a = "안녕";
		String b = "안녕";
		System.out.println(a == b);
		
		String c = new String("안녕");
		System.out.println(a == c);
		System.out.println(a.equals(c));
	}
}
