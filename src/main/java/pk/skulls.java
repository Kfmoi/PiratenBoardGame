package pk;


public class skulls {

    public int amountofskulls = 0;

    // Function to count the amount of Parrot faces has been rolled
    public static int count(Faces roll){
        int amountofskulls = 0;
        String std = roll.name();
        String [] list = {"MONKEY", "PARROT", "GOLD", "DIAMOND", "SABER", "SKULL"};
        if (std == list[5]){
            amountofskulls++;
        }
        return amountofskulls;
    }

    // Function to check if the skulls count is greater than or equal to 3
    public static boolean check(int amountofskulls){
        if (amountofskulls >= 3){
            return true;
        } else{
            return false;
        }

    }
    
}
