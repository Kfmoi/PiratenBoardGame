package pk;


public class F04 {

    public int amountofskulls;

    public static String[] face(){
        String [] list = {"MONKEY", "PARROT", "GOLD", "DIAMOND", "SABER", "SKULL"};
        return list;
    }

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
            System.out.println("Three skulls have been rolled. Turn is done");
            return true;
        } else{
            return false;
        }

    }


    
}
