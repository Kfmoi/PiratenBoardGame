package pk;



public class F02 {
    public static int playerpoints =0;
    public static int skcount=0;



    public static boolean firstroll(int num){
        
        boolean skcheck = false;
        Faces results = null;
        int score = 0;
        Dice myDice = new Dice();


        for(int j =1; j<=num; j++){
            System.out.println("\n I'm rolling a dice #" + (j));
            results = myDice.roll();
            skcount += F04.count(results);
            skcheck = F04.check(skcount);
            score += F06.addpoints(results);

            System.out.println(results);   
            if (skcheck == true){
                break;
            } 
    }


    System.out.println("\nNumber of skulls: " + skcount);
    System.out.println("Number of points rolled:" + score);
    playerpoints += F06.finalscore(score);
    System.out.println("\nRound points: " + playerpoints);
    return skcheck;
}

/*public static Faces save(Faces rolled, int rndm){


}*/


}