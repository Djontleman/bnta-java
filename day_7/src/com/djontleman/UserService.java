package com.djontleman;

import com.djontleman.user.User;

import java.util.List;

public class UserService {

    private UserDAO userDAO;

    public UserService() {}

    public UserService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public List<User> getUsers() {
        return this.userDAO.getUsers();
    }
}
