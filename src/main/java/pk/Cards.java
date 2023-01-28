package pk;
import java.util.Random;

public class Cards {

    // The card deck
    public static String[]Carddeck(){
        String [] carddeck = new String[35];
        for (int i=0; i<=24; i++){
            carddeck[i] = "nop";
        }
        for (int j=25; j<=28; j++){
            carddeck[j] = "Monkey Business";
        }
        carddeck[29] = "2 Sea Battle";
        carddeck[30] = "2 Sea Battle";
        carddeck[31] = "3 Sea Battle";
        carddeck[32] = "3 Sea Battle";
        carddeck[33] = "4 Sea Battle";
        carddeck[34] = "4 Sea Battle";
        return carddeck;
    }

    // Gives a player a random card
    public static String pickcard(Player player){
        Random rand = new Random();
        int card = rand.nextInt(Carddeck().length);
        player.Card = Carddeck()[card];
        return player.Card;
    }


}
