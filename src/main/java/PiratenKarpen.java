

import java.util.Scanner;

import pk.Player;
import pk.Percentage;
import pk.Strategies;

public class PiratenKarpen {


    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();

        try (Scanner name = new Scanner(System.in)) {
            int amountofgames = 3;


            System.out.println("Welcome to Piraten Karpen Simulator!");
            System.out.println("\nPlayer 1's name: ");
            String name1 = name.nextLine();
            System.out.println("\nPlayer 2's name: ");
            String name2 = name.nextLine();

            player1.name =name1;
            player2.name =name2;

            Strategies.strategy1(player1, player2, amountofgames);

            double stdout1 = Percentage.stdout(player1.wins,amountofgames);
            double stdout2 = Percentage.stdout(player2.wins, amountofgames);

            System.out.println( "\n" + player1.name+"'s win percentage is: "+ stdout1);
            System.out.println( "\n" + player2.name+"'s win percentage is: "+ stdout2);

        }


}
}
