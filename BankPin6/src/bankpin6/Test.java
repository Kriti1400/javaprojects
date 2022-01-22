
package bankpin6;

public class Test {
    
    public static void main(String args[]){
        PinValidator test = new PinValidator();
        
        //testing inputs 1412, q, Q, w
        System.out.println("Testing PinValidator method...");
        
        //1412 expected "The correct pin has been entered and you can access your account."
        System.out.println("Test 1...testing 1412: " + test.BankPin("1412").equals("The correct pin has been entered and you can access your account."));
        
        //q expected "Thanks for visiting!"
        System.out.println("Test 2...testing q: " + test.BankPin("q").equals("Thanks for visiting!"));
        
        //Q expected "The colour is violet."
        System.out.println("Test 3...testing Q: " + test.BankPin("Q").equals("Thanks for visiting!"));
        
        //w expected "Not a number, please try again:"
        System.out.println("Test 4...testing w: " + test.BankPin("w").equals("Not a number, please try again:"));
    }
}
