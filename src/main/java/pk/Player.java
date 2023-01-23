package pk;

import pk.logging.logging;

public class Player {
    public int totalscore = 0;
    public int totalsk = 0;
    public int gcount = 0;
    public int dcount =0 ;
    public int mcount = 0;
    public int scount =0 ;
    public int pcount =0 ;
    public double wins;
    public boolean skcheck = false;
    public String decision;
    public boolean choice;
    public boolean finalturn;


    public static void pick(Player player1){
        if(player1.decision == "Random"){
            Strategies.strategy1(player1);
        } else {
            Strategies.strategy2(player1);
        }
    }

    public boolean skullcheck(boolean skcheck){
        if (skcheck == true){
        logging.debug("Three skulls have been rolled");
        return true;
    } else {
        return false;}
    }

    public static void choose(Player player1){
        
            if(Start.skcount == 2){
                player1.choice = false;
            } else {
                player1.choice= true;
            }
        
    }

    public static void last (Player player1, Player player2){
        if (player1.finalturn == true){
            Player.pick(player2);
        } 

    }
    }

