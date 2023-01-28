
package pk;

import java.util.Random;

import pk.logging.logging;

public class Reroll {

    // Random: Rerolling the dice after the initial 8 dice roll
    public static void Random_reroll(Player player1){
        Random selection = new Random();
        int num = selection.nextInt(3)+1;
        logging.debug("Number of rerolls: " + num);
        for (int i = 0; i<=num; i++){
            if(player1.skullcheck(player1.Skull_check)==true){
                break;
            }
            if (player1.totalscore >= 6000){
                player1.Final_turn = true;
                break;
            }
            Player.choose(player1);
            if (player1.Endturn ==false) {
                break;
            }
            int rand = Random_num.randomnum(DiceRoll.skcount+2);
            logging.debug("\nNumber of rolls: "+ num);
            player1.Skull_check =DiceRoll.Random_roll(rand,player1);
            if (i == num){
                player1.totalscore += player1.Turn_score;
            }
        }
    }
    
    // Combo: Rerolling the dice after the initial 8 dice roll
    public static void Combo_reroll(Player player1){
        int count = DiceRoll.skcount + DiceRoll.count;
            int k=1;
            int num =0;
            do {
                if(player1.skullcheck(player1.Skull_check)==true){
                    break;
                }
                if (player1.totalscore >= 6000){
                    player1.Final_turn = true;
                    break;
                }
                Player.choose(player1);
                if (player1.Endturn ==false) {
                    break;
                }
                if (count >= 6){
                    break;
                }

                DiceRoll.playerscore = 0;
                num = Random_num.randomnum(count);
                logging.debug("\nNumber of rolls: "+ num);
                player1.Skull_check = DiceRoll.Combo_roll(num, player1);
                logging.debug("Round #"+k+ " is done");
                k++;
                
               } while (player1.skullcheck(player1.Skull_check) == false);
        
    }   
    
    // Sea Battle: Rerolling the dice after the initial 8 dice roll
    public static void Seabattle_reroll(Player player1){
        if(player1.Strategy_Decision == "combo"){
        int k=1;
            do {
                if(player1.skullcheck(player1.Skull_check)==true){
                    break;
                }
                if (player1.totalscore >= 6000){
                    player1.Final_turn = true;
                    break;
                }

                if (SeaBattles.check(player1) == false){
                    if (DiceRoll.count >= 6){
                        break;
                    }
                    DiceRoll.playerscore = 0;
                    int num = Random_num.randomnum(DiceRoll.count);
                    logging.debug("\nNumber of rolls: "+ num);
                    player1.Skull_check =DiceRoll.Seabattle_roll(num,player1);
       
                    logging.debug("Round #"+k+ " is done");
                    k++;  
                } else {
                    Player.choose(player1);
                    if (player1.Endturn ==false) {
                    break;
                }
                    DiceRoll.playerscore = 0;
                    if (DiceRoll.count >= 6){
                        break;
                    }

                    int num = Random_num.randomnum(DiceRoll.count);
                    logging.debug("\nNumber of rolls: "+ num);
                    player1.Skull_check =DiceRoll.Seabattle_roll(num,player1);
       
                    logging.debug("Round #"+k+ " is done");
                    k++; 
                }


               } while (player1.skullcheck(player1.Skull_check) == false);
        } else {
            Random selection = new Random();
            int num = selection.nextInt(4)+1;
            logging.debug("Number of rerolls: " + num);
            for (int i = 0; i<=num; i++){
                if(player1.skullcheck(player1.Skull_check)==true){
                    break;
                }
                if (player1.totalscore >= 6000){
                    player1.Final_turn = true;
                    break;
                }

                if (SeaBattles.check(player1) == false){
                    if (DiceRoll.count >= 6){
                        break;
                    }
                    DiceRoll.playerscore = 0;
                    int rand = Random_num.randomnum(DiceRoll.skcount);
                    logging.debug("\nNumber of rolls: "+ rand);
                    player1.Skull_check =DiceRoll.Seabattle_roll(rand,player1);
       
                    logging.debug("Round #"+i+ " is done"); 
                } else {
                    Player.choose(player1);
                    if (player1.Endturn ==false) {
                    break;
                }
                    DiceRoll.playerscore = 0;
                    if (DiceRoll.count >= 6){
                        break;
                    }


                    int rand = Random_num.randomnum(DiceRoll.skcount);
                    logging.debug("\nNumber of rolls: "+ rand);
                    player1.Skull_check =DiceRoll.Seabattle_roll(rand,player1);
       
                    logging.debug("Round #"+i+ " is done");
            }
        }
    }

    
    }
}



