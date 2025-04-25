package chapter11.object;

public class C091_wrapper {
	public static void main(String[] args) {
/**
		*기본형		*Wrapper클래스
		boolean		Boolean
		byte		Byte
		char		Character
		short		Short
		int			Integer
		long		Long
		float		Float
		double		Double
 */
		// 1. Boxing (기본형 > Wrapper) :valueof
		int i = 1234;
//		Integer wrapint = new Integer(i);	// 권장되지 않는 방법
		Integer wrapInt = Integer.valueOf(i);
		System.out.println(wrapInt instanceof Integer);
		String str = wrapInt.toString();	// 문자열 변환
		System.out.println(str);
		
		// 2. 문자열 -> int 변환
		String a = "56", b = "78";
		System.out.println(a + b);
		System.out.println(Integer.parseInt(a)
				+ Integer.parseInt(b));
		
		// 3. Unboxing (Wrapper > 기본형)
		Integer wrapInt2 = Integer.valueOf(629);
		int j = wrapInt2;	// 오토박싱 -> 자동으로 바뀐다는 뜻
		System.out.println(j);
		
		Double wrapDouble = Double.valueOf(3.14);
		double d1 = wrapDouble; //오토박싱
		int d2 = wrapDouble.intValue();
		System.out.println(d1);
		System.out.println(d2);
		
		// 4. Autoboxing
		Integer c = 3;
		Integer d = 3;
		int e = c + d;
		System.out.println(e);
		
		Integer f = 12;
		f++;	// 오토언박싱 > 연산 > 다시 오토박싱
		System.out.println(f);
		System.out.println(f instanceof Integer);
		
		System.out.printf("int 타입 크기=%d, 최소값=%d, 최대값=%d\n"
				, Integer.SIZE, Integer.MIN_VALUE, Integer.MAX_VALUE);
		System.out.printf("short 타입 크기=%d, 최소값=%d, 최대값=%d\n"
				, Short.SIZE, Short.MIN_VALUE, Short.MAX_VALUE);
		System.out.printf("long 타입 크기=%d, 최소값=%d, 최대값=%d\n"
				, Long.SIZE, Long.MIN_VALUE, Long.MAX_VALUE);
	}
}
