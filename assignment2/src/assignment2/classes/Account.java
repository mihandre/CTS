package assignment2.classes;

import assignment2.exceptions.InvalidLoanValueException;
import assignment2.exceptions.InvalidRateException;
import assignment2.interfaces.AccountInterface;
import assignment2.services.ValidatorServiceInterface;
import assignment2.services.ValidatorService;

public class Account implements AccountInterface {
	public double loanValue, rate;
	public static double brokerFee;
	public int daysActive;
	public AccountType accountType;
	public static ValidatorService validator = new ValidatorService();

	//getters
	public double getLoan() {
		return loanValue;
	}

	public double getRate() {
		return this.rate;
	}

	public double getMonthlyRate() {
		return loanValue * rate;
	}
	
	//setters
	public void setLoanValue(double newLoanValue) throws InvalidLoanValueException {
		
		validator.validateLoanValue(newLoanValue);
		this.loanValue = newLoanValue;
		
	}
	
	public void setRate(double newRate) throws InvalidRateException {
		validator.validateRate(newRate);
		this.rate = newRate;
	}
	
	//printers
	public void printLoan() {
		System.out.println("The loan value is " + this.loanValue);
	}
	
	public void printRate() {
		System.out.println("The rate is " + rate);
	}

	@Override
	public String toString() {
		return "Loan: " + this.loanValue + "; rate: " + this.rate + "; days active:" + daysActive + "; Type: "
				+ accountType + ";";
	}

	public void print() {
		System.out.println("This is an account");
	}

	//methods
	public static double calculateFeeFromAccount(Account account) {
		double fee;
		fee = ((account.accountType == AccountType.PREMIUM || account.accountType == AccountType.SUPER_PREMIUM) ? 1 : 0)
				* (brokerFee / 100 * account.loanValue * (Math.pow(account.rate, (account.daysActive / 365)) - 1));
		return fee;
	}

	//constructors
	public Account(double loanValue, double rate, AccountType accountType) throws InvalidLoanValueException {
		setLoanValue(loanValue);
		this.rate = rate;
		this.accountType = accountType;
		this.brokerFee = 1.25;
	}

	public Account(double loanValue, double rate, AccountType accountType, double brokerFee) throws InvalidLoanValueException, InvalidRateException {
		setLoanValue(loanValue);
		setRate(rate);
		this.accountType = accountType;
		this.brokerFee = brokerFee;
	}

}