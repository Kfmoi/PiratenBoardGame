package pk;


public class Strategies {
    public static void strategy1(Player player1){
            player1.skcheck = Start.firstroll(8,player1);
            System.out.println("Press 1 to continue, Press 2 to keep ur rolls");
            Player.choose(player1);
            if (player1.choice == true){
            Reroll.reroll(player1);
        } else if (player1.choice ==false){
                player1.totalscore += player1.totalround;
                System.out.println("Total score: " + player1.totalscore);
            }
        
}

    public static void  strategy2(Player player1){
            player1.skcheck = Start.firstroll(8, player1);
            System.out.println("Press 1 to continue, Press 2 to keep ur rolls");
            Player.choose(player1);

            if (player1.choice == true){
            Reroll.reroll2(player1);
        } else if (player1.choice ==false){
                player1.totalscore += player1.totalround;
            }
        
         
    }
}

