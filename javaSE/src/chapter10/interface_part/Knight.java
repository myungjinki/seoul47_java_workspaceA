package chapter10.interface_part;

// 기사
public class Knight extends Novice implements Skill {
	
	public Knight(String name, int strength, int dexterity, int intelligence) {
		super(name, strength, dexterity, intelligence);
	}
	
	public void skill( ) {
		if (Math.random() > 0.5) {
			System.out.println("\u001B[31m" + "강력한 배쉬 공격" + "\u001B[0m");			
		} else {			
			System.out.println("\u001B[31m" + "쇼크 스턴" + "\u001B[0m");			
		}
	}
}