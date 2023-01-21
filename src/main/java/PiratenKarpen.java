

import java.util.Scanner;

import pk.Player;
import pk.Start;
import pk.Percentage;
import pk.points_system;
import pk.logging.GameLogger;
import pk.Rst;


public class PiratenKarpen {



    public static void main(String[] args) {

        
        Player player1 = new Player();
        Player player2 = new Player();

        try (Scanner input = new Scanner(System.in)) {
            double amountofgames = 42;


            System.out.println("Welcome to Piraten Karpen Simulator!");

            

            System.out.println("\n Player 1's strategy: ");
            player1.decision = input.nextLine();
            System.out.println("\nPlayer 2's strategy: ");
            player2.decision = input.nextLine();


            for (int i=0; i<amountofgames;i++){
                Rst.reset(player1, player2);

            System.out.println("Game #" + (i+1));

            System.out.println("\n Player 1 rolls first");
            Player.pick(player1);

            System.out.println("\n Player 2's turn");
            Player.pick(player2);


            do {
                if ((player1.totalscore >=6000) || (player2.totalscore>=6000)){
                    break;
                }

                System.out.println("No player has reached over 6000 points");
                Start.skcount = 0;
                player1.dcount = 0;
                player1.gcount =0;
                player1.scount = 0;
                player1.mcount = 0;
                player1.pcount=0;
                Start.playerscore = 0;
                System.out.println("Player 1 rerolling....");
                player1.skcheck =false;
                Player.pick(player1);

                player2.dcount = 0;
                player2.gcount =0;
                player2.scount = 0;
                player2.mcount = 0;
                player2.pcount=0;
                Start.skcount=0;
                Start.playerscore = 0;
                System.out.println("Player 2 rerolling....");
                player2.skcheck = false;
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
