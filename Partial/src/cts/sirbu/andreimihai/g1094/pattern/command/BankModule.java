package cts.sirbu.andreimihai.g1094.pattern.command;

public abstract class BankModule {
    public abstract void processTransaction(String sourseAccount, String destinationAccount, double value,
            String destinationBank);
}