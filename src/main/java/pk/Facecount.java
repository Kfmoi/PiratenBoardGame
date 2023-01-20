package pk;

public class Facecount {

    // Function to count the amount of Monkey faces has been rolled
    public static int monkeycount(Faces roll){
        int amountofmonkey = 0;
        String std = roll.name();
        String [] list = {"MONKEY", "PARROT", "GOLD", "DIAMOND", "SABER", "SKULL"};
        if (std == list[0]){
            amountofmonkey++;
        }
        return amountofmonkey;
    }

    // Function to count the amount of Parrot faces has been rolled
    public static int parrotcount(Faces roll){
        int amountofparrot = 0;
        String std = roll.name();
        String [] list = {"MONKEY", "PARROT", "GOLD", "DIAMOND", "SABER", "SKULL"};
        if (std == list[1]){
            amountofparrot++;
        }
        return amountofparrot;
    }

    // Function to count the amount of Saber faces has been rolled
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
