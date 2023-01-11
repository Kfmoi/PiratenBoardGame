import pk.Dice;
import java.util.Random;
public class PiratenKarpen {


    static class Player{
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
        int points = 0;
        Player player1 = new Player();
        Player player2 = new Player();
        Random selection = new Random();



        System.out.println("Welcome to Piraten Karpen Simulator!");
        


        Dice myDice = new Dice();
        for (int i=0; i<amountofgames; i++){
            for(int j =0; j<maxrolls; j++){
                System.out.println("I'm rolling a dice");
                player1.dice.roll();
                if (player1.dice.roll().equals("GOLD")|| player1.dice.roll().equals("DIAMOND")){
                    points += 1;
                }
                for (numberofskulls=0; player1.dice.roll().equals("SKULL"); numberofskulls++){
                    if(numberofskulls ==3){
                        System.out.println("This game is done");
                    }
                }
            }
            int rndmpick = selection.nextInt(((8-2)+1)+2);
            for (int k=0; k<rndmpick; k++){
                System.out.println("I'm rolling a dice");
                player1.dice.roll();
                if (player1.dice.roll().equals("GOLD")|| player1.dice.roll().equals("DIAMOND")){
                    points += 1;
                }
                for (numberofskulls=0; player1.dice.roll().equals("SKULL"); numberofskulls++){
                    if(numberofskulls ==3){
                        System.out.println("This game is done");
                    }
                }
            }


        }

        System.out.println("That's all folks!");
    }
    
}
