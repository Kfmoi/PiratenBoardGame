package pk;


public class F04 {

    public int amountofskulls;

    public static int count(Faces roll){
        int amountofskulls = 0;
        if (roll == Faces.SKULL){
            amountofskulls++;
        }
        return amountofskulls;
    }

    public static void check(int amountofskulls){
        if (amountofskulls == 3){
            System.out.println("Three skulls have been rolled. Turn is done");
        }

    }


    
}
