package chapter00.basic;

/**
 * 변수의 교
 * (직접적인 값의 대입이 안니 변수를 통한 값 이동할 것)
 * 
 * 출력 결과 :
 * 
 * 교환 전
 * x = 100
 * y = 200
 * 교환 후
 * x = 200
 * y = 100
 */
public class Basic_Example03 {
	public static void main(String[] args) {
		int x = 100, y = 200;
		int temp;
		System.out.println("교환 전");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		temp = y;
		y = x;
		x = temp;
		System.out.println("교환 후");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}

}
