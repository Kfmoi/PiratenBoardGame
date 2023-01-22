package pk;

import java.util.Scanner;

public class Player {
    public int totalpoints = 0;
    public int totalscore = 0;
    public int totalsk = 0;
    public int gcount = 0;
    public int dcount =0 ;
    public int mcount = 0;
    public int scount =0 ;
    public int pcount =0 ;
    public int totalround = 0;
    public double wins;
    public boolean skcheck = false;
    public String decision ;
    public static void pick(Player player1){
        if(player1.decision == "Random"){
            Strategies.strategy1(player1);
        } else {
            Strategies.strategy2(player1);
        }
    }
    public boolean skullcheck(boolean skcheck){
        if (skcheck == true){
        System.out.println("Three skulls have been rolled");
        return true;
    } else {
        return false;}
    }
    public boolean choice;
    public static Scanner input = new Scanner(System.in);
    public static void choose(Player player1){
        
            int ans = input.nextInt();
            if(ans == 1){
                player1.choice = true;
            } else {
                player1.choice= false;
            }
        
    }
    }

