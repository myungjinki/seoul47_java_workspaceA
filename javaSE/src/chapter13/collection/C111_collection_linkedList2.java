package chapter13.collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class C111_collection_linkedList2 {
	public static void main(String[] args) {
		List<String> arName = new LinkedList<>();
		arName.add("장보고");
		arName.add("김유신");
		arName.add("강감찬");
		arName.add("을지문덕");
		
		for (String s : arName) {
			System.out.print(s + " ");
		}
		
		// Collections 클래스
		// sort, reverse, shuffle, swap, max, min ...
		
		// 정렬
//		Collections.sort(arName);
		// 역순 정렬(저장순서 역순)
//		Collections.reverse(arName);
		// 역순 정렬(비교기준 역순) 가나다라 순
//		arName.sort(Collections.reverseOrder());
		// 무작위
		Collections.shuffle(arName);
		
		
		
		System.out.println("\n===================");
		for (String s : arName) {
			System.out.print(s + " ");
		}
	
		// 최대값 최소값
		String max = Collections.max(arName);
		String min = Collections.min(arName);
		System.out.println("\n최대값: " + max + ", 최소값: " + min);
	}
}
