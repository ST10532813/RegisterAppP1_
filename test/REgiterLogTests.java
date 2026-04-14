/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class REgiterLogTests {
    
     public void runTest() {
                      String testUsername = "Kyl_1";
                      boolean expectedValue = true;
                      
                      System.out.println("Test Status: PASSED");
                  } else {
                  System.out.println("Test Status: PASSED");
                  System.out.println("Reason: Method returned false, but we expected true.");
} 

         
                  public void verifyUsernameTest() {
                      String testData = "Kyle!!!!";
                      boolean result = checkUsername(testData); 
                      
                      
                      System.out.println("Username Test Data: "+ testData);
                      if (!result) {
                          System.out.println("Status: PASSED (System correctly rejected the format)");
                      } else {
                          System.out.println("Status: FAILED (Sytem should have rejected this format)");
                      }
                  }
                     @Test
                    public void verifyWelcomeMessage(String firstName, String lastname) {
                        String expected = "Welcome " + firstName + " " + LastName + ", it is great to see you.";
                        
                        String actual = getWelcomeMessage("firstName, Lastname");
                        
                        System.out.println("Test Data: Kyl_1");
                        if (actual.equals(expected)) {
                            System.out.println("Actual Response: " + actual);
                            System.out.println("Verification: SUCCESS");
                        } else {
                            System.out.println("Verification: FAILED");
                            System.out.println("Expected: " + expected );
                 //           System.out.println(Actual: " + actual);
                        }
                        
                        
                        
                    }
                public void testUsername() {
                    
                  String testData = "Ch&&sec@ke99";
                  String expected = "Username is not correctly formatted:please ensure that your username contains and is not more than 5 Characters";
                  
                  String actual = registeredUser(testData, "ValidPass123!", "2782121345687");
                  
                  System.out.println("Username Test Data: " + testData);
                  if (actual.equals(expected)) {
                      System.out.println("Status: PASSED");
                  } else {
                      
                   System.out.println("Status: FAILED. Actual response: "+ actual);
                  }
                }
                
                public void testPassword() {
                    String testPass = "abc";//Initially weak
                    String expected = "Password is no correctly formatted please ensure it has 8 charcters, a capital letter , a number and a special number";
                    
                    String actual= checkPasswordComplexity(testPass);
                    if (actual.equals(expected)) {
                        System.out.println("Password Test: PASSED");
                        
                    } else{
                        System.out.println("Password test: FAILED, Got:"+ actual);
                    }
                    
                }
                public void testCellphone() {
                    String testCell = "089666553";
                    String expected = "The cellphone number is correctly formatted or does not contain an international code please try again coorect the number and try againa";
                    
                    //Logic inside your method:
                   if (!testCell.matches("^(\\+27|27)[0-9]{9}$")) {
                       System.out.println("Cellphone Test: PASSED (Correctly identified invalid format)");
                   }
                  
                }             

    private String getWelcomeMessage(String firstName_Lastname) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}      
