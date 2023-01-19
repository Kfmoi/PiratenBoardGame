package pk;

public class Reroll {
    public static void reroll(Player player1){
        
        
        int k=1;
        do {
            if(player1.skullcheck(player1.skcheck)==true){
                //  count set
                // count extra points
                break;
            }

            Start.playerscore = 0;
            player1.dcount = 0;
            player1.gcount =0;
            player1.scount = 0;
            player1.mcount = 0;
            player1.pcount=0;
    
            int num = Random_num.randomnum(Start.skcount);
            System.out.println("\nNumber of rolls: "+ num);
            player1.skcheck =Start.firstroll(num,player1);
    
            System.out.println("Round #"+ k+ " is done");
            k++;
            
           } while (player1.skullcheck(player1.skcheck) == false);
    }

    public static void reroll2(Player player1, int count){
        int k=1;
        do {
            if(player1.skullcheck(player1.skcheck)==true){
                break;
            }
            int num = Random_num.randomnum(count);
            System.out.println("\nNumber of rolls: "+ num);
            player1.skcheck =Start.firstroll(num,player1);
    
            System.out.println("Round #"+ k+ " is done");
            k++;
           } while (player1.skullcheck(player1.skcheck) == false);

    }
}
