

import java.util.Scanner;

import pk.Player;
import pk.Start;
import pk.Percentage;

import pk.points_system;


public class PiratenKarpen {

    public static void reset(Player player1, Player player2){
        player1.totalscore = 0;
        player2.totalscore=0;
        Start.skcount=0;
        Start.playerscore =0;
        player1.dcount = 0;
        player2.dcount = 0;
        player1.gcount = 0;
        player2.gcount=0;
        player1.skcheck =false;
        player2.skcheck =false;
        player1.totalsk = 0;
        player2.totalsk = 0;
        player1.totalpoints = 0;
        player2.totalpoints = 0;
        player1.dcount = 0;
        player1.gcount =0;
        player1.scount = 0;
        player1.mcount = 0;
        player1.pcount=0;
        player2.dcount = 0;
        player2.gcount =0;
        player2.scount = 0;
        player2.mcount = 0;
        player2.pcount=0;
    }


    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();

        try (Scanner input = new Scanner(System.in)) {
            int amountofgames = 42;


            System.out.println("Welcome to Piraten Karpen Simulator!");
            System.out.println("\nPlayer 1's name: ");
            String name1 = input.nextLine();
            System.out.println("\nPlayer 2's name: ");
            String name2 = input.nextLine();
            player1.name =name1;
            player2.name =name2;

            

            System.out.println("\n" + player1.name + "'s strategy: ");
            player1.decision = input.nextLine();
            System.out.println("\n" + player2.name+ "'s strategy: ");
            player2.decision = input.nextLine();


            for (int i=0; i<amountofgames;i++){
                reset(player1, player2);

            System.out.println("Game #" + (i+1));

            System.out.println("\n"+player1.name+" rolls first");
            Player.pick(player1);

            System.out.println("\n"+player2.name + "'s turn");
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
                System.out.println(player1.name + " rerolling....");
                player1.skcheck =false;
                Player.pick(player1);

                player2.dcount = 0;
                player2.gcount =0;
                player2.scount = 0;
                player2.mcount = 0;
                player2.pcount=0;
                Start.skcount=0;
                Start.playerscore = 0;
                System.out.println(player2.name + " rerolling....");
                player2.skcheck = false;
                Player.pick(player2);

            }while ((player1.totalscore <6000) && (player2.totalscore<6000));

            System.out.println("\nFinal Points:");
            System.out.println("\n"+player1.name + ":" + player1.totalscore);
            System.out.println("\n"+player2.name + ":"  + player2.totalscore);

            points_system.results(player1, player2);
            }

            System.out.println("\n" + player1.name + "'s' total wins: " + player1.wins);
            System.out.println("\n" + player2.name + "'s' total wins: " + player2.wins);

            int stdout1 = Percentage.stdout(player1.wins,amountofgames);
            int stdout2 = Percentage.stdout(player2.wins, amountofgames);
        

            System.out.println( "\n" + player1.name+"'s win percentage is: "+ stdout1);
            System.out.println( "\n" + player2.name+"'s win percentage is: "+ stdout2);


        }
        


}
}
