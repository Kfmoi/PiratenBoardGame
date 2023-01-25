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
        player1.mpcount = 0;
        player2.mpcount =0;
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
        player1.finalturn = false;
        player2.finalturn =false;
        player1.card ="";
        player1.card = "";
        player1.turnscore=0;
        player2.turnscore =0;
        player1.ssaved = 0;
        player1.psaved = 0;
        player1.msaved = 0;
        player1.gsaved = 0;
        player1.dsaved = 0;
        player2.ssaved = 0;
        player2.psaved = 0;
        player2.msaved = 0;
        player2.gsaved = 0;
        player2.dsaved = 0;
        Start.count =0;
    }

    public static void minireset(Player player){
        Start.skcount = 0;
        player.dcount = 0;
        player.gcount =0;
        player.scount = 0;
        player.mcount = 0;
        player.pcount=0;
        Start.count =0;
        player.ssaved = 0;
        player.psaved = 0;
        player.msaved = 0;
        player.gsaved = 0;
        player.dsaved = 0;
        player.mpcount =0;
        
        Start.playerscore = 0;
        player.skcheck =false;
    }
}
