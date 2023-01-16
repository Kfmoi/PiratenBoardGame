package pk;
import java.util.Random;


public class F05 {
    public static int randomnum(){
        Random selection = new Random();
        int rndmpick = selection.nextInt(8-2)+2;
        return rndmpick;
    }
}
