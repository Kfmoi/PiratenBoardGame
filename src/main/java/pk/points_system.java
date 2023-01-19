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

        if ((player1.totalscore > player2.totalscore) && player1.totalscore >=6000){
            player1.wins++;
            System.out.println("\n"+ player1.name +" Wins!!!");
        } else if ((player2.totalscore > player1.totalscore) && player2.totalscore >=6000){
            System.out.println("\n"+ player2.name +" Wins!!!");
            player2.wins++;
        } else {
            System.out.println("\nTie Game");
        }
    }

    public static int goldcount(Faces roll){
        int amountofgold = 0;
        String std = roll.name();
        String [] list = {"MONKEY", "PARROT", "GOLD", "DIAMOND", "SABER", "SKULL"};
        if (std == list[2]){
            amountofgold++;
        }
        return amountofgold;
    }

    public static int diamondcount(Faces roll){
        int amountofdiamond = 0;
        String std = roll.name();
        String [] list = {"MONKEY", "PARROT", "GOLD", "DIAMOND", "SABER", "SKULL"};
        if (std == list[3]){
            amountofdiamond++;
        }
        return amountofdiamond;
    }

    public static int fullchestcheck(Player player, int num){
        int result = 0;
        if (num ==8){
            result += 500;
        }
        return result;
    }

    public static int setcheck (Player player){
        int result = 0;
        if (player.scount == 7 || player.mcount == 7 || player.pcount == 7 || player.gcount == 7 || player.dcount ==7 ){
            result += 2000;
        } else if (player.scount == 6 || player.mcount == 6 || player.pcount == 6 || player.gcount == 6 || player.dcount ==6){
            result += 1000;
        } else if (player.scount == 5 || player.mcount == 5 || player.pcount == 5|| player.gcount == 5 || player.dcount ==5){
            result += 500;
        } else if (player.scount == 4 || player.mcount == 4 || player.pcount == 4|| player.gcount == 4 || player.dcount ==4){
            result += 200;
        } else if (player.scount == 3 || player.mcount == 3 || player.pcount == 3|| player.gcount == 3 || player.dcount ==3){
            result += 100;
        } else if (player.scount == 8 || player.mcount == 8 || player.pcount == 8|| player.gcount == 8 || player.dcount ==8){
            result += 4000;
        }
        return result;
    }
}
