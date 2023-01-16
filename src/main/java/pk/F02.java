package pk;



public class F02 {
    public static int playerpoints =0;
    public static int skcount=0;
    public static boolean skcheck = false;



    public static boolean firstroll(int num){
        
        Faces results = null;
        boolean res =false;
        int score = 0;
        Dice myDice = new Dice();


        for(int j =1; j<=num; j++){
            System.out.println("\nI'm rolling a dice #" + (j));
            results = myDice.roll();
            skcount += F04.count(results);
            score += F06.addpoints(results);
            System.out.println(results); 
            skcheck = F04.check(skcount); 
            res = skcheck;
    }





    System.out.println("\nNumber of skulls: " + skcount);
    System.out.println("Number of points rolled:" + score);
    playerpoints += F06.finalscore(score);
    System.out.println("\nRound points: " + playerpoints);
    return res;
}

/*public static Faces save(Faces rolled, int rndm){


}*/


}
