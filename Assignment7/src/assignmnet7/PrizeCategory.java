
package assignmnet7;

public class PrizeCategory {
    
    //fields
    private String prizeName;
    private int requiredTickets;
    private int itemCount;
    
    //constructors
    public PrizeCategory(String prizeName, int requiredTickets, int itemCount){
        this.prizeName = prizeName;
        this.requiredTickets = requiredTickets;
        this.itemCount = itemCount;
    }
    
    //methods
    public int getItemCount() {
        return itemCount;
    }
    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }
    
    public String getPrizeName() {
        return prizeName;
    }
    public void setPrizeName(String prizeName) {
        this.prizeName = prizeName;
    }

    public int getRequiredTickets() {
        return requiredTickets;
    }
    public void setRequiredTickets(int requiredTickets) {
        this.requiredTickets = requiredTickets;
    }
    
    @Override
    public String toString(){
        return ("Prize: "+prizeName+"\nRequired Tickets: "+requiredTickets+"\n"+
                itemCount+" more remaining.");
    }
}
