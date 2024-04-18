package oop.solid.ocp;

import java.util.concurrent.ConcurrentHashMap;

public class MemoryUserRepository implements UserRepository {

    ConcurrentHashMap<String, String> users = new ConcurrentHashMap<>();

    @Override
    public void save(String username, String password) {
        if(isExists(username))
            throw new DuplicateUserException();

        users.put(username, password);
    }

    @Override
    public boolean isExists(String username) {
        if(users.get(username) == null)
            return false;
        return true;
    }
}
