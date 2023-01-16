package pk;

public class points_system {

    public static int addpoints(Faces roll){
        int amountofpoints=0;

        if (roll.equals(Faces.GOLD)|| roll.equals(Faces.DIAMOND)){
            amountofpoints++;
        }
        return amountofpoints;
    }


    public static int finalscore(int points){
        points = points*100;
        return points;

    }

    public static void results(Player player1, Player player2){
        if ((player1.totalpoints > player2.totalpoints) && player1.totalpoints >6000){
            player1.wins++;
            System.out.println("\n"+ player1.name +" Wins!!!");
        } else if ((player2.totalpoints > player1.totalpoints) && player2.totalpoints >6000){
            System.out.println("\n"+ player2.name +" Wins!!!");
            player2.wins++;
        } else {
            System.out.println("\nTie Game");
        }
    }
}
