public interface UsersList {
    public void addUser(User newUser);
    public User findByIdentifier(int identifier);
    public User findByIndex(int identifier);
    public int getUserAmount();

}
