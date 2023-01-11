import pk.Dice;
import java.util.Scanner;

public class PiratenKarpen {


    class Player{
        public int points;
        public Dice dice;

        Player(int initial){
            points = 0;
            dice = new Dice();
        }
    }
    public static void main(String[] args) {
        int amountofgames = 42;
        System.out.println("Welcome to Piraten Karpen Simulator!");
        System.out.println("I'm rolling a dice");
        Dice myDice = new Dice();
        Scanner input1 = new Scanner(System.in);
        int amountofrolls = input1.nextInt();
        if (amountofrolls < 2 || amountofrolls > 8){
            System.out.println("You can roll between 2 and 8");
        }

        System.out.println("That's all folks!");
    }
    
}
