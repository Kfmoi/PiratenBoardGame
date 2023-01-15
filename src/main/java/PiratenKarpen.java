
import pk.F02;
import pk.Player;
import pk.F05;

public class PiratenKarpen {
    public static double average(int play, int games){
        double num = ((play)/games)*100;
        return num;
    }
    

    

    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        int amountofgames = 3;
        int j =1;


        System.out.println("Welcome to Piraten Karpen Simulator!");

        System.out.println("\nPlayer 1 rolls first");
        for (int i=0; i<amountofgames; i++){
            F02.skcount=0;
            F02.playerpoints=0;
            player1.totalsk = 0;
            player2.totalsk = 0;
            player1.totalpoints = 0;
            player2.totalpoints = 0;


            System.out.println("Game #" + (i+1));
            boolean p1check = F02.firstroll(8);
            player1.totalpoints += F02.playerpoints;
            player1.totalsk += F02.skcount;


           do {
            if (p1check==true){
                break;
            }
            int num = F05.randomnum();
            System.out.println("\nNumber of rolls: "+ num);
            p1check =F02.firstroll(num);
            player1.totalpoints += F02.playerpoints;
        
            System.out.println("Round #"+ j+ " is done");
            j++;
           } while (p1check == false);

    

        System.out.println("\nPlayer 2's turn now");
            F02.playerpoints =0;
            F02.skcount=0;
            boolean p2check = F02.firstroll(8);
            player2.totalpoints += F02.playerpoints;
            player2.totalsk += F02.skcount;

           do {
            if (p2check == true){
                break;
            }
            int num = F05.randomnum();
            System.out.println("\nNumber of rolls: "+ num);
            p2check =F02.firstroll(num);
        
            System.out.println("Round #"+ j+ " is done");
            player2.totalpoints += F02.playerpoints;
            j++;
           } while (p2check == false);


        System.out.println("Final Points:");
        System.out.println("\nPlayer 1: " + player1.totalpoints);
        System.out.println("Player 2: " + player2.totalpoints);
        if (player1.totalpoints > player2.totalpoints){
            player1.wins++;
            System.out.println("\n Player 1 Wins!!!");
        } else if (player1.totalpoints == player2.totalpoints){
            System.out.println("\n Tie Game");
        } else {
            player2.wins++;
            System.out.println("\n Player 2 Wins!!!");
        }
}
System.out.println(player1.wins);
System.out.println(player2.wins);
double stdout1 = average(player1.wins,amountofgames);
double stdout2 = average(player2.wins, amountofgames);

System.out.println("\n Player 1's win percentage is: "+ stdout1);
System.out.println("\n Player 2's win percentage is: "+ stdout2);


}
}
