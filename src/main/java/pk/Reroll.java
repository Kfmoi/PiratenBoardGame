package pk;

public class Reroll {
    public static void reroll(Player player1){

        int k=1;
        do {
            if(player1.skullcheck(player1.skcheck)==true){
                break;
            }
            int num = Random_num.randomnum(player1.totalsk);
            System.out.println("\nNumber of rolls: "+ num);
            player1.skcheck =Start.firstroll(num);
        
            System.out.println("Round #"+ k+ " is done");
            player1.totalpoints += Start.playerpoints;
            k++;
           } while (player1.skullcheck(player1.skcheck) == false);
    }
}
