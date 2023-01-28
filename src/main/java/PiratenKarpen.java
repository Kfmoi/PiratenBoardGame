
import pk.Player;
import pk.Cards;
import pk.Percentage;
import pk.points_system;

import pk.Reset;
import pk.Start;
import pk.logging.logging;


public class PiratenKarpen {



    public static void main(String[] args) {

        
        Player player1 = new Player();
        Player player2 = new Player();
        player1.Strategy_Decision = args[0];
        player2.Strategy_Decision = args[1];

            double amountofgames = 42;


            System.out.println("\nWelcome to Piraten Karpen Simulator!");


            for (int i=0; i<amountofgames;i++){
                Reset.GameReset(player1, player2);
                logging.debug("\nGame #" + (i+1));

                logging.debug("Player 1's rolls first");
                Cards.pickcard(player1); 
                logging.debug("Player 1's card: "+ player1.Card);
                Player.GameStrategy(player1);
                
                Start.skcount = 0;
                Start.playerscore = 0;

                if (player1.totalscore >= 6000){
                    logging.debug("Player 1's Final Score: "+ player1.totalscore);
                    logging.debug("6000 has been reached!!!!");
                    player1.Final_turn = true;
                    logging.debug("Player 2's final turn");
                    Cards.pickcard(player2); 
                    logging.debug("Player 2's card: "+ player2.Card);
                    Player.last(player1, player2);
                    logging.debug("Player 2's Final Score: "+ player2.totalscore);
                }else {
                logging.debug("\nPlayer 2's turn");
                Cards.pickcard(player2); 
                logging.debug("Player 2's card: "+ player2.Card);
                Player.GameStrategy(player2);
                }

            do {
                if (player1.totalscore >= 6000){
                    break;
                }
                Reset.TurnReset(player1);
                if (player2.totalscore >= 6000){
                    logging.debug("Player 2's Final Score: "+ player2.totalscore);
                    logging.debug("6000 has been reached!!!!");
                    player2.Final_turn = true;
                    logging.debug("Player 1's final turn");
                    Cards.pickcard(player1); 
                    logging.debug("Player 1's card: "+ player1.Card);
                    Player.last(player2, player1);
                    logging.debug("Player 1's Final Score: "+ player1.totalscore);
                    break;
                }else {
                logging.debug("No player has reached 6000 points");
                logging.debug("\nPlayer 1 rerolling....");
                Cards.pickcard(player1); 
                logging.debug("Player 1's card: "+ player1.Card);
                Player.GameStrategy(player1);
                }
                
                
                Reset.TurnReset(player2);
                if (player1.totalscore >= 6000){
                    logging.debug("Player 1's Final Score: "+ player1.totalscore);
                    logging.debug("6000 has been reached!!!!");
                    player1.Final_turn = true;
                    logging.debug("Player 2's final turn");
                    Cards.pickcard(player2); 
                    logging.debug("Player 2's card: "+ player2.Card);
                    Player.last(player1, player2);
                    logging.debug("Player 2's Final Score: "+ player2.totalscore);
                    break;
                }else {
                logging.debug("\nPlayer 2 rerolling....");
                Cards.pickcard(player2); 
                logging.debug("Player 2's card: "+ player2.Card);
                Player.GameStrategy(player2);
                }
            }while (player1.Final_turn == false|| player2.Final_turn ==false);

            logging.debug("Final Score: ");
            logging.debug("\nPlayer 1: "+ player1.totalscore);
            logging.debug("\nPlayer 2: "+ player2.totalscore);

            points_system.results(player1, player2);
            }

            logging.debug("\nPlayer 1's' total wins: " + player1.Wins);
            logging.debug("\nPlayer 2's' total wins: " + player2.Wins);


            double stdout1 = Percentage.stdout(player1.Wins,amountofgames);
            double stdout2 = Percentage.stdout(player2.Wins, amountofgames);
        

            System.out.println( "\nPlayer 1's win percentage is: "+ String.format("%.2f",stdout1)+"%");
            System.out.println( "Player 2's win percentage is: "+ String.format("%.2f",stdout2)+"%");



        }
        


}