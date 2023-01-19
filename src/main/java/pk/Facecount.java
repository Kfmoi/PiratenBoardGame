package pk;

public class Facecount {
    public static int monkeycount(Faces roll){
        int amountofmonkey = 0;
        String std = roll.name();
        String [] list = {"MONKEY", "PARROT", "GOLD", "DIAMOND", "SABER", "SKULL"};
        if (std == list[0]){
            amountofmonkey++;
        }
        return amountofmonkey;
    }

    public static int parrotcount(Faces roll){
        int amountofparrot = 0;
        String std = roll.name();
        String [] list = {"MONKEY", "PARROT", "GOLD", "DIAMOND", "SABER", "SKULL"};
        if (std == list[1]){
            amountofparrot++;
        }
        return amountofparrot;
    }

    public static int sabercount(Faces roll){
        int amountofsaber = 0;
        String std = roll.name();
        String [] list = {"MONKEY", "PARROT", "GOLD", "DIAMOND", "SABER", "SKULL"};
        if (std == list[4]){
            amountofsaber++;
        }
        return amountofsaber;
    }


}
