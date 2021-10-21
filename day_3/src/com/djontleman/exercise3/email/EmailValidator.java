package com.djontleman.exercise3.email;

public class EmailValidator {

    public boolean runLoops(String email) {

        if (!email.contains(".") || !email.contains("@") ||
                email.contains("@.") || email.contains("..")) {
            return false;
        }

        int atInd = -1;
        int dotInd = -1;

        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                if (atInd != -1) {
                    return false;
                } else {
                    atInd = i;
                    if (atInd == 0) {
                        return false;
                    }
                }
            }
            if (email.charAt(i) == '.') {
                dotInd = i;
                if (dotInd == email.length() - 1) {
                    return false;
                }
            }
        }
        return atInd < dotInd;
    }
}
