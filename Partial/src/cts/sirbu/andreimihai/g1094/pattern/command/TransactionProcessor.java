package cts.sirbu.andreimihai.g1094.pattern.command;

import java.util.ArrayList;

public class TransactionProcessor extends BankModule {

	ArrayList<Transaction> transactions = new ArrayList<>();
	
	public void addTransaction(Transaction transaction) {
		this.transactions.add(transaction);
	}
	
	
	@Override
	public void processTransaction(String sourseAccount, String destinationAccount, double value,
			String destinationBank) {
		System.out.println("Processing: " + sourseAccount +
				" - " + destinationAccount + " | " + value);
	}
	
	public void processNextTransaction() {
		if(transactions.size() > 0) {
			Transaction transaction = this.transactions.get(0);
			if(transaction.destinationBank != "") {
				transaction.processTransaction(transaction.sourceAccount, transaction.destinationAccount, transaction.amountToTransfer, transaction.destinationBank);
				this.transactions.remove(0);
			} else {	
				transaction.awaitTransaction();
				this.transactions.remove(0);
			}
		}
	}
}
