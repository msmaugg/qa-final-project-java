package com.msmaugg.homework.temaCurs10;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    private List<User> users = new ArrayList<>();

    public void addUser(User user) throws InvalidUserDataException {
        if (user == null) {
            throw new InvalidUserDataException("Utilizatorul nu poate fi null.");
        }
        if (user.getUsername() == null || user.getUsername().length() < 3) {
            throw new InvalidUserDataException(
                    "Username-ul trebuie sa aiba cel puțin 3 caractere.");
        }
        if (user.getAge() < 0) {
            throw new InvalidUserDataException("Varsta nu poate fi negativa.");
        }
        users.add(user);
    }

    public List<User> getUsers() {
        return users;
    }
}
