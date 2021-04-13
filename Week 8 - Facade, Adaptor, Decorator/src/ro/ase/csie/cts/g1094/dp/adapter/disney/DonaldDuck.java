package ro.ase.csie.cts.g1094.dp.adapter.disney;

public class DonaldDuck implements DisneyActions {

	public final String name = "Donald Duck";
	int powerLevel;
	
	
	public DonaldDuck(int powerLevel) {
		super();
		this.powerLevel = powerLevel;
	}

	@Override
	public void changeLocation(int x, int y) {
		System.out.println("Move to a new location");
		
	}

	@Override
	public void isWounded(int power) {
		powerLevel -=power;
		System.out.println("Power decreased to " + powerLevel);
		
	}

	@Override
	public void restorePower(int power) {
		powerLevel += power;
		System.out.println("Power increased to " + powerLevel);
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public int getPower() {
		// TODO Auto-generated method stub
		return this.powerLevel;
	}

}
