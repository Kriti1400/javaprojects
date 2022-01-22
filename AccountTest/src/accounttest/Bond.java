
package accounttest;

public class Bond {
    //fields
    public String name;
    public double balance, interestRate;
    public int month, monthRemaining;
    
    //methods
    public void setTermAndRate (int month){
        if (month>=0 && month<=11){
             interestRate = 0.005;
        }
        else if (month>=12 && month<=23){
             interestRate = 0.010;
        }
        else if (month>=24 && month<=35){
             interestRate = 0.015;
        }
        else if (month>=36 && month<=47){
             interestRate = 0.020;
        }
        else if (month>=48 && month<=60){
             interestRate = 0.025;
        }
        else{
             System.out.println("Invalid term.");
        }
        monthRemaining = month ;
    }
    
    public void earnInterest(){
        if (monthRemaining==0){
            System.out.println("Bond Matured.");
        }
        else{
            balance = balance + (balance*(interestRate/12));
            monthRemaining--;
            System.out.println("Balance: $" + balance);
            System.out.println("Interest Rate: " + interestRate);
            System.out.println("Months Remaining: " + monthRemaining);
        }
    } 
}
