package ex05;

public class UserNotFoundException extends RuntimeException {
    public String toString()
    {
        return "User is not found.";
    }
}
