/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PasswordReqTest;

/**
 *
 * @author User
 */
public class PasswordReq4 {

    public void validateReq(String password) {
        boolean checkUpper = false;
        boolean checkLower = false;
        boolean checkDigit = false;
        boolean checkNonAlpha = false;

        String nonalphaChar = "~!@#$%^&*_-+=`|\\(){}[]:;\"'<>,.?/";

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                checkUpper = true;
            }
            if (Character.isLowerCase(ch)) {
                checkLower = true;
            }
             if(Character.isDigit(ch)){
                 checkDigit=true;
             }

        }

        //check nonAplaNumbric
       for (int j = 0; j < nonalphaChar.length(); j++) {
            char nonAl = nonalphaChar.charAt(j);
            if (password.indexOf(nonAl) != -1) {
                checkNonAlpha = true;
            }
        }

        if (password.equals("")) {
            throw new RuntimeException("Password entery is required");
        }

        if (checkUpper && checkLower && checkDigit && checkNonAlpha) {
            System.out.println("The password meets uppercase,lowercase,digit, nonAlphaNumeric requirement");
        }
        if (!checkUpper) {
            throw new RuntimeException("The password does not have uppercase");
        }
        if (!checkLower) {
            throw new RuntimeException("The password does not have lowercase");
        }
        if (!checkDigit) {
            throw new RuntimeException("The password does not contain digit");
        }
        if (!checkNonAlpha){
             throw new RuntimeException("The password does not contain nonAlphaNumberic");
        }

    }
}
