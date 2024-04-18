package oop.solid.ocp;

public interface UserRepository {
    public void save(String username, String password);
    public boolean isExists(String username);
}
