package pk;

public class Reset {
    public static void reset(Player player1, Player player2){
        player1.totalscore = 0;
        player2.totalscore=0;
        Start.skcount=0;
        Start.playerscore =0;
        player1.dcount = 0;
        player2.dcount = 0;
        player1.gcount = 0;
        player2.gcount=0;
        player1.skcheck =false;
        player2.skcheck =false;
        player1.totalsk = 0;
        player2.totalsk = 0;
        player1.totalpoints = 0;
        player2.totalpoints = 0;
        player1.dcount = 0;
        player1.gcount =0;
        player1.scount = 0;
        player1.mcount = 0;
        player1.pcount=0;
        player2.dcount = 0;
        player2.gcount =0;
        player2.scount = 0;
        player2.mcount = 0;
        player2.pcount=0;
    }

    public static void minireset(Player player){
        Start.skcount = 0;
        player.dcount = 0;
        player.gcount =0;
        player.scount = 0;
        player.mcount = 0;
        player.pcount=0;
        
        Start.playerscore = 0;
        player.skcheck =false;
    }
}
