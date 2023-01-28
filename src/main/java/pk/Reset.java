package pk;

public class Reset {
    
    // Resets all the getters and setters before every game
    public static void GameReset(Player player1, Player player2){
        player1.totalscore = 0;
        player2.totalscore=0;
        DiceRoll.skcount=0;
        DiceRoll.playerscore =0;
        player1.Skull_check =false;
        player2.Skull_check =false;
        player1.Total_skulls = 0;
        player2.Total_skulls = 0;
        player1.Final_turn = false;
        player2.Final_turn =false;
        player1.Turn_score=0;
        player2.Turn_score =0;
        player1.Sabre_saved = 0;
        player1.Parrot_saved = 0;
        player1.Monkey_saved = 0;
        player1.Gold_saved = 0;
        player1.Diamond_saved = 0;
        player2.Sabre_saved = 0;
        player2.Parrot_saved = 0;
        player2.Monkey_saved = 0;
        player2.Gold_saved = 0;
        player2.Diamond_saved = 0;
        DiceRoll.count =0;
        DiceRoll.difference=0;
        player1.First_roll = true;
        player2.First_roll =true;
        DiceRoll.points =0;
        player1.Diamond_diff = 0;
        player1.Sabre_diff = 0;
        player1.Gold_diff = 0;
        player1.Monkey_diff = 0;
        player1.Parrot_diff = 0;
        player1.MP_diff = 0;
        player2.Diamond_diff = 0;
        player2.Sabre_diff = 0;
        player2.Gold_diff = 0;
        player2.Monkey_diff = 0;
        player2.Parrot_diff = 0;
        player2.MP_diff = 0;
        player1.sabresneeded = 0;
        player2.sabresneeded = 0;
        DiceRoll.Sabres_check = false;
        DiceRoll.Done = false;
         

    }

    // Resets some of the getters and setters before every player's turn
    public static void TurnReset(Player player){
        DiceRoll.skcount = 0;
        DiceRoll.count =0;
        DiceRoll.Sabres_check = false;
        player.Sabre_saved = 0;
        player.Parrot_saved = 0;
        player.Monkey_saved = 0;
        player.Gold_saved = 0;
        player.Diamond_saved = 0;
        player.MP_saved = 0;
        DiceRoll.difference = 0;
        player.First_roll = true;
        DiceRoll.points =0;
        player.Total_skulls = 0;
        player.Turn_score=0;
        DiceRoll.playerscore = 0;
        player.Skull_check =false;
        player.Endturn = true;
        player.Diamond_diff = 0;
        player.Sabre_diff = 0;
        player.Gold_diff = 0;
        player.Monkey_diff = 0;
        player.Parrot_diff = 0;
        player.MP_diff = 0;
        player.sabresneeded = 0;
        DiceRoll.Done = false;
    }
}
