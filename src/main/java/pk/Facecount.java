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

    // Function to count the amount of Gold faces has been rolled
    public static int goldcount(Faces roll){
        int amountofgold = 0;
        String std = roll.name();
        String [] list = {"MONKEY", "PARROT", "GOLD", "DIAMOND", "SABER", "SKULL"};
        if (std == list[2]){
            amountofgold++;
        }
        return amountofgold;
    }

    // Function to count the amount of Diamond faces has been rolled
    public static int diamondcount(Faces roll){
        int amountofdiamond = 0;
        String std = roll.name();
        String [] list = {"MONKEY", "PARROT", "GOLD", "DIAMOND", "SABER", "SKULL"};
        if (std == list[3]){
            amountofdiamond++;
        }
        return amountofdiamond;
    }


}
