package ro.ase.csie.cts.g1094.dp.builder;

public class TestBuilder {

	public static void main(String[] args) {
		//1. create the object
		SuperHero superHero = new SuperHero();
		//2. Init the object
		//TO DO: don't forget
//		superHero.name = "Superman";
//		superHero.lifePoints = 100;
//		superHero.superPower = "Can fly";
//		superHero.superSuperPower= "Laser eyes";
		
//		SuperHero superHero =
//				new SuperHero("Superman", 100, false, false, null, null, new Pistol(), "Laser Eyes");

		SuperHero superman = new SuperHero.SuperHeroBuilder("Superman", 100)
				.addSuperPower("fly")
				.addLeftWeapon(new Pistol())
				.build();
		
		SuperHero joker = new SuperHero.SuperHeroBuilder("Joker", 200)
				.isVillain()
				.addLeftWeapon(new Pistol())
				.addRightWeapon(new Pistol())
				.build();
	}

}
