
package accounttest;

public class CheckingAccount {
    
    public double balance;
    public String name;
    
    public String withdraw(double withdrawAmount){
        if (withdrawAmount>balance){
            return ("The balance is too low to make the withdrawal.");
        }
        if (withdrawAmount<0){
            return ("The withdraw amount is negative.");
        }
        else
            balance = balance - withdrawAmount;
            return ("The new balance is " + balance);
    }
    
}
