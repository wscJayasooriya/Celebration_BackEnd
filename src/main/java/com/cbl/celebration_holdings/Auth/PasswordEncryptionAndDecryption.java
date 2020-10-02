package com.cbl.celebration_holdings.Auth;

import java.util.Base64;

public class PasswordEncryptionAndDecryption {

    public static void main(String args[]){
        String password = "Programmer";
        System.out.println("Password : "+password);
        String encryptedString = getEncodedString(password);
        System.out.println("Encrypted Password : "+encryptedString);
    }

    private static String getEncodedString(String password) {
        return Base64.getEncoder().encodeToString(password.getBytes());
    }
}
