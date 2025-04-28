package chapter12.generic;

import java.util.ArrayList;
import java.util.List;

// 다중타입 한정(T extneds class A & interfaceB & interfaceC)
// 제네릭 클래스나 메서드에서 타입 파라미터에 대해 하나 이상의 타입을 요구할 수 있음

interface Readable	{ }
interface Closeable	{ }

class BoxType  implements Readable, Closeable {}
class BoxType2 implements Readable {}
class Box<T extends Readable & Closeable> {
	List<T> list = new ArrayList<>();
	
	public void add(T item) {
		list.add(item);
	}
}


public class C105_generic_range2 {
	public static void main(String[] args) {
		
		// 다중타입 한정 (& 사용)
		// Readable 과 Closeable을 동시에 구현한 클래스만 타입 할당 가능
		Box<BoxType>  box	= new Box<>();
//		Box<BoxType2> box2	= new Box<>(); // BoxType2가 Closeable을 구현하지 않아서 에러
		
		// 최상위 Object 클래스여도 할당 불가
//		Box<Object>   box3	= new Box<>(); // err
	}
}
