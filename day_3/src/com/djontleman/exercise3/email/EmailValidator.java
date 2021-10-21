package com.djontleman.exercise3.email;

public class EmailValidator {

    public boolean runLoops(String email) {
        // TODO: Add functionality to check for "@."

        if (!email.contains(".") || !email.contains("@")) {
            return false;
        }

        int atInd = -1;
        int dotInd = -1;

        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                if (atInd!=-1) {
                    return false;
                } else {
                    atInd = i;
                }
            }
            if (email.charAt(i) == '.') {
                dotInd = i;
            }
        }
        return dotInd > atInd;
    }
}
