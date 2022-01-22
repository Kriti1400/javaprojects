
package assignment8;

import java.util.ArrayList;
import java.util.Random;

public class Scheduler {
    //fields
    Team[] teams;
    private ArrayList<Integer> lastThreeTemps = new ArrayList<>();
    
    //constructors
    public Scheduler(Team[] teams){ 
        this.teams = teams;
        //set lastThreeTemps to three positive temperatures
        lastThreeTemps.add(100);
        lastThreeTemps.add(100);
        lastThreeTemps.add(100);
    }
    
    //methods
    public void schedule(int temp){
        Random rand = new Random(); 
        int awayTeam1 = 0,awayTeam2 = 0,homeTeam1 = 0,homeTeam2 = 0;
        if (temp>=0){ //plays games if temp is positive or 0
            int randomTeam = rand.nextInt(4)+1; //randomly chooses a team
            awayTeam1 = randomTeam;
            if (awayTeam1==4){ //uses if statements to choose other teams based
                awayTeam2 = 1;   //on the randomly selected team
                if (awayTeam2==3){
                    homeTeam1 = 4;
                    homeTeam2 = 1;
                }
                else if (awayTeam2==4){
                    homeTeam1 = 1;
                    homeTeam2 = 2;
                }
                else{
                    homeTeam1 = awayTeam2+1;
                    homeTeam2 = awayTeam2+2;
                }
            }
            else{
                awayTeam2 = awayTeam1+1;
                if (awayTeam2==3){
                    homeTeam1 = 4;
                    homeTeam2 = 1;
                }
                else if (awayTeam2==4){
                    homeTeam1 = 1;
                    homeTeam2 = 2;
                }
                else{
                    homeTeam1 = awayTeam2+1;
                    homeTeam2 = awayTeam2+2;
                }
            }
        // play games
        System.out.println("Home teams: "+homeTeam1+", "+homeTeam2+" Away Teams: "+awayTeam1+", "+awayTeam2);
        lastThreeTemps.add(temp); // add temperature to the last three temperature
        lastThreeTemps.remove(0); // the first temperature in the array goes
        }
        else{ //doesn't play games if temp is below
            System.out.println("It is too cold to play.");
            lastThreeTemps.add(temp); // add temperature to the last three temperature
            lastThreeTemps.remove(0); // the first temperature in the array goes
        }
    }
    
    public void printTeamsStatistics(){ //iterates the teams and prints their statistics
        //This did not work as I was not able to store the game scores in game due to the
        //NullPointerException
        Team team = new Team();
        System.out.println(team.toString());
    }
    
    public boolean isSeasonOver(){
        for (int temp:lastThreeTemps){
            if (temp>=0){
                return false;
            }
        }
        return true;
    }
}