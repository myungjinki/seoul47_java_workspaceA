package chapter13.collection;

import java.util.HashMap;

class Human {
	int age;
	String name;
	
	public Human(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	// 아래 hashCode는 버그 가능성 높음
	@Override
	public int hashCode() {
		return name.length() + age;
	}
	// 아래 코드를 주석하면 null출력이 됨.
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Human) {
			Human other = (Human) obj;
			return age == other.age
					&& name.equals(other.name);
		} else {
			return false;
		}
	}
}

public class C115_collection_hashMap2 {
	public static void main(String[] args) {
		HashMap<Human, Integer> donate = new HashMap<>();
		donate.put(new Human(42, "김기남"), 10000);
		donate.put(new Human(24, "박수빈"), 20000);
		donate.put(new Human(20, "박수현"), 5000);
		donate.put(new Human(11, "최상미"), 8000);
		
		Human park = new Human(20, "박수현");
		// 반복문을 사용하지 않고도 기부금을 찾을 수 있다.
		System.out.println(park.name + "씨의 기부금 = "
				+ donate.get(park));
	}
}
