package com.djontleman;

import com.djontleman.person.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UserDatabase {

    private List<Person> users;

    public UserDatabase() {
        this.users = new ArrayList<>();
    }

    public List<Person> getUsers() {
        return users;
    }

    public void setUsers(List<Person> users) {
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

