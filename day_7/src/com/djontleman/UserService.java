package com.djontleman;

import com.djontleman.person.Person;

import java.util.List;

public class UserService {

    private UserDAO userDAO;

    public UserService() {}

    public UserService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public List<Person> getUsers() {
        return this.userDAO.getUsers();
    }
}
