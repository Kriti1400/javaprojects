
package accounttest;

public class AccountTest {

    public static void main(String[] args) {
        
        CheckingAccount check = new CheckingAccount ();
        check.balance = 3000.5;
        check.name = "Bob";
        System.out.println(check.withdraw(500));
        System.out.println(check.withdraw(-200));
        System.out.println(check.withdraw(5000));
        
        Bond amount = new Bond ();
        amount.setTermAndRate(60);
        
    }
    
}
