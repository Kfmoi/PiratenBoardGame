




package pk;

import pk.logging.logging;

public class Start {
    public static int playerscore =0;
    public static int skcount=0;
    public static boolean skcheck = false;
    public static int count;


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
    player.dsaved = player.dcount;
    player.ssaved = player.scount;
    player.gsaved = player.gcount;
    if (player.card == "nop"){
        player.msaved = player.mcount;
        player.psaved = player.pcount;
    }
    else {
        player.mpsaved = player.mpcount;
    }


    logging.debug("\nNumber of skulls: " + skcount);
    System.out.println("\nNumber of skulls: " + skcount);
    logging.debug("Number of points rolled:" + points);
    System.out.println("Number of points rolled:" + points);
    playerscore += points_system.fullchestcheck(player, points);
    playerscore += points_system.goldset(player);

    if (player.card == "nop"){
        playerscore += points_system.parrotset(player);
        playerscore += points_system.monkeyset(player);
    } else {
        playerscore += points_system.monkeybusiness(player);
    }
    playerscore += points_system.diamondset(player);
    playerscore += points_system.sabreset(player);
    playerscore += points_system.finalscore(points);
    if (res == true){
        playerscore=0;
    }
    player.totalscore += playerscore;
    player.totalsk += skcount;
    logging.debug("\nRound score: " + playerscore);
    System.out.println("\nRound score: " + playerscore);
    System.out.println("Total Score: " + player.totalscore);
    
    player.dcount = 0;
    player.scount=0;
    player.pcount=0;
    player.gcount=0;
    player.mcount=0;
    player.mpcount=0;
    return res;
}

    public static boolean firstroll2(int num, Player player){
    
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
count =skcount;
if (player.card == "nop"){
    if (player.dcount >= 1){
    player.dsaved+= player.dcount;
    count += player.dsaved;
} if (player.gcount >= 1){
    player.gsaved += player.gcount;
    count += player.gsaved;
} 
if (player.mcount >= 3){
    player.mcount+= player.mcount;
    count += player.msaved;
}else if (player.pcount >= 3){
    player.psaved+= player.pcount;
    count += player.psaved;
}else if (player.scount >= 3){
    player.ssaved+= player.scount;
    count += player.ssaved;
}
} else{
    if (player.dcount >= 1){
        player.dsaved+= player.dcount;
        count += player.dsaved;
    } 
    if (player.gcount >= 1){
        player.gsaved += player.gcount;
        count += player.gsaved;
    } 
    if (player.mpcount >= 2){
        player.mpcount+= player.mpcount;
        count += player.mpsaved;
    }   
    if (player.scount >= 3){
        player.ssaved+= player.scount;
        count += player.ssaved;
}
}



logging.debug("\nNumber of skulls: " + skcount);
    System.out.println("\nNumber of skulls: " + skcount);
    logging.debug("Number of points rolled:" + points);
    System.out.println("Number of points rolled:" + points);
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
if (res == true){
    playerscore =0;

}
player.totalscore += playerscore;
    player.totalsk += skcount;
    logging.debug("\nRound points: " + playerscore);
    System.out.println("\nRound points: " + playerscore);
    System.out.println("Total score:" + player.totalscore);
    player.dcount = 0;
    player.scount=0;
    player.pcount=0;
    player.gcount=0;
    player.mcount=0;
return res;
}
    

    public static boolean firstroll3(int num, Player player){
    
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
        System.out.println(results);
        res = skulls.check(skcount); 
}
count =skcount;
player.ssaved += player.scount;
player.gsaved = player.gcount;
player.msaved = player.mcount;
player.psaved = player.pcount;
player.dsaved = player.dcount;



logging.debug("\nNumber of skulls: " + skcount);
System.out.println("\nNumber of skulls: " + skcount);
logging.debug("Number of points rolled:" + points);
System.out.println("Number of points rolled:" + points);

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
player.turnscore += playerscore;
player.totalsk += skcount;
logging.debug("\nRound Score: " + playerscore);
System.out.println("\nRound Score: " + playerscore);
logging.debug("Final Score: " +player.totalscore);
System.out.println("Final Score: " +player.totalscore);

player.mcount = 0;
player.pcount = 0;
player.gcount = 0;
player.dcount = 0;
player.scount = 0;
return res;
}
}

