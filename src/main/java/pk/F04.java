package pk;


public class F04 {

    public int amountofskulls = 0;


    public static int count(Faces roll){
        int amountofskulls = 0;
        String std = roll.name();
        String [] list = {"MONKEY", "PARROT", "GOLD", "DIAMOND", "SABER", "SKULL"};
        if (std == list[5]){
            amountofskulls++;
        }
        return amountofskulls;
    }

    public static boolean check(int amountofskulls){
        if (amountofskulls == 3){
            return true;
        } else{
            return false;
        }

    }


    
}
