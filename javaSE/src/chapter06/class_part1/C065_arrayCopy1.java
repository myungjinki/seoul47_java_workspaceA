package chapter06.class_part1;

import java.util.Arrays;

public class C065_arrayCopy1 {
	public static void main(String[] args) {
		int i = 123, i2 = 123;
		int[] ar = { 1, 2, 3 }, ar2 = { 1, 2, 3 };
		int[] ar3 = ar;
		
		System.out.println("i와 i2 : " + (i == i2));
		System.out.println("ar와 ar2 : " + (ar == ar2));
		System.out.println(ar);
		System.out.println(ar2);
		System.out.println("ar와 ar3 : " + (ar == ar3));
		System.out.println(ar);
		System.out.println(ar3);
		System.out.println("ar과 ar2 일치: "
				+ Arrays.equals(ar, ar2));
	}
}
