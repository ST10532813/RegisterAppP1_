package registration.and.login.feature;
import java.util.Scanner;
import static registration.and.login.feature.Login.Registration_and_login_feature.CellPhoneNumber;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



public class Login{
    String Username;
    String Password;
    String CellphoneNumber;
     String firstname;
     String Lastname;
//loop to check if characters are correct
      
//     

      
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
      
        static  boolean checkPasswordComplexity() {
       if( Password.length() <8) {
           System.out.println("Password is too short");
       
           return false;
       }
       else {
           return true;
       }
        boolean hasUpper = false;
        boolean hasNum = false;
        boolean hasSpecial = true;
        String specialChars = "!@#$^&*";
        
    
        for(int i=0; i < Password.length(); i++) { 
            char c = Password.charAt(i);
            if (Character.isUpperCase(c)){
                hasUpper = true;
            } else if (Character.isDigit(c)) { 
                hasNum = true;
            } else if (specialChars.contains(String.valueOf(c))) {
                hasSpecial = true;
                
           //Only return if all flags were flipped to true
           //This is where you read the variables so they aren't used"
           return = (hasUpper && hasNum && hasSpecial && Password.length() >=8);
                
            }     
        
        }
         static boolean CellPhoneNumber(String cellphone) {
             if(cellphone.startsWith("+27")  && cellphone.length() == 12) {
             System.out.println("Cellphone number succesfully added.");
             return true;
             }else{
             System.out.println("Cellphone was incorrectly formatted or does not contain an international code.");
             return false;
             }    
          }
             
            String  registereduser (){
              Scanner inputuser = new Scanner(System.in);  
              
             System.out.println("\n===REGISTER====");
             
             System.out.println("Enter username");
             String Username=inputuser.nextLine();
             
             System.out.println("Enter your password");
             String Password = inputuser.nextLine();
             
             System.out.println("Enter your South African number");
             String cellphoneNumber = inputuser.nextLine();
             
             
             //Checking if all conditions are true
             if(!checkUsername(Username)){
                 return "The username is incorrected formatted.";
             }  
              if (!checkPasswordComplexity(Password)){
                  return( "The password does not meet the complexity requirements.");
              }    
              if (!cellphoneNumber.matches("^(\\+27|27)[0-9]{9}$")){
                  return ("The cellphone number is incorrectly formatted.");
              }else{     
              return( "User has been recognised.");
              
              }
            }
              public boolean loginUser(String enteredUser, String enteredPass, String registeredUser, String registeredPass) {
               if (Username.equals(registeredUser) && enteredPass.equals(registeredPass)) {
                   
                   
                   return true;
               }else{
                    return false;
                 
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
}      

           public static void main(String[] args) {
                  Scanner input = new Scanner(System.in);
                  
                  System.out.println("=== LOGIN ===");
                  System.out.println("Enter name:");
                  String user = input.nextLine();
                  
                   System.out.println("Enter surname:");
                  String surname = input.nextLine();
                  
                  System.out.println("Enter username:");
                   String  username = input.nextLine();
                   
                  System.out.print("Enter Password:  ");
                  String pass = input.nextLine();
                  
                   
                  
//                  boolean isSuccess = loginUser(user, pass, this.registeredUsername, this.registeredPassword);
//                  
//                  returnLoginStatus(isSuccess);
              }      
}         
       
                    
                
                
                            
                            
                            
                            
                            
                            
                            
                        
                                          

                  

                  
                 
                
                  
                  
                  
               
                      
                  
              
              
              
              
             
             
             
         
             
           
              
                 
            
                 
                 
             
                 
             
             
             
             
         
             
         
             
                 
                 
             
               
           
                
                 
                 
                 
             
            
         
             
             
         
            
            
            
        
    
        





        

            
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        

