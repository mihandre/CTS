package ro.ase.acs.cts.laborator3.refactor.phase3.services;

public class MarketingEasterStrategy implements MarketingServiceInterface {

	@Override
	public float getFidelityDiscount(int accountAge) {
		return 0.5f;
	}

}
