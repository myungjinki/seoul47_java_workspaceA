package chapter06.class_part1;

public class C067_objectArrayCopy1 {
	public static void main(String[] args) {
		Book[] bookArray = new Book[3];
		
		bookArray[0] = new Book("태백산맥", "조정래");
		bookArray[1] = new Book("데미안", "헤르만 헤세");
		bookArray[2] = new Book("어떻게 살 것 인가", "유시민");
		
		for (int i = 0; i < bookArray.length; i++) {
			bookArray[i].showBookInfo();
		}
		
		// 객체 배열 복사
		Book[] bookArray1 = new Book[3];
		bookArray1[0] = new Book("태백산맥", "조정래");
		bookArray1[1] = new Book("데미안", "헤르만 헤세");
		bookArray1[2] = new Book("어떻게 살 것 인가", "유시민");
		
		for (Book book : bookArray1) {
			book.showBookInfo();
		}
		
		// 배열 비교
		System.out.println(bookArray);
		System.out.println(bookArray1);
		// 객체 비교
		System.out.println(bookArray[0]);
		System.out.println(bookArray1[0]);
		
		// 얕은 복사
		Book[] bookArray2 = new Book[3];
		System.arraycopy(bookArray1, 0
				, bookArray2, 0, 3);
		for (Book book : bookArray2) {
			book.showBookInfo();
		}
		System.out.println(bookArray1);
		System.out.println(bookArray2);
		System.out.println(bookArray1[0]);
		System.out.println(bookArray2[0]);
	}
}
