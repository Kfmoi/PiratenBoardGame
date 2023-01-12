package pk;


public class F04 {

    public int amountofskulls;

    public static void count(Faces roll, int amountofskulls){
        if (roll == Faces.SKULL){
            amountofskulls++;
        }
    }

    public static void check(int amountofskulls){
        if (amountofskulls == 3){
            System.out.println("Three skulls have been rolled. Turn is done");
        }

    }


    
}
