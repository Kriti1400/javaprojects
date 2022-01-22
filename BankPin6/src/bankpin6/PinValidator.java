
package bankpin6;

import java.util.Scanner;

public class PinValidator {
    
    Scanner sc = new Scanner(System.in);
    final int PIN = 1412; //the declared PIN is set as a final as it won't change
    
    //this count will ensure the user enters a max of 6 tries
    //starts at 1 because user has already entered once in main
    int count = 1; 

    //this checks to see if the input is a number 
    public static boolean checkInt(String input){
        return input.matches("\\d+");
    }
    
    //this checks to see if the input is q or Q 
    public static boolean quit(String input){
        return input.toLowerCase().contains("q");
    }
       
    public String BankPin (String input){ 
        
        //infinite loop - will continue forever or until if statements are met
        while (true){ 
            
            //this breaks if the user enters Q/q
            if (quit(input)){
                break;
            }
            
            //this runs if the user enters an integer
            if (checkInt(input)){
                int userPin = Integer.parseInt(input); //parses the input to an int
                if (userPin==PIN){ //checks if pins match
                    return "The correct pin has been entered and you can access your account.";
                }
                else{ //if they don't user enters pin again
                    count++; //increases the count
                    System.out.print("Invalid pin, please try again:");
                    input = sc.next();
                }
            }
            
            //this runs if the input isn't an integer
            else{
                count++; //increases the count
                System.out.print("Not a number, please try again:");
                input = sc.next();
            }
            
            //this terminates the loop if max inputs are entered
            //cannot be a break; 
            if (count==6){ 
                return "The maximum number of attempts have been reached.";
            }    
        
        }//end of while loop
        
    return ("Thanks for visiting!");
    
    }//end of method
}

    
