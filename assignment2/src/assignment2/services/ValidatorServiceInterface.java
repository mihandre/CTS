package assignment2.services;

import assignment2.exceptions.InvalidLoanValueException;
import assignment2.exceptions.InvalidRateException;

public interface ValidatorServiceInterface {
	public void validateLoanValue(double loanValue) throws InvalidLoanValueException;
	public void validateRate(double rate) throws InvalidRateException;
}
