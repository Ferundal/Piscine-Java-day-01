package ex05;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Menu mainMenu = new Menu();
        if (args.length == 2 && args[0].equals("--profile") && args[1].equals("=dev")) {
            mainMenu.setDevMode(true);
        } else if (args.length != 0) {
            System.out.println("Wrong arguments\n");
            System.exit(-1);
        }
        mainMenu.startMenu();
    }

    public static void printTransactionArray(Transaction[] transactionArray) {
        if (transactionArray.length == 0)
            System.out.println("Empty Array\n");
        for (int counter = 0; counter < transactionArray.length; ++counter) {
            transactionArray[counter].printInConsole();
        }
    }
}
