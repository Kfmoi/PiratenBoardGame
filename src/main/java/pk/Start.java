package pk;



public class Start {
    public static int playerpoints =0;
    public static int skcount=0;
    public static boolean skcheck = false;



    public static boolean firstroll(int num, Player player){
        
        Faces results = null;
        boolean res =false;
        int points = 0;
        Dice myDice = new Dice();


        for(int j =1; j<=num; j++){
            System.out.println("\nI'm rolling a dice #" + (j));
            results = myDice.roll();
            skcount += skulls.count(results);
            points += points_system.addpoints(results);
            System.out.println(results); 
            res = skulls.check(skcount); 
    }





    System.out.println("\nNumber of skulls: " + skcount);
    System.out.println("Number of points rolled:" + points);
    playerpoints = points_system.finalscore(points);
    player.totalscore += playerpoints;
    player.totalsk += skcount;
    System.out.println("\n" + player.name + " Round points: " + playerpoints);
    return res;
}



}
