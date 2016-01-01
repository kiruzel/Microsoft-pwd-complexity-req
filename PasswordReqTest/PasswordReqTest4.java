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
public class PasswordReqTest4 {
    
  

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
     @Test(expected = RuntimeException.class)
    public void whenEmptyStringThenReturnException() {
        PasswordReq4 input = new PasswordReq4();

        input.validateReq("");
    }

    @Test(expected = RuntimeException.class)
    public void whenLowerCaseThenFalse() {
        PasswordReq4 input = new PasswordReq4();

        input.validateReq("kirubel");

    }
    
    @Test(expected = RuntimeException.class)
    public void whenLowerCaseAndUppercaseThenTrue() {
        PasswordReq4 input = new PasswordReq4();

        input.validateReq("KIRubel");
        
    }
    
    @Test(expected = RuntimeException.class)
    public void whenLowerCaseAndUpperWithOutDigitThenFalse(){
          PasswordReq4 input = new PasswordReq4();

        input.validateReq("KIRubel");
        
    }
    
    @Test(expected = RuntimeException.class)
     public void whenLowerCaseAndUpperWithOutDigitThenTrue(){
          PasswordReq4 input = new PasswordReq4();

        input.validateReq("KIRub3el");
        
     
    }
     
     @Test(expected = RuntimeException.class)
     public void whenNonAphaNumericCharacterThenFalse(){
         PasswordReq4 input = new PasswordReq4();
         
         input.validateReq("Kirubel21");
         
     }
     
     @Test
      public void whenNonAphaNumericCharacterThenTrue(){
         PasswordReq4 input = new PasswordReq4();
         
         input.validateReq("Kirubel21/-");
         Assert.assertTrue(true);
     }
   
}
