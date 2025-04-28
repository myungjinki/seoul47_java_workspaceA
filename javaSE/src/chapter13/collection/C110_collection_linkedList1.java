package chapter13.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class C110_collection_linkedList1 {
	public static void main(String[] args) {
		LinkedList<String> arName = new LinkedList<>();
		arName.add("전두환");
		arName.add("김영삼");		
		arName.add("김대중");
		arName.add(1, "노태우");
		arName.remove("노태우");	// 값 or index
		
		for (String s : arName) {
			System.out.println(s);
		}
		
		/**
			Iterator
				컬렉션 안에 있는 요소들을 하나씩 순차적으로 꺼내기 위해 만들어진 객체
				컬렉션 안을 탐색하는 방법을 표준화한 객체
			
			장점
				컬렉션 구조와 상관없이 일관된 접근 방법 제공
				ArrayList, LinkedList, HashSet 등...
				
			hasNext()
				- 다음에 읽을 요소가 있는지를 확인. 있으면 true, 없으면 false
			next()
				- Iterator의 현재 위치에서 커서를 다음 요소로 이동, 그 요소를 리턴
			remove()
				- 현재 커서 위치의 요소를 삭제
				
		 */
		
		// Iterator 반복자
		System.out.println("======");
		Iterator<String> it = arName.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		// 역순
		System.out.println("======");
		ListIterator<String> it2 = 
				arName.listIterator(arName.size());
		while (it2.hasPrevious()) { // 이전 요소가 있는지 물어보는 메서드
			System.out.println(it2.previous());
		}
	}
}
