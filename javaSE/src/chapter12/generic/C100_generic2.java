package chapter12.generic;

import java.util.ArrayList;

public class C100_generic2 {
	public static void main(String[] args) {
/*
		제네릭
		  - 데이터 타입의 다형성
		  - 참조형 데이터 타입만 가능
		  - 타입 안정성
		  
		제네릭 이유
		  - 클래스 외부에서 타입을 지정해 주기 때문에 따로 타입을 체크하고
		    변환할 필요가 없다
		  - 컴파일 시에 의도하지 않은 타입이 들어오는 것을 막을 수 있다(타입 안정성)
		  - 코드의 재사용성이 높아진다
		  
		제네릭 표기
		  E - Element
		  K - Key
		  N - Number
		  T - Type
		  V - Value
 */
		ArrayList arNum = new ArrayList();
		arNum.add(1);
		arNum.add("문자열");
		
//		int value = arNum.get(0);	//object라 캐스팅 필요
		int value = (int) arNum.get(0);
		System.out.println(value);
//		int value2 = (int) arNum.get(1); // runtime error
		
		ArrayList<Integer> arNum2 = new ArrayList<>(); // 다이아몬드 연산자로 타입 추
		arNum2.add(1);
//		arNum2.add("문자열"); // compile error
	}
}
