




package pk;

import pk.logging.logging;

public class Start {
    public static int playerscore =0;
    public static int skcount=0;
    public static int count;
    public static int difference;
    public static int points=0;
    public static boolean Sabres_check = false;
    public static boolean Done = false;

    public static void printstat(Player player){
    logging.debug("\nNumber of skulls: " + skcount);
    logging.debug("Number of points rolled:" + points);
    logging.debug("\nRound points: " + playerscore);
    logging.debug("Total score:" + player.totalscore);
    }
    public static boolean rolldice(int num, Player player){
        Faces results = null;
        boolean res =false;
    
    Dice myDice = new Dice();

        for(int j =1; j<=num; j++){
            logging.debug("\nDice #"+ j);
            results = myDice.roll();
            skcount += skulls.count(results);
            player.Gold_count += points_system.goldcount(results);
            player.Diamond_count += points_system.diamondcount(results);
            if (player.Card == "nop"){
                player.Parrot_count += Facecount.parrotcount(results);
                player.Monkey_count += Facecount.monkeycount(results);
            } else {
                player.MP_count += Facecount.parrotcount(results);
                player.MP_count += Facecount.monkeycount(results);
            }
            player.Sabre_count += Facecount.sabercount(results);
            points += points_system.addpoints(results);
            logging.debug(results.name());
            res = skulls.check(skcount); 
    }
    return res;
    }
     public static void points(Player player){
        playerscore += points_system.fullchestcheck(player, points);   
        playerscore += points_system.goldset(player);
        playerscore += points_system.diamondset(player);
        playerscore += points_system.sabreset(player);
        if (player.Card == "Monkey Business"){
            playerscore += points_system.monkeybusiness(player);
        } else {
            playerscore += points_system.parrotset(player);
            playerscore += points_system.monkeyset(player);
        }
        playerscore += points_system.finalscore(points);
     }
   
   
     // Function for the first 8 dice rolls
    public static boolean randomroll(int num, Player player){
        
        boolean res = rolldice(num, player);
        points(player);
        
        if (res == true){
            playerscore=0;
        }
        player.totalscore += playerscore;
        player.Total_skulls += skcount;
        printstat(player);
        player.Monkey_count = 0;
        player.Parrot_count = 0;
        player.Gold_count = 0;
        player.Diamond_count = 0;
        player.Sabre_count = 0;
        player.MP_count=0;
        playerscore = 0;
        points =0;
        return res;
    }

    public static boolean comboroll(int num, Player player){ 
        boolean res = rolldice(num, player);
        points_system.caldifference(player);
        points(player);

        if (res == true){
            playerscore =0;
        }
    
        player.totalscore += playerscore;
        player.Total_skulls += skcount;
        printstat(player);
        player.First_roll = false;
        player.Monkey_count = 0;
        player.Parrot_count = 0;
        player.Gold_count = 0;
        player.Diamond_count = 0;
        player.Sabre_count = 0;
        player.MP_count=0;
        player.Diamond_diff = 0;
        player.Sabre_diff = 0;
        player.Gold_diff = 0;
        player.Monkey_diff = 0;
        player.Parrot_diff = 0;
        player.MP_diff = 0;
        points = 0;
        return res;
    }
    
    public static boolean seabattleroll(int num, Player player){

        boolean res = rolldice(num, player);
        count += skcount;
        Sabres_check = Cards.seabattlecheck(player);
        
        
        if (Sabres_check == false){
            if (player.Sabre_count >= 1 ){
                player.Sabre_saved += player.Sabre_count;
                points(player);
                count+= player.Sabre_count;
            }
        } else {
            if (Done == false){ 
                player.Turn_score += Cards.seabattlereward(player);
                Done = true;
                if (player.Strategy_Decision == "Random"){
                    points(player);
                    player.Turn_score += playerscore;
                    player.totalscore += player.Turn_score;
                } else{
                    points_system.caldifference(player);
                    points(player);
                    player.Turn_score += playerscore;
                    player.totalscore += player.Turn_score;
                }
            } else {
                if (player.Strategy_Decision == "Random"){
                    points(player);
                    player.Turn_score += playerscore;
                    player.totalscore += player.Turn_score;
                } else{
                    points_system.caldifference(player);
                    points(player);
                    player.Turn_score += playerscore;
                    player.totalscore += player.Turn_score;
                }
            }
        }

        if (res == true){
            if (Sabres_check == false){
                player.Turn_score = 0;
                player.totalscore -= Cards.seabattlereward(player);
                playerscore =0;
            }
        }
        logging.debug("Sabres count: "+player.Sabre_saved);
        player.Total_skulls += skcount;
        logging.debug("\nNumber of skulls: " + skcount);
        logging.debug("Number of points rolled:" + points);
        logging.debug("\nRound Score: " + playerscore);
        logging.debug("Final Score: " +player.totalscore);

        player.Monkey_count = 0;
        player.Parrot_count = 0;
        player.Gold_count = 0;
        player.Diamond_count = 0;
        player.Sabre_count = 0;
        points =0;
        return res;
    }
}

