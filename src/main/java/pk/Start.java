




package pk;

import pk.logging.logging;

public class Start {
    public static int playerscore =0;
    public static int skcount=0;
    public static int count;
    public static int difference;
    public static int points=0;

    public static void printstat(Player player){
    logging.debug("\nNumber of skulls: " + skcount);
    System.out.println("\nNumber of skulls: " + skcount);
    logging.debug("Number of points rolled:" + points);
    System.out.println("Number of points rolled:" + points);
    logging.debug("\nRound points: " + playerscore);
    System.out.println("\nRound points: " + playerscore);
    logging.debug("Total score:" + player.totalscore);
    System.out.println("Total score:" + player.totalscore);
    }
    public static boolean rolldice(int num, Player player){
        Faces results = null;
        boolean res =false;
    
    Dice myDice = new Dice();

        for(int j =1; j<=num; j++){
            logging.debug("\nDice #"+ j);
            results = myDice.roll();
            skcount += skulls.count(results);
            player.gcount += points_system.goldcount(results);
            player.dcount += points_system.diamondcount(results);
            if (player.card == "nop"){
                player.pcount += Facecount.parrotcount(results);
                player.mcount += Facecount.monkeycount(results);
            } else {
                player.mpcount += Facecount.parrotcount(results);
                player.mpcount += Facecount.monkeycount(results);
            }
            player.scount += Facecount.sabercount(results);
            points += points_system.addpoints(results);
            logging.debug(results.name());
            System.out.println(results);
            res = skulls.check(skcount); 
    }
    return res;
    }
     public static void points(Player player){
        playerscore += points_system.fullchestcheck(player, points);   
        playerscore += points_system.goldset(player);
        playerscore += points_system.diamondset(player);
        playerscore += points_system.sabreset(player);
        if (player.card == "nop"){
            playerscore += points_system.parrotset(player);
            playerscore += points_system.monkeyset(player);
        } else {
            playerscore += points_system.monkeybusiness(player);
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
        player.totalsk += skcount;
        printstat(player);
        player.dcount = 0;
        player.scount=0;
        player.pcount=0;
        player.gcount=0;
        player.mcount=0;
        player.mpcount=0;
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
        player.totalsk += skcount;
        printstat(player);
        player.firstroll = false;
        player.dcount = 0;
        player.scount=0;
        player.pcount=0;
        player.gcount=0;
        player.mcount=0;
        player.mpcount=0;
        player.diffd = 0;
        player.diffs = 0;
        player.diffm = 0;
        player.diffg = 0;
        player.diffp = 0;
        player.diffmp = 0;
        points = 0;
        return res;
    }
    

    public static boolean firstroll3(int num, Player player){
        player.finalturn = true;

        boolean res = rolldice(num, player);
        count =skcount;
        player.ssaved += player.scount;
        player.gsaved = player.gcount;
        player.msaved = player.mcount;
        player.psaved = player.pcount;
        player.dsaved = player.dcount;

        logging.debug("\nNumber of skulls: " + skcount);
        logging.debug("Number of points rolled:" + points);

        playerscore += points_system.fullchestcheck(player, points);
        playerscore += points_system.monkeyset(player);
        playerscore += points_system.parrotset(player);
        playerscore += points_system.goldset(player);
        playerscore += points_system.diamondset(player);
        playerscore += points_system.sabreset(player);
        playerscore += points_system.finalscore(points);

        if (res == true){
            if (player.sabresneeded<= player.ssaved){
                player.turnscore += Cards.seabattlereward(player);
                player.totalscore += player.turnscore;
            }else {
                player.turnscore = 0;
                player.totalscore -= Cards.seabattlereward(player);
                playerscore =0;
            }
        }

        if (player.scount >= 1 || player.ssaved > 1){
            player.ssaved += player.scount;
            count+= player.scount;
        } 

        player.turnscore += playerscore;
        player.totalsk += skcount;
        logging.debug("\nRound Score: " + playerscore);
        logging.debug("Final Score: " +player.totalscore);

        player.mcount = 0;
        player.pcount = 0;
        player.gcount = 0;
        player.dcount = 0;
        player.scount = 0;
        return res;
    }
}

