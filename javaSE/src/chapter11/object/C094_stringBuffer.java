package chapter11.object;

public class C094_stringBuffer {
	public static void main(String[] args) {
/**
		String : 불변(Immutable) > 문자열 수정시 새로운 객체 사용
		StringBuilder : 가변(Mutable)
						단일 스레드 환경에 적합 / 가장 빠름
		StringBuffer : 가변(Mutable)
						멀티 스레드 환경에 적합 / 느림
						
		 - StringBuilder, StringBuffer는 내부적으로 동적 배열을
		   사용하여 문자열을 저장한다
		 - 속도 : StringBuilder > StringBuffer > String
 */
		String str = "strA";
		String str2 = new String("strA");
		StringBuilder sbd = new StringBuilder("sbdA");
		StringBuffer sbf = new StringBuffer("sbfA");
		
		System.out.println("=== 출력1 ===");
		System.out.println("str: " + str);
		System.out.println("str2: " + str2);
		System.out.println("sbd: " + sbd);
		System.out.println("sbf: " + sbf);
		
		// str과 str2는 hashCode()는 같지만 주소값은 다르다!
		System.out.println("\n=== 해시코드 비교 ===");
		System.out.println("str의 hashcode: " + str.hashCode());
		System.out.println("str2의 hashcode: " + str2.hashCode());
		System.out.println("str == str2: " + (str == str2));
		System.out.println("sbd의 hashcode: " + sbd.hashCode());
		System.out.println("sbf의 hashcode: " + sbf.hashCode());
		
		
/**
		=== 출력1 ===
		str: strA
		str2: strA
		sbd: sbdA
		sbf: sbfA
		
		=== 해시코드 비교 ===
		str의 hashcode: 3541040
		str2의 hashcode: 3541040
		str == str2: false
		sbd의 hashcode: 951007336
		sbf의 hashcode: 2001049719
 */
		
		// 데이터 수정
		str += "strB";
		sbd.append("sbdB");
		sbf.append("sbfB");
		
		System.out.println("\n=== 수정 후 출력 ===");
		System.out.println("str: " + str);
		System.out.println("str2: " + str2);
		System.out.println("sbd: " + sbd);
		System.out.println("sbf: " + sbf);
		
		System.out.println("\n=== 수정 후 해시코드 비교 ===");
		System.out.println("str의 hashcode: " + str.hashCode());
		System.out.println("sbd의 hashcode: " + sbd.hashCode());
		System.out.println("sbf의 hashcode: " + sbf.hashCode());
		
/**
		 === 수정 후 출력 ===
		str: strAstrB
		str2: strA
		sbd: sbdAsbdB
		sbf: sbfAsbfB
		
		=== 수정 후 해시코드 비교 ===
		str의 hashcode: 1758230625
		sbd의 hashcode: 951007336
		sbf의 hashcode: 2001049719
 */
		
		// 성능 비교 : String vs StringBuilder
		System.out.println("\n=== 성능 비교 ===");
		long start = System.currentTimeMillis();
		String result1 = "";
		for (int i = 0; i < 1000; i++) {
			for (char j = 'A'; j < 'z'; j++) {
				result1 += j;
			}
			result1 += '\n';
		}
		System.out.println("String 소요 시간: "
				+ (System.currentTimeMillis() - start) / 1000.0 + "초");
		
		long start2 = System.currentTimeMillis();
		StringBuilder result2 = new StringBuilder();
		for (int i = 0; i < 1000; i++) {
			for (char j = 'A'; j < 'z'; j++) {
				result2.append(j);
			}
			result2.append('\n');
		}
		System.out.println("StringBuilder 소요 시간: "
				+ (System.currentTimeMillis() - start2) / 1000.0 + "초");
/**
		=== 성능 비교 ===
		String 소요 시간: 0.131초
		StringBuilder 소요 시간: 0.002초
 */
	}
}
