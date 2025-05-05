package chapter13.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}

// Person 객체를 비교하기 위한 클래스 정의
class PersonNameComparator implements Comparator<Person> {
	@Override
	public int compare(Person o1, Person o2) {
		// 이름을 기준으로 비교, 역순 정렬은 * -1;
		return o1.name.compareTo(o2.name);
	}
}

// 나이를 기준으로 비교하는 Comparator
class PersonAgeComparator implements Comparator<Person> {
	@Override
	public int compare(Person o1, Person o2) {
		// 나이를 기준으로 비교 (역순은 o1, o2 스왑)
		// 순서 중요!!!!!!!!!!!!!!!
		return Integer.compare(o1.age, o2.age);
	}
}

public class C118_comparator {
	public static void main(String[] args) {
/**
		Comparator
		두 매개변수 객체를 비교
		compare(T o1, T o2)
 */
		// 1. Comparator를 구현한 클래스를 ㅣㅇ용하는 방법
		List<Person> list = new ArrayList<>();
		list.add(new Person("홍길동", 30));
		list.add(new Person("강감찬", 80));
		list.add(new Person("이순신", 45));
		
		Collections.sort(list, new PersonNameComparator()); // 정렬할 기준이 필요하다!!
		
		for (Person p : list) {
			System.out.println(p);
		}
		
		System.out.println("====================");
		// 2. 익명객체를 이용한 방법
		Set<Person> set = new TreeSet<>(
				// 익명객체(상위 타입의 이름으로 인스턴스 생성)
				new Comparator<Person>() {
					@Override
					public int compare(Person o1, Person o2) {
						return o1.name.compareTo(o2.name);
					}
				}
			);
		set.add(new Person("홍길동", 30));
		set.add(new Person("강감찬", 80));
		set.add(new Person("이순신", 45));
		for (Person p : set) {
			System.out.println(p);
		}
		
		System.out.println("====================");
		Set<Person> set2 = new TreeSet<>(
				new PersonAgeComparator());
		set2.add(new Person("홍길동", 30));
		set2.add(new Person("강감찬", 80));
		set2.add(new Person("이순신", 45));
		for (Person p : set2) {
			System.out.println(p);
		}
		
		System.out.println("====================");
		// 3. 람다식을 이용한 방법
		Set<Person> set3 = new TreeSet<>(
					(p1, p2) -> Integer.compare(p2.age, p1.age)
				);
		set3.add(new Person("홍길동", 30));
		set3.add(new Person("강감찬", 80));
		set3.add(new Person("이순신", 45));
		for (Person p : set3) {
			System.out.println(p);
		}
	}
}
