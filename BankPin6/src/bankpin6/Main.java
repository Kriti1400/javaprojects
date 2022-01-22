
package bankpin6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); //scanner is created to read input
   
        System.out.print("Enter the PIN(q/Q to quit):");
        String input = sc.next(); //stores the user's input in  String variable input
        
        //this creates an instance of the method class and prints the output
        PinValidator pin = new PinValidator(); 
        System.out.println(pin.BankPin(input));
      
    }//end of main method
}
