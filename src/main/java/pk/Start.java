package pk;



public class Start {
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
            skcount += skulls.count(results);
            score += points_system.addpoints(results);
            System.out.println(results); 
            skcheck = skulls.check(skcount); 
            res = skcheck;
    }





    System.out.println("\nNumber of skulls: " + skcount);
    System.out.println("Number of points rolled:" + score);
    playerpoints += points_system.finalscore(score);
    System.out.println("\nRound points: " + playerpoints);
    return res;
}

/*public static Faces save(Faces rolled, int rndm){


}*/


}
