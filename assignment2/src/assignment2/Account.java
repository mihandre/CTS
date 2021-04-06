package assignment2;

public class Account implements AccountInterface {
	public double	loanValue,rate;	
	public int	daysActive,accountType;
	public static final int	STANDARD=0,BUDGET=1,PREMIUM=2,SUPER_PREMIUM=3;
	
	public double getLoan() {
		return loanValue;
	}
	
	public void printLoan() {
		System.out.println("The loan value is " + this.loanValue);
	}
	
	public double getRate() {
		return this.rate;
	}
	
	public void printRate() {
		System.out.println("The rate is "+rate);
	}
	
	public double getMonthlyRate() {
		return loanValue*rate;
	}
	
	public void setLoanValue(double newLoanValue) throws LoanValueException {
		if(newLoanValue<0)
			throw new LoanValueException();
		else
		{
			loanValue = newLoanValue;
		}
	}
	
	public String to_string() {
		return "Loan: "+this.loanValue+"; rate: "+this.rate+"; days active:"+daysActive+"; Type: "+accountType+";";
	}
	
	public void print() {
		System.out.println("This is an account");
	}

	public static double calculate(Account[] 	accounts)
	{
	double totalFee=0.0;
	Account	account;
	int temp = 365;
	for	(int	i=0;i<accounts.length;i++)	{
	account=accounts[i];
	if(account.accountType==Account.PREMIUM||account.accountType==Account.SUPER_PREMIUM)	
	totalFee+=.0125	*	(	//	1.25%	broker's	fee
			account.loanValue*Math.pow(account.rate,(account.daysActive/365)) - account.loanValue);	//	interest-principal
	}
	return	totalFee;
	}

	public Account(double value, double rate, int account_Type) throws Exception {
		if(value<0)
			throw new Exception();
		else
		{
			loanValue = value;
		}
		this.rate = rate;
		this.accountType = account_Type;
	}
	
	
}