import pk.Dice;

public class PiratenKarpen {

    public static void main(String[] args) {
        int amountofgames = 42;
        int amountofrolls = 8;
        System.out.println("Welcome to Piraten Karpen Simulator!");
        System.out.println("I'm rolling a dice");
        Dice myDice = new Dice();
        for (int i =0; i<amountofrolls; i++){
            System.out.println(myDice.roll());
        }
        System.out.println("That's all folks!");
    }
    
}
