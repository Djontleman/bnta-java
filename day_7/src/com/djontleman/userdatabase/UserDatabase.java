package com.djontleman.userdatabase;

import com.djontleman.user.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UserDatabase {

    private List<User> users;

    public UserDatabase() {
        this.users = new ArrayList<>();
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "UserDatabase{" +
                "users=" + users +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDatabase that = (UserDatabase) o;
        return Objects.equals(users, that.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(users);
    }
}

