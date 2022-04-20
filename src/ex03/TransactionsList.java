package ex03;

import java.util.UUID;

public interface TransactionsList {
    public void addTransaction(Transaction newTransaction);
    public void removeTransactionByIdentifier(UUID identifier);
    public Transaction[] toArray();
}
