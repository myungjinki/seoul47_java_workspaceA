package chapter2;

// 02-3 var를 사용해 변수 선언하기
public class TypeInference {
	public static void main(String[] args) {
		var i = 10;
		var j = 10.0;
		var str = "hello";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "test";
		// str = 3;
	}
}
