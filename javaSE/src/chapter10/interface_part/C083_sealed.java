package chapter10.interface_part;

abstract sealed class Language permits Java, Cpp, CSharp { }

//final class Python	extends Language { } // sealed에 포함되지 않아서 err
final class Java	extends Language { }
//final class Cpp		extends Language { }
//final class CSharp	extends Language { }

//class OpenJava extends Java { } // final을 상속하려고 해서 err
//상속 제한
sealed class Cpp extends Language permits C11, C20 {}
non-sealed class CSharp extends Language { }

//Cpp로부터는 두 개의 클래스 파생 가능
final class C11 extends Cpp { }
final class C20 extends Cpp { }





public class C083_sealed {
	public static void main(String[] args) {		
/*
		상속 제한
		final		: 더 이상 파생할 수 없다.
		sealed		: 지정한 후손에 대해서만 파생을 허가한다.
		non-sealed	: 제한 없이 파생시킬 수 있다.
 */
		Language lang_java = new Java();
		outLanguageName(lang_java);
	}
	
	public static void outLanguageName(Language lang) {
		if ( lang instanceof Java ) {
			System.out.println("자바");
		} else if ( lang instanceof Cpp ) {
			System.out.println("C++");
		} else if ( lang instanceof CSharp ) {
			System.out.println("C#");
		}
	}
}
