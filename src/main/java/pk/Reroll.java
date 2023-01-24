
package pk;

import pk.logging.logging;

public class Reroll {
    // Strategy 1: rerolling after the initial start
    public static void reroll(Player player1){
        
            int k=1;
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

                Start.playerscore = 0;
                
   
                int num = Random_num.randomnum(Start.skcount);
                logging.debug("\nNumber of rolls: "+ num);
                player1.skcheck =Start.firstroll(num,player1);
   
                logging.debug("Round #"+k+ " is done");
                k++;
                
               } while (player1.skullcheck(player1.skcheck) == false);
        
    }

    // Strategy 2: rerolling after the initial start
    public static void reroll2(Player player1){
        int k=1;
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


                if (Start.count >= 6){
                    break;
                }
                Start.playerscore = 0;

                int num = Random_num.randomnum(Start.count);
                logging.debug("\nNumber of rolls: "+ num);
                player1.skcheck =Start.firstroll(num,player1);
   
                logging.debug("Round #"+k+ " is done");
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
                    if (player1.ssaved >= 1){
                        count+= player1.ssaved;
                    }
                    Start.playerscore = 0;
                    int num = Random_num.randomnum(count);
                    logging.debug("\nNumber of rolls: "+ num);
                    player1.skcheck =Start.firstroll2(num,player1);
       
                    logging.debug("Round #"+k+ " is done");
                    k++;  
                } else {
                    player1.turnscore+= Cards.seabattlereward(player1);
                    Player.choose(player1);
                    if (player1.choice ==false) {
                    break;
                }
                    Start.playerscore = 0;

                    int num = Random_num.randomnum(count);
                    logging.debug("\nNumber of rolls: "+ num);
                    player1.skcheck =Start.firstroll2(num,player1);
       
                    logging.debug("Round #"+k+ " is done");
                    k++; 
                }

                if (count >= 6){
                    break;
                }

               } while (player1.skullcheck(player1.skcheck) == false);
        }
    }


