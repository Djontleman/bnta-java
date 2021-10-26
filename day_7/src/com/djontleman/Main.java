package com.djontleman;

import com.djontleman.userdatabase.UserDatabase;
import com.djontleman.userdatabase.UserDatabaseService;

public class Main {

    public static void main(String[] args) {

//        useUserDatabase();
        useUserFileDataAccessService();
    }

    private static void useUserDatabase() {
        UserDatabase userDatabase = new UserDatabase();
        UserDatabaseService userDatabaseService = new UserDatabaseService();

        userDatabaseService.getDatabaseFromFile("src/data.txt", userDatabase);

        System.out.println(userDatabase);
    }

    private static void useUserFileDataAccessService() {
        UserFileDataAccessService userFileDataAccessService = new UserFileDataAccessService();
        System.out.println(userFileDataAccessService.getUsers());
    }
}
