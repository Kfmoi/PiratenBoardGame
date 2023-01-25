package pk;

public class Strategies {
    public static void strategy1(Player player1){
        if(player1.card == "nop"){
            player1.skcheck = Start.firstroll(8,player1);
            Reroll.reroll(player1);
            } else if (player1.card == "Monkey Business"){
                player1.skcheck = Start.firstroll(8,player1);
                Reroll.reroll(player1);
            } else {
                player1.skcheck =  Start.firstroll3(8, player1);
                Reroll.reroll3(player1);
            }
            
        
}

    public static void  strategy2(Player player1){
        if(player1.card == "nop"){
            player1.skcheck = Start.firstroll2(8, player1);
            Reroll.reroll2(player1);
            } else if (player1.card == "Monkey Business"){
                player1.skcheck = Start.firstroll2(8, player1);
                Reroll.reroll2(player1);
            }
            else {
                player1.skcheck =  Start.firstroll3(8, player1);
                Reroll.reroll3(player1);
            }

         
    }
}

