package ex01;

public class User {
    private Integer identifier;
    private String name;
    private int balance;
    {
        identifier = UserIdsGenerator.getInstance().generateId();
    }

    User () {}

    public int getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance >= 0) {
            this.balance = balance;
        }
    }

    public void printInConsole() {
        System.out.println("ID->" + this.getIdentifier()
                + "\nNAME->" + this.getName()
                + "\nBALANCE->" + this.getBalance() + "\n");
    }
}
