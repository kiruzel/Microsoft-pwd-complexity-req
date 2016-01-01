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
public class PasswordReqTest3 {
    
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
     @Test(expected = RuntimeException.class)
    public void whenPasswordIsEmptyStringReturnExceptionIsThrown() {
        PasswordReq3 input = new PasswordReq3();

        input.validateReq("");
    }

    @Test(expected = RuntimeException.class)
    public void whenPasswordIsLowerCaseReturnFalse() {
        PasswordReq3 input = new PasswordReq3();

        input.validateReq("kirubel");

    }
    
    @Test(expected = RuntimeException.class)
    public void whenPasswordIsLowerCaseAndUppercaseReturnTrue() {
        PasswordReq3 input = new PasswordReq3();

        input.validateReq("KIRubel");
        
       Assert.assertTrue(true);
        

    }
    
    @Test 
    public void whenPasswordIsLowerCaseAndUpperWithOutDigitItReturnsFalse(){
          PasswordReq3 input = new PasswordReq3();

        input.validateReq("KIRub3el");
         Assert.assertTrue(true);
     
    }
}
