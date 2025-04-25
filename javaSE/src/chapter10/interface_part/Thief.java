package chapter10.interface_part;

public class Thief extends Novice implements Skill{
	public Thief(String name, int strength, int dexterity, int intelligence) {
		super(name, strength, dexterity, intelligence);
	}
	
	public void skill( ) {
		if (Math.random() > 0.5) {
			System.out.println("\u001B[31m" + "훔치기" + "\u001B[0m");			
		} else {			
			System.out.println("\u001B[31m" + "표창 공격" + "\u001B[0m");			
		}
	}
}