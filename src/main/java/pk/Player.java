package pk;

public class Player {
    public int totalpoints = 0;
    public int totalscore = 0;
    public int totalsk = 0;
    public int gcount = 0;
    public int dcount =0 ;
    public int mcount = 0;
    public int scount =0 ;
    public int pcount =0 ;
    public double wins;

    public boolean skcheck = false;
    public String decision = "";

    // Differentiates the different strategies
    public static void pick(Player player1){
        if(player1.decision == "Random" || player1.decision == "random"){
            Strategies.strategy1(player1);
        } else if (player1.decision == "combo" || player1.decision == "Combo"){
            Strategies.strategy2(player1);
        }
    }

    //Checks if 3 skulls have been rolled
    public boolean skullcheck(boolean skcheck){
        if (skcheck == true){
        System.out.println("Three skulls have been rolled");
        return true;
    } else {
        return false;}
    }
}
