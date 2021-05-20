package cts.sirbu.andreimihai.g1094.pattern.command;

public class TestCommand {

	public static void main(String[] args) {
		TransactionProcessor transactionProcessor = new TransactionProcessor();

		transactionProcessor.addTransaction(new Transaction("Sirbu", "Popescu", "ING", 1000));
		transactionProcessor.addTransaction(new Transaction("Sirbu", "Ionescu", "BRD", 1500));
		transactionProcessor.addTransaction(new Transaction("Sirbu", "Golescu", 2000));
		transactionProcessor.addTransaction(new Transaction("Sirbu", "Golescu", 2000));
		
		System.out.println("Transaction Processor has started");
		
		transactionProcessor.processNextTransaction();
		transactionProcessor.processNextTransaction();
		transactionProcessor.processNextTransaction();
		transactionProcessor.processNextTransaction();
		
		System.out.println("Transaction Processor has started");
	}

}
