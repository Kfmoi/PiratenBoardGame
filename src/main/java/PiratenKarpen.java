
import pk.F02;
import pk.Player;
import pk.F05;

public class PiratenKarpen {

    

    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        int amountofgames = 1;
        int j =1;


        System.out.println("Welcome to Piraten Karpen Simulator!");

        System.out.println("Player 1 rolls first");
        for (int i=0; i<amountofgames; i++){
            boolean p1check = F02.firstroll(8);
            player1.totalpoints += F02.playerpoints;


           do {
            if (p1check==true){
                break;
            }
            int num = F05.randomnum();
            System.out.println("Number of rolls: "+ num);
            p1check =F02.firstroll(num);
            player1.totalpoints += F02.playerpoints;
        
            System.out.println("Round #"+ j+ " is done");
            j++;
           } while (p1check == false);

    

        System.out.println("Player 2's turn now");
            boolean p2check = F02.firstroll(8);
            player2.totalpoints += F02.playerpoints;

           do {
            if (p2check == true){
                break;
            }
            int num = F05.randomnum();
            System.out.println("Number of rolls: "+ num);
            p2check =F02.firstroll(num);
        
            System.out.println("Round #"+ j+ " is done");
            player2.totalpoints += F02.playerpoints;
            j++;
           } while (p2check == false);


        System.out.println("Final Points:");
        System.out.println("Player 1: " + player1.totalpoints);
        System.out.println("Player 2: " + player2.totalpoints);
}
}
}
