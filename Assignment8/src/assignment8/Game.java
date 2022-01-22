
package assignment8;

import java.util.ArrayList;
import java.util.Random;

public class Game {
    //fields
    private final int ID;
    private int temp = 0;
    private Team homeTeam, awayTeam;
    private static final ArrayList<Game> gameLog = new ArrayList<Game>(); 
    private int scoreHome;
    private int scoreAway;
    
    //constructors
    public Game(int temp, Team awayTeam, Team homeTeam){
        this.temp = temp;
        this.awayTeam = awayTeam;
        this.homeTeam = homeTeam;
        gameLog.add(this);
        ID = gameLog.size();
    }
    
    public Game(){
        //this.temp = temp;
        gameLog.add(this);
        ID = gameLog.size();
    }
    
    //methods
    public int getID() {
        return ID;
    }

    public double getTemp() {
        return temp;
    }
  
    public static int getGameLogSize(){
        return gameLog.size();
    }
 
    Team team = new Team();
    public void playGame(int temp, int scoreHome, int scoreAway){
        this.temp = temp;
        Random rand = new Random();
        this.scoreHome = scoreHome;this.scoreAway = scoreAway;
            //radomize the scores
            if (temp<0){
                System.out.println("It is too cold to play.");
            }
            else if (temp>0 && temp<=10){
                scoreHome = rand.nextInt(3); //options from 0-2
                System.out.println("scoreHome:"+scoreHome);
                scoreAway = rand.nextInt(3);
                System.out.println("scoreAway:"+scoreAway);
                this.scoreHome = scoreHome;this.scoreAway = scoreAway;
            }
            else if (temp>10 && temp<=20){
                scoreHome = rand.nextInt(3)+1; //options from 1-3
                System.out.println("scoreHome:"+scoreHome);
                scoreAway = rand.nextInt(3)+1;
                System.out.println("scoreAway:"+scoreAway);
                this.scoreHome = scoreHome;this.scoreAway = scoreAway;
            }
            else if (temp>20 && temp<=30){
                scoreHome = rand.nextInt(3)+2; //options from 2-4
                System.out.println("scoreHome:"+scoreHome);
                scoreAway = rand.nextInt(3)+2;
                System.out.println("scoreAway:"+scoreAway);
                this.scoreHome = scoreHome;this.scoreAway = scoreAway;
            }
            else{
                scoreHome = rand.nextInt(4)+3; //options from 3-6
                System.out.println("scoreHome:"+scoreHome);
                scoreAway = rand.nextInt(4)+3;
                System.out.println("scoreAway:"+scoreAway);
                this.scoreHome = scoreHome;this.scoreAway = scoreAway;
            }
            //update each team's win, loss, tie, goals for and goals against accordingly
            //this is where the NullPointerException occurs - in the .goalsScoredAdd()
            //as I could not figure out how to initialize it in this class
            this.homeTeam.goalsScoredAdd(scoreHome); 
            this.homeTeam.goalsAllowedAdd(scoreAway);
            this.awayTeam.goalsScoredAdd(scoreAway);
            this.awayTeam.goalsAllowedAdd(scoreHome);
            if (scoreHome>scoreAway){
                this.homeTeam.winAdd();
                this.awayTeam.lossAdd();
            }
            else if(scoreAway>scoreHome){
                this.homeTeam.lossAdd();
                this.awayTeam.winAdd();
            }
            else{
                this.homeTeam.tieAdd();
                this.awayTeam.tieAdd();
            }
    }
    
    public void printStats(){
        System.out.println("Game #"+this.ID+"\nTemperature: "+this.temp+
                "\nAway team: Scored: "+this.scoreAway+" Allowed: "
                +this.scoreHome+"\nHome team: Scored: "+
                this.scoreHome+" Allowed: "+
                this.scoreAway);
    }
   
    public static void printAllStats(){
        for(Game game:gameLog){
            game.printStats();
        }
    }
    
    public static void printAvgTemp(){
        double avgTemp = 0;
        for (Game game: gameLog){
            avgTemp+=game.temp;
        }
        System.out.println("Average temperature: " + avgTemp/gameLog.size());
    }
   
    public static void printHottestTemp(){
        double maxTemp = -200;
        for (Game game: gameLog){
            if (game.temp>=maxTemp){
                maxTemp=game.temp;
            }
        }
        System.out.println("The hottest temperature was: "+maxTemp);
    }
}
