package chapter06.class_part1;

public class C056_array1 {
	public static void main(String[] args) {
		// 배열 선언, 초기화
		int[] arr;
		int[] arr1 = new int[5];	// 타입[] 배열명;
		int arr2[] = new int[5];	// 타입 배열명[];
		
		int[] arr3 = new int[] {0, 1, 2, 3, 4};
		int arr4[] = {0, 1, 2, 3, 4};
		
//		int[] arr5;			// 먼저 선언하면
//		arr5 = {6, 7, 8};	// new int[]를 생략할 수 없음
		
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i] + " ");
		}
		System.out.println();
		
		System.out.println("길이 " + arr3.length);
	}
}
