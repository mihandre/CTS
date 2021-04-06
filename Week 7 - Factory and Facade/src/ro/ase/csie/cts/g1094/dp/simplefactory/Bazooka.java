package ro.ase.csie.cts.g1094.dp.simplefactory;

public class Bazooka extends AbstractWeapon {

	
	public Bazooka() {
		this.description = "Bazooka";
		this.powerLevel = 2000;
	}
	
	public Bazooka(String description) {
		this.description = description;
		this.powerLevel = 2000;
	}

	@Override
	public void pewPew() {
		// TODO Auto-generated method stub
		
	}
}
