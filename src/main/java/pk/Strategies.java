package pk;

public class Strategies {
    public static void strategy1(Player player1, Player player2, int amountofgames){
        for (int i=0; i<amountofgames; i++){
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
            Reroll.reroll(player1);

            Start.playerpoints =0;
            Start.skcount=0;

            System.out.println("\n"+player2.name+"'s turn now");
            player2.skcheck = Start.firstroll(8);
            player2.totalpoints += Start.playerpoints;
            player2.totalsk += Start.skcount;
            Reroll.reroll(player2);

            do {
                if ((player1.totalpoints >=6000) || (player2.totalpoints>=6000)){
                    break;
                }
                Start.skcount=0;
                player1.totalsk =0;
                player2.totalsk =0;
                Reroll.reroll(player1);
                Start.skcount=0;
                Reroll.reroll(player2);

            }while ((player1.totalpoints <6000) && (player2.totalpoints<6000));



           System.out.println("\nFinal Points:");
           System.out.println("\n"+player1.name + ":" + player1.totalpoints);
           System.out.println("\n"+player2.name + ":"  + player2.totalpoints);

           points_system.results(player1, player2);


    }
            System.out.println(player1.wins);
           System.out.println(player2.wins);
}
}
