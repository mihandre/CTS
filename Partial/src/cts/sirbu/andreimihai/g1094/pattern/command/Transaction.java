package cts.sirbu.andreimihai.g1094.pattern.command;

public class Transaction extends BankModule implements AsyncTransactionInterface{
	String sourceAccount;
	String destinationAccount;
	String destinationBank;
	double amountToTransfer;
	

	
	
	public Transaction(String sourceAccount, String destinationAccount, String destinationBank, double amountToTransfer) {
		this.sourceAccount = sourceAccount;
		this.destinationAccount = destinationAccount;
		this.destinationBank = destinationBank;
		this.amountToTransfer = amountToTransfer;
	}


	

	public Transaction(String sourceAccount, String destinationAccount, double amountToTransfer) {
		this.sourceAccount = sourceAccount;
		this.destinationAccount = destinationAccount;
		this.amountToTransfer = amountToTransfer;
		this.destinationBank = "";
	}




	@Override
	public void awaitTransaction() {
		this.processTransaction(sourceAccount, destinationAccount, amountToTransfer, destinationBank);
		
	}

	@Override
	public void processTransaction(String sourseAccount, String destinationAccount, double value,
			String destinationBank) {
		System.out.println("Processing: " + sourseAccount +
				" - " + destinationAccount + " | " + value);
	}
	
	
	
}
