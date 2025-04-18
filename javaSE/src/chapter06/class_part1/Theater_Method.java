package chapter06.class_part1;

import java.util.Scanner;

public class Theater_Method {
	
	//멤버 변수
	private int[][] seats = new int[7][7];
	private final Scanner scan = new Scanner(System.in);

	
	//멤버 메서드
	public void printMenu() {
		// code
		System.out.println("♦ ︎극장 좌석 예약 프로그램♦");
		System.out.println("메뉴의 번호를 선택해 주세요. ");
		System.out.println("========================");
		System.out.println("1. 좌석 확인");
		System.out.println("2. 좌석 예약");
		System.out.println("0. 종       료");
		System.out.println("========================");
		System.out.print("번호를 선택하세요 : ");
	}
	
	public int inputCnt() {
		
		int result = 0;
		// code
		System.out.print("몇개의 좌석을 예약하시겠습니까? : ");
		result = scan.nextInt();
		return result;
	}
	
	public void seatInfo() {
		// code
		System.out.println("※좌석 예약 정보");
		System.out.println("-----------------------");
		System.out.println("   1 2 3 4 5 6 7");
		System.out.println("-----------------------");
		for (int i = 0; i < 7; i++) {
			System.out.printf("%d| %d %d %d %d %d %d %d\n", i + 1, seats[i][0], seats[i][1], seats[i][2], seats[i][3], seats[i][4], seats[i][5], seats[i][6]);
		}
		System.out.println();
	}
	
	public void reservationSeats(int cnt) {
		// code
		for (int i = 0; i < cnt; i++) {
			
			for (;;) {
				System.out.print("예약할 좌석의 행 : ");
				int row = scan.nextInt() - 1;
				System.out.print("예약할 좌석의 열 : ");
				int col = scan.nextInt() - 1;
				
				if (seats[row][col] != 0) { 
					System.out.printf("%d행 %d열은 예약된 좌석입니다.\n", row + 1, col + 1);
				} else {
					seats[row][col] = 1;
					System.out.println("예약되었습니다.");
					break;
				}
			}
		}
	}
}
