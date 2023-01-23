

import pk.Player;
import pk.Percentage;
import pk.points_system;

import pk.Reset;
import pk.Start;
import pk.logging.GameLogger;


public class PiratenKarpen {



    public static void main(String[] args) {

        
        Player player1 = new Player();
        Player player2 = new Player();
        player1.decision = "random";
        player2.decision ="random";

            double amountofgames = 1;


            System.out.println("Welcome to Piraten Karpen Simulator!");


            for (int i=0; i<amountofgames;i++){
                Reset.reset(player1, player2);
                System.out.println("Game #" + (i+1));

                System.out.println("\n Player 1 rolls first");
                Player.pick(player1);
                
                Start.skcount = 0;
                Start.playerscore = 0;

                if (player1.totalscore >= 6000){
                    System.out.println("Final points: "+ player1.totalpoints);
                    System.out.println("6000 has been reached!!!!");
                    player1.finalturn = true;
                    System.out.println("Player 2's final turn");
                    Player.last(player1, player2);
                }else {
                System.out.println("\n Player 2's turn");
                Player.pick(player2);
                }

            do {
                
                Reset.minireset(player1);
                if (player2.totalscore >= 6000){
                    System.out.println("Final Score: "+ player2.totalpoints);
                    System.out.println("6000 has been reached!!!!");
                    player2.finalturn = true;
                    System.out.println("Player 1's final turn");
                    Player.last(player2, player1);
                    break;
                }else {
                System.out.println("No player has reached over 6000 points");
                System.out.println("Player 1 rerolling....");
                Player.pick(player1);
                }
                
                
                Reset.minireset(player2);
                if (player1.totalscore >= 6000){
                    System.out.println("Final Score: "+ player1.totalscore);
                    System.out.println("6000 has been reached!!!!");
                    player1.finalturn = true;
                    System.out.println("Player 2's final turn");
                    Player.last(player1, player2);
                    break;
                }else {
                System.out.println("Player 2 rerolling....");
                Player.pick(player2);
                }
            }while (player1.finalturn == false|| player2.finalturn ==false);

            System.out.println("\nFinal Points:");
            System.out.println("\n Player 1:" + player1.totalscore);
            System.out.println("\n Player 2:"  + player2.totalscore);

            points_system.results(player1, player2);
            }

            //System.out.println("\n Player 1's' total wins: " + player1.wins);
            //System.out.println("\n Player 2's' total wins: " + player2.wins);

            GameLogger.debuglog("\n Player 1's' total wins: " + player1.wins);

            double stdout1 = Percentage.stdout(player1.wins,amountofgames);
            double stdout2 = Percentage.stdout(player2.wins, amountofgames);
        

            System.out.println( "\n Player 1's win percentage is: "+ String.format("%.2f",stdout1)+"%");
            System.out.println( "\n Player 2's win percentage is: "+ String.format("%.2f",stdout2)+"%");



        }
        


}
