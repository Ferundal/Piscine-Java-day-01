public class Program {
    public static void main(String[] args) {
        User recipient = new User();
        recipient.setName("Boba Fett");
        recipient.setBalance(27);
        recipient.printInConsole();

        User richSender = new User();
        richSender.setName("Darth Vaider");
        richSender.setBalance(56783);
        richSender.printInConsole();

        UserIdsGenerator newOne = UserIdsGenerator.getInstance();

        User poorSender = new User();
        poorSender.setName("Han Solo");
        poorSender.setBalance(6);
        poorSender.printInConsole();
    }
}
