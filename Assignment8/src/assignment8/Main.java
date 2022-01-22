
package assignment8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Team A = new Team("A");
        Team B = new Team("B");
        Team C = new Team("C");
        Team D = new Team("D");
        Team[] teams = {A, B, C, D};
        
        Scanner sc = new Scanner(System.in);
        Scheduler scheduler = new Scheduler(teams);
        
        //start season
        while(!scheduler.isSeasonOver()){
            //gets user input
            int temp = -200;
            System.out.print("Enter the temperature: ");
            String tempText = sc.next();
            // use try and catch to make sure it is a number
            try{
                temp = Integer.parseInt(tempText);
            }
            catch(NumberFormatException e){
                System.out.println(e);
            }
            // play games
            scheduler.schedule(temp);
            //use try and catch to continue when the NullPointerExcepion occurs
            try{
                Game game = new Game();
                game.playGame(temp, 0, 0);
                //game.printStats();
            }
            catch(NullPointerException e){
                System.out.println(e);
            }
        }
      
        //season is over
        scheduler.printTeamsStatistics();
        Game.printAllStats();
        Game.printAvgTemp();
        Game.printHottestTemp();
    }
}
 
