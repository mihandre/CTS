package ro.ase.csie.cts.g1093.dp.memento;

public class SuperHero {

	String nameString;
	int lifePoints;
	String magic;
	
	
	public SuperHero(String nameString, int lifePoints, String magic) {
		super();
		this.nameString = nameString;
		this.lifePoints = lifePoints;
		this.magic = magic;
	}
	
	public void attack() {
		System.out.println("Is attacking");
	}
	
	public void heal(int points) {
		this.lifePoints +=points;
	}
	
	public void takesAHit(int points) {
		this.lifePoints -= points;
	}
	
	public HeroMemento createRestorePoint() {
		return new HeroMemento(nameString, lifePoints, magic);
	}
	
	public void restore(HeroMemento memento) {
		this.nameString = memento.nameString;
		this.lifePoints = memento.lifePoints;
		this.magic = memento.magic;
	}
}
