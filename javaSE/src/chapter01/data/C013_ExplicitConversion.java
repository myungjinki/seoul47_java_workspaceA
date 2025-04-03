package chapter01.data;

public class C013_ExplicitConversion {
	public static void main(String[] args) {
		// 형 변환(큰 -> 작 .. 강제 형변환 or 명시적 형변환)
		int iNum = 10;
		byte bNum = (byte) iNum;
		
		// 내림
		double dNum = 3.14;
		int iNum2 = (int) dNum;
		
		// 클래스 변환시 주의해야함
		System.out.println(bNum);
		System.out.println(iNum2);
	}
}
