public class Program {
    public static void main(String[] args) {
        User recipient = new User();
        recipient.setName("Boba Fett");
        recipient.setBalance(27);

        User richSender = new User();
        richSender.setName("Darth Vaider");
        richSender.setBalance(56783);

        User poorSender = new User();
        poorSender.setName("Han Solo");
        poorSender.setBalance(6);

        Transaction billForLukeSkywalker = new Transaction(recipient.getIdentifier(),
                richSender.getIdentifier(), Transaction.transferType.INCOME, 500);
        Transaction billForCorbanisedHanSolo = new Transaction(recipient.getIdentifier(),
                richSender.getIdentifier(), Transaction.transferType.OUTCOME, 300);

        System.out.println(">ADD ONE TEST<\n");
        recipient.getTransactionsList().addTransaction(billForCorbanisedHanSolo);
        printTransactionArray(recipient.getTransactionsList().toArray());
        System.out.println(">REMOVE WRONG<\n");
        try {
            recipient.getTransactionsList().removeTransactionByIdentifier(billForLukeSkywalker.getIdentifier());
        } catch (TransactionNotFoundException transactionNotFoundException)
        {
            System.out.println(transactionNotFoundException.toString() + "\n");
        }

        System.out.println(">REMOVE FIRST ALONE TEST<\n");
        recipient.getTransactionsList().removeTransactionByIdentifier(billForCorbanisedHanSolo.getIdentifier());
        printTransactionArray(recipient.getTransactionsList().toArray());

        System.out.println(">REMOVE FULL FIRST AND LAST, BEFORE:<\n");
        richSender.getTransactionsList().addTransaction(billForLukeSkywalker);
        for (int counter = 0; counter < 2; ++counter) {
            richSender.getTransactionsList().addTransaction(new Transaction(poorSender.getIdentifier(),
                    poorSender.getIdentifier(), Transaction.transferType.INCOME, 7 * (counter + 1)));
        }
        richSender.getTransactionsList().addTransaction(billForCorbanisedHanSolo);
        printTransactionArray(richSender.getTransactionsList().toArray());
        richSender.getTransactionsList().removeTransactionByIdentifier(billForCorbanisedHanSolo.getIdentifier());
        richSender.getTransactionsList().removeTransactionByIdentifier(billForLukeSkywalker.getIdentifier());
        System.out.println(">REMOVE FULL FIRST AND LAST, AFTER:<\n");
        printTransactionArray(richSender.getTransactionsList().toArray());
    }

    public static void printTransactionArray(Transaction [] transactionArray) {
        if (transactionArray.length == 0)
            System.out.println("Empty Array\n");
        for (int counter = 0; counter < transactionArray.length; ++counter) {
            transactionArray[counter].printInConsole();
        }
    }
}
