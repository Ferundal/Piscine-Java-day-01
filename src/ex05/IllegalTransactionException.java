package ex05;

public class IllegalTransactionException extends RuntimeException {
    public String toString() {
        return "We need more gold!";
    }
}
