import pk.Start;

import java.util.Scanner;

import pk.Player;
import pk.Random_num;
import pk.points_system;

public class PiratenKarpen {
    public static double stdout(int play, int games){
        double num = ((play)/games)*100;
        return num;
    }

    public static void strategy1(Player player1, Player player2, int amountofgames){
        for (int i=0; i<amountofgames; i++){
            int j =1;
            int k =1;
            Start.skcount=0;
            Start.playerpoints=0;
            player1.skcheck =false;
            player2.skcheck =false;
            player1.totalsk = 0;
            player2.totalsk = 0;
            player1.totalpoints = 0;
            player2.totalpoints = 0;


            System.out.println("Game #" + (i+1));
            System.out.println("\n"+player1.name+" rolls first");
            
            player1.skcheck = Start.firstroll(8);
            player1.totalpoints += Start.playerpoints;
            player1.totalsk += Start.skcount;


           do {
            if(player1.skullcheck(player1.skcheck)==true){
                break;
            }
            
            int num = Random_num.randomnum(player1.totalsk);
            System.out.println("Round #"+ j+ " is done");
            System.out.println("\nNumber of rolls: "+ num);
             player1.skcheck = Start.firstroll(num);
            player1.totalpoints += Start.playerpoints;
            j++;
           } while (player1.skullcheck(player1.skcheck) == false);

    

        System.out.println("\n"+player2.name+"'s turn now");
            Start.playerpoints =0;
            Start.skcount=0;

            player2.skcheck = Start.firstroll(8);

            player2.totalpoints += Start.playerpoints;
            player2.totalsk += Start.skcount;

           do {
            if(player2.skullcheck(player2.skcheck)==true){
                break;
            }
            int num = Random_num.randomnum(player2.totalsk);
            System.out.println("\nNumber of rolls: "+ num);
            player2.skcheck =Start.firstroll(num);
        
            System.out.println("Round #"+ k+ " is done");
            player2.totalpoints += Start.playerpoints;
            k++;
           } while (player2.skullcheck(player2.skcheck) == false);

           System.out.println("\nFinal Points:");
           System.out.println("\n"+player1.name + ":" + player1.totalpoints);
           System.out.println("\n"+player2.name + ":"  + player2.totalpoints);

           points_system.results(player1, player2);


    }
            System.out.println(player1.wins);
           System.out.println(player2.wins);
}
    

    

    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();

        try (Scanner name = new Scanner(System.in)) {
            int amountofgames = 3;


            System.out.println("Welcome to Piraten Karpen Simulator!");
            System.out.println("\nPlayer 1's name: ");
            String name1 = name.nextLine();
            System.out.println("\nPlayer 2's name: ");
            String name2 = name.nextLine();

            player1.name =name1;
            player2.name =name2;

            strategy1(player1, player2, amountofgames);

            double stdout1 = stdout(player1.wins,amountofgames);
           double stdout2 = stdout(player2.wins, amountofgames);

           System.out.println( "\n" + player1.name+"'s win percentage is: "+ stdout1);
           System.out.println( "\n" + player2.name+"'s win percentage is: "+ stdout2);

        }


}
}
