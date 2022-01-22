
package assignmnet7;

public class Terminal { 
    
    //fields
    private PrizeCategory A,B,C;
    private int total;
    
    //constructors
    public Terminal (PrizeCategory A, PrizeCategory B, PrizeCategory C){
        this.A = A;
        this.B = B;
        this.C = C;
    }
            
    //methods
    public PrizeCategory getA() {
        return A;
    }
    public void setA(PrizeCategory A) {
        this.A = A;
    }

    public PrizeCategory getB() {
        return B;
    }
    public void setB(PrizeCategory B) {
        this.B = B;
    }

    public PrizeCategory getC() {
        return C;
    }
    public void setC(PrizeCategory C) {
        this.C = C;
    }
    
    //Gets the amount total from all the money entered
    public String getTotal() {
        return ("Total money earned from terminal: $"+total);
    }
    
    public void loadCard(Card card, int amount){
        card.setCreditBalance(card.getCreditBalance()+(amount*2));
        this.total+=amount;
        display(card);
    }
    
    public void display(Card card){
        System.out.println(card.toString());
    }
       
    public void transfer(Card in, Card out, int credits, int tickets){//for specific transfers of credits/tickets
        if (in.getCreditBalance()<credits){
            System.out.println("The transaction cannot be completed as there are insufficient credits.");
        }
        else if (in.getTicketBalance()<tickets){
            System.out.println("The transaction cannot be completed as there are insufficient tickets.");
        }
        else{
            out.setCreditBalance(out.getCreditBalance()+credits);
            in.setCreditBalance(in.getCreditBalance()-credits);
            out.setTicketBalance(out.getTicketBalance()+tickets);
            in.setTicketBalance(in.getTicketBalance()-tickets);
            display(in);
            display(out);
        }
    }
    public void transfer(Card in, Card out){ //for full transfers(Card in will be empty)
        out.setCreditBalance(out.getCreditBalance()+in.getCreditBalance());
        in.setCreditBalance(0);
        display(in);
        display(out);
    }
    public void transfer(Card in, Card out, int credits){ //just for credits
        if (in.getCreditBalance()<credits){
            System.out.println("The transaction cannot be completed as there are insufficient credits.");
        }
        else{
            out.setCreditBalance(out.getCreditBalance()+credits);
            in.setCreditBalance(in.getCreditBalance()-credits);
            display(in);
            display(out);
        }
    }
    public void transfer(int tickets, Card in, Card out){ //just for tickets
        if (in.getTicketBalance()<tickets){
            System.out.println("The transaction cannot be completed as there are insufficient tickets.");
        }
        else{
            out.setTicketBalance(out.getTicketBalance()+tickets);
            in.setTicketBalance(in.getTicketBalance()-tickets);
            display(in);
            display(out);
        }
    }
    
    public void getPrize(Card card, PrizeCategory prize){
        if (card.getTicketBalance()>=prize.getRequiredTickets()){
           prize.setItemCount(prize.getItemCount()-1);
           card.setTicketBalance(card.getTicketBalance()-prize.getRequiredTickets());
           System.out.println("Congratulations! You got: "+prize.getPrizeName());
           System.out.println("There are "+prize.getItemCount()+" more of this prize available.");
        }
        else if (prize.getItemCount()==0){
           System.out.println("This type of prize is no longer available.");
        }
        else{
           System.out.println("You do not have enough tickets to get the prize.");
        }
    }
    
    @Override
    public String toString(){
        return ("A: "+A+"\nB: "+B+"\nC: "+C+"\nTotal: "+total);
    }
}
