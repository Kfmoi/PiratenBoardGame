package pk;

public class Reroll {
    public static void reroll(Player player1){
        
        
        int k=1;
        do {
            if(player1.skullcheck(player1.skcheck)==true){
                break;
            }
            int num = Random_num.randomnum(Start.skcount);
            System.out.println("\nNumber of rolls: "+ num);
            player1.skcheck =Start.firstroll(num,player1);
    
            System.out.println("Round #"+ k+ " is done");
            k++;
           } while (player1.skullcheck(player1.skcheck) == false);
    }
}
