package assignment2.services;

import assignment2.exceptions.InvalidLoanValueException;
import assignment2.exceptions.InvalidRateException;

public class ValidatorService implements ValidatorServiceInterface {

	@Override
	public void validateLoanValue(double loanValue) throws InvalidLoanValueException {
		if (loanValue < 0)
			throw new InvalidLoanValueException();

	}

	@Override
	public void validateRate(double rate) throws InvalidRateException {
		if (rate < 0 || rate > 1)
			throw new InvalidRateException();

	}

}
