package pk;

public class points_system {

    // Adds points to a counter whenever a gold or diamond is rolled
    public static int addpoints(Faces roll){
        int amountofpoints=0;

        if (roll.equals(Faces.GOLD)|| roll.equals(Faces.DIAMOND)){
            amountofpoints++;
        }
        return amountofpoints;
    }

    // From the points, gets the score by *100
    public static int finalscore(int points){
        points = points*100;
        return points;

    }

    // Determines the winner of each game
    public static void results(Player player1, Player player2){

        if ((player1.totalscore > player2.totalscore) && player1.totalscore >=6000){
            player1.wins++;
            System.out.println("Player 1 Wins!!!");
        } else if ((player2.totalscore > player1.totalscore) && player2.totalscore >=6000){
            System.out.println("Player 2 Wins!!!");
            player2.wins++;
        } else {
            System.out.println("Tie Game");
        }
    }

    // // Function to count the amount of Gold faces has been rolled
    public static int goldcount(Faces roll){
        int amountofgold = 0;
        String std = roll.name();
        String [] list = {"MONKEY", "PARROT", "GOLD", "DIAMOND", "SABER", "SKULL"};
        if (std == list[2]){
            amountofgold++;
        }
        return amountofgold;
    }

    // Function to count the amount of Diamond faces has been rolled
    public static int diamondcount(Faces roll){
        int amountofdiamond = 0;
        String std = roll.name();
        String [] list = {"MONKEY", "PARROT", "GOLD", "DIAMOND", "SABER", "SKULL"};
        if (std == list[3]){
            amountofdiamond++;
        }
        return amountofdiamond;
    }

    // A full chest check function
    public static int fullchestcheck(Player player, int num){
        int result = 0;
        if (num == 8){
            result += 500;
        }
        return result;
    }

    // Combo checks
    public static int monkeyset (Player player){
        int result = 0;
        if ( player.msaved == 7 ){
            result += 2000;
        } else if ( player.msaved == 6 ){
            result += 1000;
        } else if ( player.msaved == 5 ){
            result += 500;
        } else if ( player.msaved == 4){
            result += 200;
        } else if (player.msaved == 3){
            result += 100;
        } else if (player.msaved == 8){
            result += 4000;
        }
        
    
    
    return result;
}
public static int parrotset (Player player){
    int result = 0;
    if ( player.psaved == 7 ){
        result += 2000;
    } else if ( player.psaved == 6 ){
        result += 1000;
    } else if ( player.psaved == 5 ){
        result += 500;
    } else if ( player.psaved == 4){
        result += 200;
    } else if (player.psaved == 3){
        result += 100;
    } else if (player.psaved == 8){
        result += 4000;
    }
    


return result;
}
public static int sabreset (Player player){
    int result = 0;
    if ( player.ssaved == 7 ){
        result += 2000;
    } else if ( player.ssaved == 6 ){
        result += 1000;
    } else if ( player.ssaved == 5 ){
        result += 500;
    } else if ( player.ssaved == 4){
        result += 200;
    } else if (player.ssaved == 3){
        result += 100;
    } else if (player.ssaved == 8){
        result += 4000;
    }
    


return result;
}
public static int diamondset (Player player){
    int result = 0;
    if ( player.dsaved == 7 ){
        result += 2000;
    } else if ( player.dsaved == 6 ){
        result += 1000;
    } else if ( player.dsaved == 5 ){
        result += 500;
    } else if ( player.dsaved == 4){
        result += 200;
    } else if (player.dsaved == 3){
        result += 100;
    } else if (player.dsaved == 8){
        result += 4000;
    }
    


return result;
}
public static int goldset (Player player){
    int result = 0;
    if ( player.gsaved == 7 ){
        result += 2000;
    } else if ( player.gsaved == 6 ){
        result += 1000;
    } else if ( player.gsaved == 5 ){
        result += 500;
    } else if ( player.gsaved == 4){
        result += 200;
    } else if (player.gsaved == 3){
        result += 100;
    } else if (player.gsaved == 8){
        result += 4000;
    }
    


return result;
}
}
