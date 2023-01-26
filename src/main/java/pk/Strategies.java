package pk;

public class Strategies {

    public static void Random_strategy(Player player1){
        if(player1.Card == "nop"){
            player1.Skull_check = Start.randomroll(8,player1);
            Reroll.randomreroll(player1);
        } else if (player1.Card == "Monkey Business"){
            player1.Skull_check = Start.randomroll(8,player1);
            Reroll.randomreroll(player1);
        } else {
            player1.Skull_check = Start.seabattleroll(8, player1);
            Reroll.seabattlereroll(player1);
        }   
    }

    public static void  Combo_strategy(Player player1){
        if(player1.Card == "nop"){
            player1.Skull_check = Start.comboroll(8, player1);
            Reroll.comboreroll(player1);
        } else if (player1.Card == "Monkey Business"){
            player1.Skull_check = Start.comboroll(8, player1);
            Reroll.comboreroll(player1);
        } else {
            player1.Skull_check = Start.seabattleroll(8, player1);
            Reroll.seabattlereroll(player1);
        }
    }
}

