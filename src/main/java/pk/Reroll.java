package pk;
public class Reroll {
    // Strategy 1: rerolling after the initial start
    public static void reroll(Player player1){
        
            int k=1;
            do {
                if(player1.skullcheck(player1.skcheck)==true){
                    break;
                }
                if (player1.totalpoints >= 6000){
                    player1.finalturn = true;
                    break;
                }
                Player.choose(player1);
                if (player1.choice ==false) {
                    break;
                }

                Start.playerscore = 0;
                player1.dcount = 0;
                player1.gcount =0;
                player1.scount = 0;
                player1.mcount = 0;
                player1.pcount=0;
   
                int num = Random_num.randomnum(Start.skcount);
                System.out.println("\nNumber of rolls: "+ num);
                player1.skcheck =Start.firstroll(num,player1);
   
                System.out.println("Round #"+ k+ " is done");
                k++;
                
               } while (player1.skullcheck(player1.skcheck) == false);
        
    }

    // Strategy 2: rerolling after the initial start
    public static void reroll2(Player player1){
        int k=1;
        int count = Start.skcount;
            do {
                if(player1.skullcheck(player1.skcheck)==true){
                    System.out.println("Final points: "+ player1.totalpoints);
                    break;
                }
                if (player1.totalpoints >= 6000){
                    player1.finalturn = true;
                    break;
                }
                Player.choose(player1);
                if (player1.choice ==false) {
                    break;
                }

                if (player1.dcount > 1){
                    count+= player1.dcount;
                } else if (player1.gcount > 1){
                    count += player1.gcount;
                } else if (player1.mcount > 3){
                    count+= player1.mcount;
                }else if (player1.pcount > 3){
                    count+= player1.pcount;
                }else if (player1.scount > 3){
                    count+= player1.scount;
                }

                if (count >= 6){
                    break;
                }
                Start.playerscore = 0;

                int num = Random_num.randomnum(count);
                System.out.println("\nNumber of rolls: "+ num);
                player1.skcheck =Start.firstroll(num,player1);
   
                System.out.println("Round #"+ k+ " is done");
                k++;

               } while (player1.skullcheck(player1.skcheck) == false);
        }

    }
