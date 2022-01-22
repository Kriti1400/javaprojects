
package assignmnet7;

public class Card {

    //fields
    private int creditBalance;
    private int ticketBalance;
    private final int CARD_NUMBER;
    private static int SET_CARD = 1;
    
    //constructors
    public Card(){
        this.creditBalance = 0;
        this.ticketBalance = 0;
        CARD_NUMBER = SET_CARD++;
    }
    
    //overloading constructors
    public Card(int creditBalance){ //for possible promotions
        this.creditBalance = creditBalance;
        this.ticketBalance = 0;
        CARD_NUMBER = SET_CARD++;
    }
    
    //methods
    public int getCreditBalance() {
        return creditBalance;
    }
    public void setCreditBalance(int newCreditBalance) {
        this.creditBalance = newCreditBalance;
    }

    public int getTicketBalance() {
        return ticketBalance;
    }
    public void setTicketBalance(int newTicketBalance) {
        this.ticketBalance = newTicketBalance;
    }
    
    public int getCardNumber(){
        return CARD_NUMBER;
    }
       
    @Override
    public String toString(){
        return ("Card number: "+CARD_NUMBER+"\nCredit Balance: "+creditBalance+
                "\nTicket Balance: "+ticketBalance);
    }
}
