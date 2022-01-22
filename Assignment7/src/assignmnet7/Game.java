
package assignmnet7;

import java.util.Random;

public class Game {
    
    //fields
    private String gameName;
    private int requiredCredits;
    private int ticketsWon;
    private String cardInfo = "";
    
    //constructors
    public Game(String gameName, int requiredCredits){
        this.gameName = gameName;
        this.requiredCredits = requiredCredits;
        this.ticketsWon = 0;
    }
    
    //methods
    public String getGameName() {
        return gameName;
    }

    public int getRequiredCredits() {
        return requiredCredits;
    }

    public int getTicketsWon() {
        return ticketsWon;
    }
    
    Card card = new Card();
    public void swipe(Card card){
        cardInfo = "";
        System.out.println(card.toString());
        if (card.getCreditBalance()<requiredCredits){
            System.out.println("You don't have enough credits to play.");
        }
        else{
            card.setCreditBalance(card.getCreditBalance()-requiredCredits);
            System.out.println("Game 1:");
         
            Random rand1 = new Random();
            int ticketsWon1 = rand1.nextInt(50)+1;
            System.out.println("You won "+ticketsWon1+" tickets.");
            ticketsWon += ticketsWon1;
            card.setTicketBalance(ticketsWon);
            System.out.println("Ticket balance: "+card.getTicketBalance());
        }
        System.out.println(card.toString());
    }
}
