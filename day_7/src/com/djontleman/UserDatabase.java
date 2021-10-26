package com.djontleman;

import java.util.Arrays;

public class UserDatabase {

    private Person[] users;

    public UserDatabase() {};

    public UserDatabase(Person[] users) {
        this.users = users;
    }

    public Person[] getUsers() {
        return users;
    }

    public void setUsers(Person[] users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "UserDatabase{" +
                "users=" + Arrays.toString(users) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDatabase that = (UserDatabase) o;
        return Arrays.equals(users, that.users);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(users);
    }
}
