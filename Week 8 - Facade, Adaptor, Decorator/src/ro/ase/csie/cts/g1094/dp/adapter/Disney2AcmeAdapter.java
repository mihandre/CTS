package ro.ase.csie.cts.g1094.dp.adapter;

import ro.ase.csie.cts.g1094.dp.adapter.disney.DisneyActions;

public class Disney2AcmeAdapter extends ACMESuperHero {

	DisneyActions disneyHero = null;
	
	public Disney2AcmeAdapter(DisneyActions disneyHero) {
		super(disneyHero.getName(), disneyHero.getPower());
		this.disneyHero = disneyHero;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub

	}

	@Override
	public void crouch() {
		// TODO Auto-generated method stub

	}

	@Override
	public void takeAHit(int points) {
		// TODO Auto-generated method stub

	}

	@Override
	public void heal(int points) {
		// TODO Auto-generated method stub

	}

}
