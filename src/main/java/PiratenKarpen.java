import pk.Dice;
import java.util.Scanner;

public class PiratenKarpen {


    class Player{
        public int points;
        public Dice dice;

        Player(){
            points = 0;
            dice = new Dice();
        }
    }
    public static void main(String[] args) {
        int amountofgames = 42;
        int numberofskulls = 0;
        int maxrolls = 8;
        Player player1 = new Player();
        Player player2 = new Player();
        System.out.println(player1.dice.roll(););
        System.out.println("Welcome to Piraten Karpen Simulator!");
        System.out.println("I'm rolling a dice");
        Dice myDice = new Dice();
        for (int i=0; i<amountofgames; i++){
            for(int j =0; j<maxrolls; j++){
                player1.dice.roll();
            
            }


        }

        System.out.println("That's all folks!");
    }
    
}
