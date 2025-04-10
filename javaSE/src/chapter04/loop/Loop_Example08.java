package chapter04.loop;

public class Loop_Example08 {
	public static void main(String[] args) {
		/**
		 * 1번
		 * 
		 *      *
		 *     ***
		 *    *****
		 *   *******
		 *  *********
		 *  
		 * 2번
		 *  *********
		 *   *******
		 *    *****
		 *     ***
		 *      *
		 * 3번 피라미드의 높이를 입력을 받아 다음과 같이 출력하세요
		 * 1
		 * *
		 * 
		 * 2
		 *  *
		 * ***
		 * 
		 * 3
		 *   *
		 *  * *
		 * *****
		 */
		
        int height = 5; // 피라미드의 높이
        
        for (int i = 0; i < height; i++) {
            // 각 줄의 앞쪽 공백 출력
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }
            
            // 각 줄의 별표 출력 (2*i+1개)
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
          
            // 줄 바꿈
            System.out.println();
        }
        
        System.out.println();
        height = 5; // 역피라미드의 높이
        
        for (int i = 0; i < height; i++) {
            // 각 줄의 앞쪽 공백 출력 (아래로 갈수록 공백이 많아짐)
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            
            // 각 줄의 별표 출력 (위에서부터 2*(height-i)-1개씩 감소)
            for (int k = 0; k < 2 * (height - i) - 1; k++) {
                System.out.print("*");
            }
            
            // 줄 바꿈
            System.out.println();
        }
	}
}
