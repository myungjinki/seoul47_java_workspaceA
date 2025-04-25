package chapter11.object;

import java.util.Random;

public class C096_random {
	public static void main(String[] args) {
		//Math의 random()
		for (int i = 0; i < 5; i++) {
			System.out.println(Math.random());
		}
		for (int i = 0; i < 5; i++) {
			System.out.println((int) (Math.random() * 10) + 1);
		}
		
		//Random
		Random r = new Random();
		for (int i = 0; i < 5; i++) {
			System.out.println(r.nextInt(10));
		}
	}
}
