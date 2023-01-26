package pk;

import pk.logging.logging;

public class Player {
    public int totalscore = 0;
    public int Total_skulls = 0;
    public int Gold_count = 0;
    public int Diamond_count =0 ;
    public int Monkey_count = 0;
    public int Sabre_count =0 ;
    public int Parrot_count =0 ;
    public int Sabre_saved = 0;
    public int Monkey_saved = 0;
    public int Diamond_saved = 0;
    public int Gold_saved = 0;
    public int Parrot_saved = 0;
    public double Wins;
    public boolean Skull_check = false;
    public String Strategy_Decision;
    public boolean Endturn;
    public boolean Final_turn;
    public String Card;
    public int MP_count =0;
    public int MP_saved = 0;
    public int Turn_score=0;
    public boolean First_roll = true;
    public int sabresneeded = 0;
    public int Monkey_diff =0;
    public int Parrot_diff =0;
    public int Gold_diff =0;
    public int Diamond_diff =0;
    public int Sabre_diff =0;
    public int MP_diff =0;


    public static void GameStrategy(Player player1){
        if(player1.Strategy_Decision == "Random" || player1.Strategy_Decision == "random"){
            Strategies.Random_strategy(player1);
        } else {
            Strategies.Combo_strategy(player1);
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
                player1.Endturn = false;
            } else {
                player1.Endturn= true;
            }
        
    }

    public static void last (Player player1, Player player2){
        if (player1.Final_turn == true){
            Player.GameStrategy(player2);
        } 

    }
    }

