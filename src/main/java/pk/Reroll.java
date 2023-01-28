
package pk;

import java.util.Random;

import pk.logging.logging;

public class Reroll {
    // Strategy 1: rerolling after the initial start
    public static void randomreroll(Player player1){
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
            int rand = Random_num.randomnum(Start.skcount+2);
            logging.debug("\nNumber of rolls: "+ num);
            player1.Skull_check =Start.randomroll(rand,player1);
            if (i == num){
                player1.totalscore += player1.Turn_score;
            }
        }
    }
    public static void comboreroll(Player player1){
        int count = Start.skcount + Start.count;
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

                Start.playerscore = 0;
                num = Random_num.randomnum(count);
                logging.debug("\nNumber of rolls: "+ num);
                player1.Skull_check = Start.comboroll(num, player1);
                logging.debug("Round #"+k+ " is done");
                k++;
                
               } while (player1.skullcheck(player1.Skull_check) == false);
        
    }   
    public static void seabattlereroll(Player player1){
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

                if (Cards.seabattlecheck(player1) == false){
                    if (Start.count >= 6){
                        break;
                    }
                    Start.playerscore = 0;
                    int num = Random_num.randomnum(Start.count);
                    logging.debug("\nNumber of rolls: "+ num);
                    player1.Skull_check =Start.seabattleroll(num,player1);
       
                    logging.debug("Round #"+k+ " is done");
                    k++;  
                } else {
                    Player.choose(player1);
                    if (player1.Endturn ==false) {
                    break;
                }
                    Start.playerscore = 0;
                    if (Start.count >= 6){
                        break;
                    }

                    int num = Random_num.randomnum(Start.count);
                    logging.debug("\nNumber of rolls: "+ num);
                    player1.Skull_check =Start.seabattleroll(num,player1);
       
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

                if (Cards.seabattlecheck(player1) == false){
                    if (Start.count >= 6){
                        break;
                    }
                    Start.playerscore = 0;
                    int rand = Random_num.randomnum(Start.skcount);
                    logging.debug("\nNumber of rolls: "+ rand);
                    player1.Skull_check =Start.seabattleroll(rand,player1);
       
                    logging.debug("Round #"+i+ " is done"); 
                } else {
                    Player.choose(player1);
                    if (player1.Endturn ==false) {
                    break;
                }
                    Start.playerscore = 0;
                    if (Start.count >= 6){
                        break;
                    }


                    int rand = Random_num.randomnum(Start.skcount);
                    logging.debug("\nNumber of rolls: "+ rand);
                    player1.Skull_check =Start.seabattleroll(rand,player1);
       
                    logging.debug("Round #"+i+ " is done");
            }
        }
    }

    
    }
}



