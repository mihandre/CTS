package ro.ase.csie.cts.g1093.dp.memento;

public class TestMemento {

	public static void main(String[] args) {
	
		SuperHero supermanHero = new SuperHero("Superman", 100, "Fly");
		
		HeroMemento initialSave=supermanHero.createRestorePoint();
		
		supermanHero.takesAHit(50);
		supermanHero.takesAHit(20);
		
		System.out.println("Lifepoints: "+supermanHero.lifePoints);
		
		supermanHero.restore(initialSave);
		
		System.out.println("Lifepoints: "+supermanHero.lifePoints);
	}

}
