package ro.ase.acs.cts.laborator3.refactor.phase3.services;

import ro.ase.acs.cts.laborator3.refactor.exceptions.InvalidAgeException;
import ro.ase.acs.cts.laborator3.refactor.exceptions.InvalidPriceException;

public interface ValidatorServiceInterface {
	public void validatePrice(float price) throws InvalidPriceException;
	public void validateAge(int accountAge) throws InvalidAgeException;
}