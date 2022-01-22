
package assignmnet7;

public class Main {

    public static void main(String[] args) {
        
        //instantiating 2 cards
        Card card1 = new Card();
        Card card2 = new Card();
        
        //instantiating game and category prizes
        Game game1 = new Game("Win Random Tickets!",50);
        PrizeCategory A = new PrizeCategory("candy",10,10);
        PrizeCategory B = new PrizeCategory("teddy bear",50,10);
        PrizeCategory C = new PrizeCategory("guitar",500,10);
        
        //Intantiating terminal and loading cards
        Terminal t = new Terminal(A,B,C);
        t.loadCard(card1, 50);
        t.loadCard(card2, 25);
        
        //Attempt to get prize when insufficient tickets
        t.getPrize(card2, C);
        
        //transferring credits/tickets between cards
        game1.swipe(card1);
        game1.swipe(card2);
        
        t.transfer(card2, card1);
        t.transfer(card1, card2, 25);
        
        t.transfer(card1, card2, 25, 10);
        t.transfer(10, card2, card1);
        
        //card1 gets a prize 
        t.getPrize(card1, A);
        
        //prints total money gained by terminal
        System.out.println(t.getTotal());
    }
}

