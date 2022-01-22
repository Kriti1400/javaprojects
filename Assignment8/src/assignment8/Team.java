
package assignment8;

public class Team {
    //fields
    private String teamName;
    private int teamWin;
    private int teamLoss;
    private int teamTie;
    private int goalsScored;
    private int goalsAllowed;
    
    //constructors
    public Team(){
        this.teamWin = 0;
        this.teamLoss = 0;
        this.teamTie = 0;
        this.goalsScored = 0;
        this.goalsAllowed = 0;
    }
    
    public Team(String teamName){ //allows user to enter the teams name
        this.teamName = teamName;
    }
    
    //methods
    public String getTeamName() {
        return teamName;
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getTeamWin() {
        return teamWin;
    }
    public void setTeamWin(int teamWin) {
        this.teamWin = teamWin;
    }

    public int getTeamLoss() {
        return teamLoss;
    }
    public void setTeamLoss(int teamLoss) {
        this.teamLoss = teamLoss;
    }

    public int getTeamTie() {
        return teamTie;
    }
    public void setTeamTie(int teamTie) {
        this.teamTie = teamTie;
    }
    
    public int getGoalsScored() {
        return goalsScored;
    }
    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }
    
    public int getGoalsAllowed() {
        return goalsAllowed;
    }
    public void setGoalsAllowed(int goalsAllowed) {
        this.goalsAllowed = goalsAllowed;
    }

    public void winAdd(){
        this.teamWin++;
    }
    public void lossAdd(){
        this.teamLoss++;
    }
    public void tieAdd(){
        this.teamTie++;
    }
    public void goalsScoredAdd(int goals){
        this.setGoalsScored(this.getGoalsScored() + goals);
    }
    public void goalsAllowedAdd(int goals){
        this.setGoalsAllowed(this.getGoalsAllowed() + goals);
    }
    
    @Override
    public String toString() {
        return "Team: " + teamName + "\n    Total wins: " + teamWin + 
                ", Total losses: " + teamLoss + ", total ties: " + teamTie + 
                "\n    Goals Scored: " + goalsScored + ", Goals Allowed: " + 
                goalsAllowed;
    }
}
