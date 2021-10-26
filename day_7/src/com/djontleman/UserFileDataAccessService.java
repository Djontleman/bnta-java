package com.djontleman;

import com.djontleman.person.Gender;
import com.djontleman.person.Person;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class UserFileDataAccessService {

    public int getDatabaseFromFile(String fileName, UserDatabase userDatabase) {

        List<Person> users = userDatabase.getUsers();

        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.contains("id,first_name,last_name,email,gender")) {
                    continue;
                }

                String[] modifiedLine = line.split(",");

                Person user = new Person(modifiedLine[0], modifiedLine[1], modifiedLine[2], modifiedLine[3], Gender.valueOf(modifiedLine[4]));
                users.add(user);
//                System.out.println(users);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
            return 0;
        }
        return 1;
    }
}
