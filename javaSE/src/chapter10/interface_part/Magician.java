package chapter10.interface_part;

public class Magician extends Novice implements Skill{
	public Magician(String name, int strength, int dexterity, int intelligence) {
		super(name, strength, dexterity, intelligence);
	}
	
	// 기본 공격 메서드
	public void attack() {
		System.out.println("\u001B[31m" + "매직 애로우 공격" + "\u001B[0m");
	}
	
	public void skill( ) {
		if (Math.random() > 0.5) {
			System.out.println("\u001B[31m" + "메테오" + "\u001B[0m");			
		} else {			
			System.out.println("\u001B[31m" + "아이스볼트" + "\u001B[0m");			
		}
	}
}