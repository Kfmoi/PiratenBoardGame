package pk;

public class Strategies {
    public static void strategy1(Player player1){
        player1.skcheck = Start.firstroll(8,player1);
        Reroll.reroll(player1);
}

    public static void  strategy2(Player player1){
        player1.skcheck = Start.firstroll(8, player1);
        Reroll.reroll2(player1);
    }
}
