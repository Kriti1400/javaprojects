
package multiples6;

import java.util.Scanner;

public class Multiples6Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); //scanner is created to read input
   
        System.out.print("Choose a number:");
        int num = sc.nextInt(); //user inputs a number
        
        //this creates an instance of the method class and prints the output
        Multiples6 multiply = new Multiples6(); 
        System.out.println(multiply.Multiples(num));
        
    }//end of main method
}
