package com.djontleman;

import com.djontleman.user.Gender;
import com.djontleman.user.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserFileDataAccessService implements UserDAO{

    @Override
    public List<User> getUsers() {
        List<User> users = new ArrayList<>();

        try {
            File file = new File("src/data.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.length() == 0 || !isNumeric(Character.toString(line.charAt(0)))) {
                    continue;
                }

                String[] modifiedLine = line.split(",");

                User user = new User(modifiedLine[0], modifiedLine[1], modifiedLine[2], modifiedLine[3], Gender.valueOf(modifiedLine[4]));
                users.add(user);
//                System.out.println(users);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
            return users;
        }
        return users;
    }

    private static boolean isNumeric(String string) {
        if (string == null) {
            return false;
        }
        try {
            Double.parseDouble(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
