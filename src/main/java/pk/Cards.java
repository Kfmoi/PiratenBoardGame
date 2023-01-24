package pk;
import java.util.Random;

public class Cards {
    public static String[]Carddeck(){
        String [] carddeck = new String[35];
        for (int i=0; i<=28; i++){
            carddeck[i] = "nop";
        }
        carddeck[29] = "2 Sea Battle";
        carddeck[30] = "2 Sea Battle";
        carddeck[31] = "3 Sea Battle";
        carddeck[32] = "3 Sea Battle";
        carddeck[33] = "4 Sea Battle";
        carddeck[34] = "4 Sea Battle";
        return carddeck;
    }

    public static String pickcard(Player player){
        Random rand = new Random();
        int card = rand.nextInt(Carddeck().length);
        player.card = Carddeck()[card];
        return player.card;
    }

    public static boolean seabattlecheck(Player player){
        boolean ans = false;
        if (player.card == "2 Sea Battle"){
            if (player.scount < 2){
                ans = false;
            } else {
                ans = true;
            }
        } else if (player.card == "3 Sea Battle"){
            if (player.scount < 3){
                ans = false;
            } else {
                ans = true;
            }
        } else if (player.card == "4 Sea Battle"){
            if (player.scount < 4){
                ans = false;
            } else {
                ans = true;
            }
        }
        return ans;
    }

    public static void seabattlesneeded(Player player){
        if (player.card == "2 Sea Battle"){
            player.sabresneeded = 2;
        } else if (player.card == "3 Sea Battle"){
            player.sabresneeded = 3;
        }else if (player.card == "4 Sea Battle"){
            player.sabresneeded = 4;
        }
    }
    public static int seabattlereward(Player player){
        int ans=0;
        if (player.card == "2 Sea Battle"){
            ans = 300;
        } else if (player.card == "3 Sea Battle"){
            player.sabresneeded = 500;
        }else if (player.card == "4 Sea Battle"){
            player.sabresneeded = 1000;
        }
        return ans;
    }
}
