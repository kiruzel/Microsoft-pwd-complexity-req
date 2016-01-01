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
public class PasswordReq1 {

    public void validateReq(String password) {

        if (password.equals("")) {
            throw new RuntimeException("Password entery is required");
        } else{            
           if (!password.toUpperCase().equals(password)) {
                throw new RuntimeException("Uppercase only required");
            } else {
                System.out.println("Uppercase requirement met");
            } 
        }

    }

}
