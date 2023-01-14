package pk;



public class F02 {
    public static int playerpoints =0;



    public static boolean firstroll(int num){
        
        boolean skcheck = false;
        Faces results = null;
        int skullcount = 0;
        int score = 0;
        Dice myDice = new Dice();


        for(int j =1; j<=num; j++){
            System.out.println("I'm rolling a dice #" + (j));
            results = myDice.roll();
            skullcount += F04.count(results);
            skcheck = F04.check(skullcount);
            score += F06.addpoints(results);

            System.out.println(results);   
            if (skcheck == true){
                break;
            } 
    }


    System.out.println("Number of skulls: " + skullcount);
    System.out.println("Number of points rolled in first 8 rolls:" + score);
    playerpoints += F06.finalscore(score);
    System.out.println("Round points: " + playerpoints);
    return skcheck;
}


}