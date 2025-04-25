package chapter10.interface_part;

import java.util.Scanner;

public class GameMain_Method {
	static Novice character;
	Scanner scan = new Scanner(System.in);
	
	public void printMenu() {
		System.out.println();
		System.out.println("=== ABCDE_rpg ===");
		System.out.println("1. 캐릭터 생성");
		System.out.println("2. 캐릭터 정보");
		System.out.println("3. 전직하기");
		System.out.println("4. 기본 공격");
		System.out.println("5. 스킬 사용");
		System.out.println("0. 종료");
		System.out.println("=================");
		System.out.print("번호를 선택하세요 : ");
	}
	
	public void createCharacter() {
		System.out.println("캐릭터를 생성합니다.");
		
		// 아이디
		System.out.print("사용하실 아이디를 입력해 주세요 : ");
		character = new Novice();
		character.setName(scan.next());
		
		// 캐릭터 스탯
		String isRepeat = "y";
		int sum = 0, str = 0, dex = 0, intel = 0;
		while (isRepeat == "y") {
			System.out.println("스탯을 부여합니다.");
			while (sum < 15) {
				str = (int) (Math.random() * 10);
				dex = (int) (Math.random() * 10);
				intel = (int) (Math.random() * 10);
				sum = str + dex + intel;
			}
			System.out.printf("부여된 스탯정보: 힘[%d], 민첩[%d], 지능[%d]\n"
					, str, dex, intel);
			System.out.print("스텟을 다시 받으시겠습니까? (y/n) : ");
			isRepeat = scan.next();
		}
		character.setStrength(str);
		character.setDexterity(dex);
		character.setIntelligence(intel);
		
		
		System.out.printf("[ID: %s, stat: 힘(%d), 민첩(%d), 지능(%d)]\n"
				, character.getName()
				, character.getStrength()
				, character.getDexterity()
				, character.getIntelligence());
		System.out.println("현재 정보로 저장합니다.");
	}
	
	public void getCharacter() {
		if (character == null) {
			System.out.println("캐릭터를 생성하세요.");
			return ;
		}
		System.out.printf("[ID: %s, stat: 힘(%d), 민첩(%d), 지능(%d)]\n"
				, character.getName()
				, character.getStrength()
				, character.getDexterity()
				, character.getIntelligence());
	}
	
	public void promotion() {
		if (character == null) {
			System.out.println("캐릭터를 생성하세요.");
			return ;
		}
		System.out.println("=== 직업 종류 ===");
		System.out.println("1. 기사");
		System.out.println("2. 도적");
		System.out.println("3. 마법사");
		System.out.print("전직할 직업의 번호를 선택하세요 : ");
		int job = scan.nextInt();
		switch (job) {
		case 1:
			System.out.println("기사로 전직합니다.");
			character = new Knight(character.getName()
					, character.getStrength()
					, character.getStrength()
					, character.getStrength()					
					);
			break;
		case 2:
			System.out.println("도적으로 전직합니다.");
			character = new Thief(character.getName()
					, character.getStrength()
					, character.getStrength()
					, character.getStrength()					
					);
			break;
		case 3:
			System.out.println("마법사로 전직합니다.");
			character = new Magician(character.getName()
					, character.getStrength()
					, character.getStrength()
					, character.getStrength()					
					);
			break;
		default:
			break;
		}
	}
	
	public void attack() {
		if (character == null) {
			System.out.println("캐릭터를 생성하세요.");
			return ;
		}
		character.attack();
	}
	
	public void skill() {
		if (character == null) {
			System.out.println("캐릭터를 생성하세요.");
			return ;
		}
		if (character instanceof Knight knight) {
			knight.skill();
			return ;
		}
		if (character instanceof Thief thief) {
			thief.skill();
			return ;
		}
		if (character instanceof Magician magician) {
			magician.skill();
			return ;
		}
		if (character instanceof Novice) {
			System.out.println("스킬을 배우지 않았습니다.");
		}
	}
	
	public void exit() {
		System.out.println("6. 종료");
		System.exit(0);
	}
}