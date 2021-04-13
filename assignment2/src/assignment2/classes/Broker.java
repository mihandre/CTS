package assignment2.classes;

public class Broker {

	public static double calculateYearlyFee(Account[] accounts) {
		double totalFee = 0.0;
		for (int i = 0; i < accounts.length; i++) {
			totalFee += Account.calculateFeeFromAccount(accounts[i]);
		}
		return totalFee;
	}
}
