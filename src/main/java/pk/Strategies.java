package pk;

public class Strategies {

    // This holds all the different methods for the random game strategy
    public static void Random_strategy(Player player1){
        if(player1.Card == "nop"){
            player1.Skull_check = DiceRoll.Random_roll(8,player1);
            Reroll.Random_reroll(player1);
        } else if (player1.Card == "Monkey Business"){
            player1.Skull_check = DiceRoll.Random_roll(8,player1);
            Reroll.Random_reroll(player1);
        } else {
            player1.Skull_check = DiceRoll.Seabattle_roll(8, player1);
            Reroll.Seabattle_reroll(player1);
        }   
    }

    // This holds all the different methods for the combo game strategy
    public static void  Combo_strategy(Player player1){
        if(player1.Card == "nop"){
            player1.Skull_check = DiceRoll.Combo_roll(8, player1);
            Reroll.Combo_reroll(player1);
        } else if (player1.Card == "Monkey Business"){
            player1.Skull_check = DiceRoll.Combo_roll(8, player1);
            Reroll.Combo_reroll(player1);
        } else {
            player1.Skull_check = DiceRoll.Seabattle_roll(8, player1);
            Reroll.Seabattle_reroll(player1);
        }
    }
}

