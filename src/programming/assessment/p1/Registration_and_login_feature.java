import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Registration_and_login_feature$Loginclass;



class Login{
    String Username;
    String Password;
    String CellphoneNumber;
         
//loop to check if characters are correct
      
//     
}
      
/**
 *
 * @author Student
 */
public class Registration_and_login_feature {
   // Creating a Scanner object to check if the Username contains an underscore and is not more than 5 characters
    Scanner inputuser = new Scanner(System.in);
    
    //Creating a method to verify the username validation
    boolean checkUsername(String Username){
        if(Username.contains("_") && Username.length()==5 &&Username.matches("J9*/Q")){
       return true;
        }else{
           System.out.println("The Username must contain an Underscore and must be 5 characters long");
           return false;
        }
      
         boolean checkPasswordComplexity(String password) {
       if (password == null || password.length() <=8) return false;
         boolean hasUpper = false;
        boolean hasNum = false;
        boolean hasSpecial = false;
        String specialChars = "!@#$^&*";
        
    
        for (int i=0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)){
                hasUpper = true;
            } else if (Character.isDigit(c)) { 
                hasNum = true;
            } else if (specialChars.contains(String.valueOf(c))) {
                hasSpecial = true;
                
           //Only return if all flags were flipped to true
           //This is where you read the variables so they aren't used"
           return hasUpper && hasNum && hasSpecial && password.length() >=8;
                
                
        }
         static boolean checkCellPhoneNumber(String cellphone) {
             if(cellphone.startsWith("+27")  && cellphone.length() == 12) {
             System.out.println("Cellphone number succesfully added.");
             return true;
             }else{
             System.out.println("Cellphone was incorrectly formatted or does not contain an international code.");
             return false;
             
             }
             
            String  registeruser (){
              Scanner inputuser = new Scanner(System.in);  
              
             System.out.println("\n===REGISTER====");
             
             System.out.println("Enter username");
             String Username=inputuser.nextLine();
             
             System.out.println("Enter your password");
             String Password = inputuser.nextLine();
             
             System.out.println("Enter your South African number");
             String CellphoneNumber = inputuser.nextLine();
             
             
             //Checking if all conditions are true
             if(!checkusername(Username)){
                 return "The username is incorrected formatted.";
                 
              if (!checkpasswordComplexity(Password)){
                  return "The password does not meet the complexity requirements.";
                  
              if (!Cellphone.matches("^(\\+27|27)[0-9]{9}$")){
                  return "The cellphone number is incorrectly formatted.";
                  
              return "User has been recognised.";
              
              
              
              public boolean loginUser(String enteredUser, String enteredPass, String registeredUser, String registeredPass) {
               if (enterUser.equals(registeredUser) && enteredPass.equals(registeredPass)) {
                   
               }else{
                    return false;
                 
               }    
                  public void verifyLogin() {
                  Scanner input = new Scanner(System.in);
                  
                  System.out.println("=== LOGIN ===");
                  System.out.println("Enter Username:");
                  String user = input.nextLine();
                  
                  System.out.print("Enter Password:  ");
                  String pass = input.nextline();
                  
                  boolean isSuccess = loginUser(user, pass, this.registeredUsername, this.registeredPassword);
                  
                  returnLoginStatus(isSuccess);
              }      
                  }
                 public void returnLoginStatus(boolean loginSuccessful) {
                     
                  //Checking the flag  sent from the boolan loginUser method
                  if (loginSuccessful) {
                      System.out.println("Successful login");
                  }else{
                      //This handles the 'false' case (incorrect username or password)
                      System.out.println("A sequential error ccurred while logging in. Invalid username or password.");
                  }
              }
                     
                  public void runTest() {
                      String testUsername = "Kyl_1";
                      boolean expectedValue = true;
                      
                      System.out.println("Test Status: PASSED");
                  } else {
                  System.out.println("Test Status: PASSED");
                  System.out.println("Reason: Method returned false, but we expected true.");
                  
                
         
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
                     
                    public void verifyWelcomeMessage(String firstName, String lastname) {
                        String expected = "Welcome " + firstName + " " + lastName + ", it is great to see you.";
                        
                        String actual = getWelcomeMessage(firstName, lastName);
                        
                        System.out.println("Test Data: Kyl_1");
                        if (actual.equals(expected)) {
                            System.out.println("Actual Response: " + actual);
                            System.out.println("Verification: SUCCESS");
                        } else {
                            System.out.println("Verification: FAILED");
                            System.out.println("Expected: " + expected );
                            System.out.println(Actual: " + actual);
                        }
                        
                        
                        
                    }
                public void testUsername() {
                    
                  String testData = "Ch&&sec@ke99";
                  String expected = "Username is not correctly formatted:please ensure that your username contains and is not more than 5 Characters";
                  
                  String actual = registerUser(testData, "ValidPass123!", "2782121345687");
                  
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
                    String ecpected = "The cellphone number is correctly formatted or does not contain an international code please try again coorect the number and try againa";
                    
                    //Logic inside your method:
                   if (!testCell.matches("^(\\+27|27)[0-9]{9}$")) {
                       System.out.println("Cellphone Test: PASSED (Correctly identified invalid format)");
                   }
                }    
                        
                        
                    
                    
                    
                
                
                            
                            
                            
                            
                            
                            
                            
                        
                        
                    
                  

                  

                  
                 
                
                  
                  
                  
               
                      
                  
              
              
              
              
             
             
             
         
             
           
              
                 
            
                 
                 
             
                 
             
             
             
             
         
             
         
             
                 
                 
             
               
           
                
                 
                 
                 
             
            
         
             
             
         
            
            
            
        
    
        





        

            
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
}
