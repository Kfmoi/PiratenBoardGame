

import pk.Player;
import pk.Percentage;
import pk.points_system;

import pk.Reset;
import pk.Start;
import pk.logging.logging;


public class PiratenKarpen {



    public static void main(String[] args) {

        
        Player player1 = new Player();
        Player player2 = new Player();
        player1.decision = "Random";
        player2.decision = "combo";

            double amountofgames = 42;


            System.out.println("\nWelcome to Piraten Karpen Simulator!");
            System.out.println(player1.decision);
            System.out.println(player2.decision);


            for (int i=0; i<amountofgames;i++){
                Reset.reset(player1, player2);
                System.out.println("\nGame #" + (i+1));

                logging.debug("Player 1's rolls first");
                Player.pick(player1);
                
                Start.skcount = 0;
                Start.playerscore = 0;

                if (player1.totalscore >= 6000){
                    System.out.println("Player 1's Final Score: "+ player1.totalscore);
                    logging.debug("6000 has been reached!!!!");
                    player1.finalturn = true;
                    logging.debug("Player 2's final turn");
                    Player.last(player1, player2);
                    System.out.println("Player 2's Final Score: "+ player2.totalscore);
                }else {
                logging.debug("\nPlayer 2's turn");
                Player.pick(player2);
                }

            do {
                
                Reset.minireset(player1);
                if (player2.totalscore >= 6000){
                    System.out.println("Player 2's Final Score: "+ player2.totalscore);
                    logging.debug("6000 has been reached!!!!");
                    player2.finalturn = true;
                    logging.debug("Player 1's final turn");
                    Player.last(player2, player1);
                    System.out.println("Player 1's Final Score: "+ player1.totalscore);
                    break;
                }else {
                logging.debug("No player has reached 6000 points");
                logging.debug("\nPlayer 1 rerolling....");
                Player.pick(player1);
                }
                
                
                Reset.minireset(player2);
                if (player1.totalscore >= 6000){
                    System.out.println("Player 1's Final Score: "+ player1.totalscore);
                    logging.debug("6000 has been reached!!!!");
                    player1.finalturn = true;
                    logging.debug("Player 2's final turn");
                    Player.last(player1, player2);
                    System.out.println("Player 2's Final Score: "+ player2.totalscore);
                    break;
                }else {
                logging.debug("\nPlayer 2 rerolling....");
                Player.pick(player2);
                }
            }while (player1.finalturn == false|| player2.finalturn ==false);

            logging.debug("Final Score: ");
            logging.debug("\nPlayer 1: "+ player1.totalscore);
            logging.debug("\nPlayer 2: "+ player2.totalscore);

            points_system.results(player1, player2);
            }

            System.out.println("\nPlayer 1's' total wins: " + player1.wins);
            System.out.println("Player 2's' total wins: " + player2.wins);


            double stdout1 = Percentage.stdout(player1.wins,amountofgames);
            double stdout2 = Percentage.stdout(player2.wins, amountofgames);
        

            System.out.println( "\nPlayer 1's win percentage is: "+ String.format("%.2f",stdout1)+"%");
            System.out.println( "Player 2's win percentage is: "+ String.format("%.2f",stdout2)+"%");



        }
        


}