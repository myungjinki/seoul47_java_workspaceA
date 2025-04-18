package chapter06.class_part1;

public class C066_arrayCopy2 {
	public static void main(String[] args) {
		int[] array1 = new int[] {1, 2, 3, 4, 5};
		int newLength = 10;
		
		// System클래스의 arraycopy() 메서드 (얕은 복사)
		// System.arraycopy(복사할 배열, 복사할 첫 위치, 대상 배열
//							, 붙여 넣을 첫 위치, 복사할 요소 개수)
		System.out.println("System 클래스의 arraycopy() 메서드");
		int[] array2 = new int[newLength];
		System.arraycopy(array1, 0, array2, 0, array1.length);
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
		System.out.println();
		
		System.out.println("for문을 이용한 복사");
		int[] array3 = new int[newLength];
		for (int i = 0; i < array1.length; i++) {
			array3[i] = array1[i];
			System.out.print(array3[i] + " ");
		}
	}
}
