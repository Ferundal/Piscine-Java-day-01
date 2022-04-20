package ex00;

public class Program {
    public static void main(String[] args) {

        User recipient = new User();
        recipient.setIdentifier(0);
        recipient.setName("Boba Fett");
        recipient.setBalance(27);
        recipient.printInConsole();
        recipient.setBalance(-53);
        recipient.printInConsole();

        User sender = new User();
        sender.setIdentifier(1);
        sender.setName("Darth Vaider");
        sender.setBalance(56783);
        sender.printInConsole();

        Transaction transaction = new Transaction();
        transaction.setRecipient(recipient.getIdentifier());
        transaction.setSender(sender.getIdentifier());
        transaction.setTransferType(Transaction.transferType.OUTCOME);
        transaction.setTransferAmount(-500);
        transaction.printInConsole();

        transaction.setTransferAmount(600);
        transaction.printInConsole();

        transaction.setTransferType(Transaction.transferType.INCOME);
        transaction.setTransferAmount(600);
        transaction.printInConsole();
    }
}