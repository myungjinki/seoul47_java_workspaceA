package chapter13.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class C112_collection_hashSet {
	public static void main(String[] args) {
		// 해시는 빠른 검색을 위해 정해진 규칙에 따라 데이터를 저장하는 자료 구조
		// Set은 중복 X
		HashSet<String> kangwon = new HashSet<String>();
		kangwon.add("춘천시");
		kangwon.add("철원군");
		kangwon.add("정선군");
		kangwon.add("강릉시");
		kangwon.add("화천군");
		kangwon.add("춘천시");
		
		Iterator<String> it = kangwon.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		// 정렬
		List<String> listSet = new ArrayList<>(kangwon);
		Collections.sort(listSet);
		
		for (String s : listSet) {
			System.out.println(s);
		}
	}
}
