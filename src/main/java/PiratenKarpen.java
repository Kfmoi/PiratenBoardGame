import pk.Dice;
import pk.Faces;

import java.util.Random;
public class PiratenKarpen {

    public static void main(String[] args) {
        int amountofgames = 42;
        int numberofskulls = 0;
        int maxrolls = 8;
        int points = 0;
        Dice myDice = new Dice();
        Random selection = new Random();



        System.out.println("Welcome to Piraten Karpen Simulator!");
        

        for (int i=0; i<amountofgames; i++){

            for(int j =0; j<maxrolls; j++){


                System.out.println("I'm rolling a dice");
                myDice.roll();
                //player2.dice.roll();
                if (myDice.roll() == Faces.GOLD || myDice.roll() == Faces.DIAMOND){
                    points += 1;
                }
                for (numberofskulls=0; myDice.roll() == Faces.SKULL; numberofskulls++){
                    if(numberofskulls == 3){
                        System.out.println("Your turn is done");
                    }
                }
            }
            int rndmpick = selection.nextInt(((8-2)+1)+2);
            for (int k=0; k<rndmpick; k++){
                System.out.println("I'm rolling a dice");
                myDice.roll();
                if (myDice.roll() == Faces.GOLD|| myDice.roll() == Faces.DIAMOND){
                    points += 1;
                }
                for (numberofskulls=0; myDice.roll() == Faces.SKULL; numberofskulls++){
                    if(numberofskulls ==3){
                        System.out.println("Your turn is done");
                    }
                }
            }
            points = points*100;


        }

        System.out.println("That's all folks!");
    }
    
}
