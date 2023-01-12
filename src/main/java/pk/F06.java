package pk;

public class F06 {
    public int amountofpoints;

    public static int addpoints(Faces roll){
        int amountofpoints = 0;
        if (roll == Faces.GOLD || roll == Faces.DIAMOND){
            amountofpoints++;
        }
        return amountofpoints;
    }


    public static int finalscore(int points){
        points = points*100;
        return points;

    }
}
