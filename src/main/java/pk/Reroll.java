
package pk;

import pk.logging.logging;

public class Reroll {
    // Strategy 1: rerolling after the initial start
    public static void reroll(Player player1){
        int count = Start.skcount + Start.count;
            int k=1;
            int num =0;
            do {
                if(player1.skullcheck(player1.skcheck)==true){
                    break;
                }
                if (player1.totalscore >= 6000){
                    player1.finalturn = true;
                    break;
                }
                Player.choose(player1);
                if (player1.choice ==false) {
                    break;
                }
                if (count >= 6){
                    break;
                }

                Start.playerscore = 0;
                
                if (player1.decision == "Random"){
                num = Random_num.randomnum(Start.skcount);
                } else {
                    num = Random_num.randomnum(count);
                }
                logging.debug("\nNumber of rolls: "+ num);
                System.out.println("\nNumber of rolls: "+ num);
                if (player1.decision == "Random"){
                    player1.skcheck =Start.randomroll(num,player1);
                    } else {
                        player1.skcheck = Start.comboroll(num, player1);
                    }
                player1.skcheck =Start.randomroll(num,player1);
   
                logging.debug("Round #"+k+ " is done");
                System.out.println("Round #"+k+ " is done");
                k++;
                
               } while (player1.skullcheck(player1.skcheck) == false);
        
    }
    
    public static void reroll3(Player player1){
        int k=1;
        int count = Start.skcount;
            do {
                if(player1.skullcheck(player1.skcheck)==true){
                    break;
                }
                if (player1.totalscore >= 6000){
                    player1.finalturn = true;
                    break;
                }

                if (player1.sabresneeded > player1.ssaved){
                    if (count >= 6){
                        break;
                    }
                    Start.playerscore = 0;
                    int num = Random_num.randomnum(count);
                    logging.debug("\nNumber of rolls: "+ num);
                    player1.skcheck =Start.firstroll3(num,player1);
       
                    logging.debug("Round #"+k+ " is done");
                    k++;  
                } else {
                    Player.choose(player1);
                    if (player1.choice ==false) {
                    break;
                }
                    Start.playerscore = 0;
                    if (count >= 6){
                        break;
                    }

                    int num = Random_num.randomnum(count);
                    logging.debug("\nNumber of rolls: "+ num);
                    player1.skcheck =Start.firstroll3(num,player1);
       
                    logging.debug("Round #"+k+ " is done");
                    k++; 
                }


               } while (player1.skullcheck(player1.skcheck) == false);
        }
    }



