
import java.util.Scanner;

import pk.Player;
import pk.Start;
import pk.Percentage;
import pk.points_system;
import pk.logging.GameLogger;
import pk.Reset;


public class PiratenKarpen {



    public static void main(String[] args) {

        
        Player player1 = new Player();
        Player player2 = new Player();
        player1.decision = args[0];
        player2.decision =args[1];

        try (Scanner input = new Scanner(System.in)) {
            double amountofgames = 1;


            System.out.println("Welcome to Piraten Karpen Simulator!");

            
           // System.out.println("\nPress 1 to pick strategy 1, 2 for strategy 2");
            //System.out.println("\n Player 1's strategy: ");
           // player1.decision = args[0];
            //System.out.println("\nPlayer 2's strategy: ");
            ///player2.decision = args[]


            for (int i=0; i<amountofgames;i++){
                Reset.reset(player1, player2);

            System.out.println("Game #" + (i+1));

            System.out.println("\n Player 1 rolls first");
            Player.pick(player1);

            Start.skcount = 0;
            Start.playerscore = 0;
        

            System.out.println("\n Player 2's turn");
            Player.pick(player2);


            do {
                if ((player1.totalscore >=6000) || (player2.totalscore>=6000)){
                    break;
                }

                System.out.println("No player has reached over 6000 points");
                
                System.out.println("Player 1 rerolling....");
                Reset.minireset(player1);
                Player.pick(player1);

                
                System.out.println("Player 2 rerolling....");
                Reset.minireset(player2);
                Player.pick(player2);

            }while ((player1.totalscore <6000) && (player2.totalscore<6000));

            System.out.println("\nFinal Points:");
            System.out.println("\n Player 1:" + player1.totalscore);
            System.out.println("\n Player 2:"  + player2.totalscore);

            points_system.results(player1, player2);
            }

            System.out.println("\n Player 1's' total wins: " + player1.wins);
            System.out.println("\n Player 2's' total wins: " + player2.wins);

            double stdout1 = Percentage.stdout(player1.wins,amountofgames);
            double stdout2 = Percentage.stdout(player2.wins, amountofgames);
        

            System.out.println( "\n Player 1's win percentage is: "+ String.format("%.2f",stdout1)+"%");
            System.out.println( "\n Player 2's win percentage is: "+ String.format("%.2f",stdout2)+"%");



        }
        


}
}