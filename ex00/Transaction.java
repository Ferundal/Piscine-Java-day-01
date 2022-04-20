package ex00;

import java.util.UUID;

public class Transaction {
    enum transferType {
        INCOME("Income", "+"), OUTCOME("Outcome", "-");

        private String name;
        private String sign;

        transferType(String text, String sign) {
            this.name = text;
            this.sign = sign;
        }

        @Override
        public String toString() {
            return name;
        }

        public String getSign() {
            return sign;
        }
    }

    private final UUID identifier;
    private Integer recipient;
    private Integer sender;
    private transferType transferType;
    private Integer transferAmount;

    Transaction () {
        identifier = UUID.randomUUID();
    }

    public UUID getIdentifier() {
        return identifier;
    }

    public int getRecipient() {
        return recipient;
    }

    public void setRecipient(int recipient) {
        this.recipient = recipient;
    }

    public int getSender() {
        return sender;
    }

    public void setSender(int sender) {
        this.sender = sender;
    }

    public Transaction.transferType getTransferType() {
        return transferType;
    }

    public void setTransferType(Transaction.transferType transferType) {
        this.transferType = transferType;
    }

    public int getTransferAmount() {
        return transferAmount;
    }

    public void setTransferAmount(int transferAmount) {
        if ((transferAmount > 0 && transferType == transferType.INCOME)
            || (transferAmount < 0 && transferType == transferType.OUTCOME)){
            this.transferAmount = transferAmount;
        }
    }
    public void printInConsole() {
        System.out.println("ID->" + this.getIdentifier()
                + "\nTYPE->" + this.transferType.toString()
                + "\nRECIPIENT->" + this.getRecipient()
                + "\nSENDR->" + this.getSender()
                + "\nTRANSFER AMOUNT->" + this.transferType.getSign() + this.getTransferAmount() +'\n');
    }
}
