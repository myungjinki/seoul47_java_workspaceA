package chapter13.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class C113_collection_treeSet {
	public static void main(String[] args) {
		// 저장될때부터 이진트리를 이용하여 정렬 + 중복X
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(3);
		ts.add(2);
		ts.add(5);
		ts.add(1);
		ts.add(4);
		ts.add(2);
		
		Iterator<Integer> it = ts.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		// TreeSet을 이용한 로또
		TreeSet<Integer> lotto = new TreeSet<>();
		while (lotto.size() < 6) {
			lotto.add((int) (Math.random() * 45 + 1));
		}
		for (Integer i : lotto) {
			System.out.println(i + " ");
		}
	}
}
