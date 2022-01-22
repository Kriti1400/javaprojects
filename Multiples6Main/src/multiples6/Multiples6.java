
package multiples6;

public class Multiples6 {
    
    public String Multiples (int num){ 
        
        //the loop runs from 1 to num and prints the multiples of num
        for (int i=1; i<=num;i++) {
            System.out.println(num+"x"+i+" = "+(num*i));
        } //end of for loop
   
        return "All multiples have been printed.";
    }
}//end of class

    
