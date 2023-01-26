package pk;

public class Reset {
    public static void reset(Player player1, Player player2){
        player1.totalscore = 0;
        player2.totalscore=0;
        Start.skcount=0;
        Start.playerscore =0;
        player1.skcheck =false;
        player2.skcheck =false;
        player1.totalsk = 0;
        player2.totalsk = 0;
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
        Start.difference=0;
        player1.firstroll = true;
        player2.firstroll =true;
        Start.points =0;
        player1.diffd = 0;
        player1.diffs = 0;
        player1.diffg = 0;
        player1.diffm = 0;
        player1.diffp = 0;
        player1.diffmp = 0;
        player2.diffd = 0;
        player2.diffs = 0;
        player2.diffg = 0;
        player2.diffm = 0;
        player2.diffp = 0;
        player2.diffmp = 0;

    }

    public static void minireset(Player player){
        Start.skcount = 0;
        Start.count =0;
        player.ssaved = 0;
        player.psaved = 0;
        player.msaved = 0;
        player.gsaved = 0;
        player.dsaved = 0;
        player.mpsaved = 0;
        Start.difference = 0;
        player.firstroll = true;
        Start.points =0;
        player.totalsk = 0;
        player.turnscore=0;
        Start.playerscore = 0;
        player.skcheck =false;
        player.choice = true;
        player.diffd = 0;
        player.diffs = 0;
        player.diffg = 0;
        player.diffm = 0;
        player.diffp = 0;
        player.diffmp = 0;
    }
}
