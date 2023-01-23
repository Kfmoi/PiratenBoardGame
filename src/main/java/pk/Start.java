package pk;

import pk.logging.logging;

public class Start {
    public static int playerscore =0;
    public static int skcount=0;
    public static boolean skcheck = false;


    // Function for the first 8 dice rolls
    public static boolean firstroll(int num, Player player){
        
        Faces results = null;
        boolean res =false;
        int points = 0;
        Dice myDice = new Dice();


        for(int j =1; j<=num; j++){
            logging.debug("\nDice #"+ j);
            results = myDice.roll();
            skcount += skulls.count(results);
            player.gcount += points_system.goldcount(results);
            player.dcount += points_system.diamondcount(results);
            player.pcount += Facecount.parrotcount(results);
            player.mcount += Facecount.monkeycount(results);
            player.scount += Facecount.sabercount(results);
            points += points_system.addpoints(results);
            logging.debug(results.name());
            res = skulls.check(skcount); 
    }



    logging.debug("\nNumber of skulls: " + skcount);
    logging.debug("Number of points rolled:" + points);
    playerscore += points_system.fullchestcheck(player, points);
    playerscore += points_system.setcheck(player);
    playerscore += points_system.finalscore(points);
    player.totalscore += playerscore;
    player.totalsk += skcount;
    logging.debug("\nRound points: " + playerscore);
    return res;
}



}