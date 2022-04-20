package ex04;

public class IllegalTransactionException extends RuntimeException {
    public String toString() {
        return "We need more gold!";
    }
}
