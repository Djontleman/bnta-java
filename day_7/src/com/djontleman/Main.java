package com.djontleman;

public class Main {

    public static void main(String[] args) {
	// write your code here

        UserDatabase userDatabase = new UserDatabase();
        UserDatabaseService userDatabaseService = new UserDatabaseService();

        userDatabaseService.getDatabaseFromFile("src/data.txt", userDatabase);

        System.out.println(userDatabase);
    }
}
