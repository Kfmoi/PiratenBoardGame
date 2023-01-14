package pk;

public class F06 {

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
}
