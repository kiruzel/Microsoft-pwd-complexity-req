/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PasswordReqTest;

import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class PasswordReqTest1 {

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test(expected = RuntimeException.class)
    public void whenPasswordIsEmptyStringReturnExceptionIsThrown() {
        PasswordReq1 input = new PasswordReq1();

        input.validateReq("");
    }

    @Test(expected = RuntimeException.class)
    public void whenPasswordIsLowerCaseReturnFalse() {
        PasswordReq1 input = new PasswordReq1();

        input.validateReq("kirubel");

    }

}
