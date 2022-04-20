package ex02;

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

        UsersArrayList dataBase = new UsersArrayList();
        dataBase.addUser(recipient);
        dataBase.addUser(poorSender);
        dataBase.addUser(richSender);

        System.out.println(">SEARCH TEST<");
        try {
            dataBase.findByIndex(1).printInConsole();
            dataBase.findByIdentifier(1).printInConsole();
            dataBase.findByIndex(356);
        }
        catch (UserNotFoundException exception) {
            System.out.println("EXCEPTION: " + exception.toString() + "\n");
        }

        dataBase.addUser(poorSender);

        System.out.println(">ARRAY INCREASE TEST<");
        for (int counter = 0; counter < 13; ++counter) {
            User tempUser = new User();
            tempUser.setName("Temp User " + counter);
            tempUser.setBalance(456 + 7 * counter);
            dataBase.addUser(tempUser);
        }

        for (int counter = 0; counter < dataBase.getUserAmount(); ++counter) {
            dataBase.findByIdentifier(counter).printInConsole();
        }
    }
}
