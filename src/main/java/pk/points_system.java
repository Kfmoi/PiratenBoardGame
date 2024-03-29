package pk;

import pk.logging.logging;

public class points_system {

    // Function that adds the additional points when a set has already been rolled
    public static int Set_difference(int num,int difference){
        int result =0;
        if (num == 3){
            if(difference ==1){
                    result += 100;
                } else if (difference == 2){
                    result += 400;
                } else if (difference == 3){
                    result += 900;
                } else if (difference == 4){
                    result += 1900;
                } else if (difference == 5){
                    result += 3900;
                }
            } else if (num == 4){
                if(difference ==1){
                    result += 300;
                } else if (difference == 2){
                    result += 800;
                } else if (difference == 3){
                    result += 1800;
                } else if (difference == 4){
                    result += 3800;
                }
            } else if (num == 5){
                if(difference ==1){
                    result += 500;
                } else if (difference == 2){
                    result += 1500;
                } else if (difference == 3){
                    result += 3500;
                }
            } else if (num == 6){
                if(difference ==1){
                    result += 1000;
                } else if (difference == 2){
                    result += 3000;
                }
            }
            return result;
        }
    
    // Adds points to a counter whenever a gold or diamond is rolled
    public static int Add_points(Faces roll){
        int amountofpoints=0;

        if (roll.equals(Faces.GOLD)|| roll.equals(Faces.DIAMOND)){
            amountofpoints++;
        }
        return amountofpoints;
    }

    // From the points, gets the score by *100
    public static int Final_score(int points){
        points = points*100;
        return points;

    }

    // Determines the winner of each game, and adds the win to their counter
    public static void results(Player player1, Player player2){

        if ((player1.totalscore > player2.totalscore) && player1.totalscore >=6000){
            player1.Wins++;
            logging.debug("Player 1 Wins!!!");
        } else if ((player2.totalscore > player1.totalscore) && player2.totalscore >=6000){
            logging.debug("Player 2 Wins!!!");
            player2.Wins++;
        } else {
            logging.debug("Tie Game");
            player1.Wins++;
            player2.Wins++;
        }
    }

    // A full chest check function, when you get points from all your 8 rolls
    public static int Fullchest_check(Player player, int num){
        int result = 0;
        if (num == 8){
            result += 500;
        }
        return result;
    }

    // Checks if theres any Monkey sets starting from 3
    public static int Monkey_set (Player player){
        int result = 0;
        if (player.Strategy_Decision == "combo"){
        if (player.First_roll == true){
            if ( player.Monkey_count == 7 ){
                result += 2000;
            } else if ( player.Monkey_count == 6 ){
                result += 1000;
            } else if ( player.Monkey_count == 5 ){
                result += 500;
            } else if ( player.Monkey_count == 4){
                result += 200;
            } else if (player.Monkey_count == 3){
                result += 100;
            } else if (player.Monkey_count == 8){
                result += 4000;
            }
        } else {
        if (player.Monkey_saved < 3){
        if ( player.Monkey_saved == 7 ){
            result += 2000;
        } else if ( player.Monkey_saved == 6 ){
            result += 1000;
        } else if ( player.Monkey_saved == 5 ){
            result += 500;
        } else if ( player.Monkey_saved == 4){
            result += 200;
        } else if (player.Monkey_saved == 3){
            result += 100;
        } else if (player.Monkey_saved == 8){
            result += 4000;
        }
    } else {
        result += Set_difference(player.Monkey_saved, player.Monkey_diff);
    }
        
}
} else {
    if ( player.Monkey_count == 7 ){
        result += 2000;
    } else if ( player.Monkey_count == 6 ){
        result += 1000;
    } else if ( player.Monkey_count == 5 ){
        result += 500;
    } else if ( player.Monkey_count == 4){
        result += 200;
    } else if (player.Monkey_count == 3){
        result += 100;
    } else if (player.Monkey_count == 8){
        result += 4000;
    }
}
    return result;
}

    // Checks if theres any Parrot sets starting from 3
    public static int Parrot_set (Player player){
    int result = 0;
    if (player.Strategy_Decision == "combo"){
    if (player.First_roll == true){
        if ( player.Parrot_count == 7 ){
            result += 2000;
        } else if ( player.Parrot_count == 6 ){
            result += 1000;
        } else if ( player.Parrot_count == 5 ){
            result += 500;
        } else if ( player.Parrot_count == 4){
            result += 200;
        } else if (player.Parrot_count == 3){
            result += 100;
        } else if (player.Parrot_count == 8){
            result += 4000;
        }
    } else {
    if (player.Parrot_saved < 3){
    if ( player.Parrot_saved == 7 ){
        result += 2000;
    } else if ( player.Parrot_saved == 6 ){
        result += 1000;
    } else if ( player.Parrot_saved == 5 ){
        result += 500;
    } else if ( player.Parrot_saved == 4){
        result += 200;
    } else if (player.Parrot_saved == 3){
        result += 100;
    } else if (player.Parrot_saved == 8){
        result += 4000;
    }
} else {
    Set_difference(player.Parrot_saved, player.Parrot_diff);
}
    
    }
} else {
    if ( player.Parrot_count == 7 ){
        result += 2000;
    } else if ( player.Parrot_count == 6 ){
        result += 1000;
    } else if ( player.Parrot_count == 5 ){
        result += 500;
    } else if ( player.Parrot_count == 4){
        result += 200;
    } else if (player.Parrot_count == 3){
        result += 100;
    } else if (player.Parrot_count == 8){
        result += 4000;
    }
}

return result;
}

    // Checks if theres any Sabre sets starting from 3
    public static int Sabre_set (Player player){
    int result = 0;
    if (player.Strategy_Decision == "combo"){
    if (player.First_roll == true){
        if ( player.Sabre_count == 7 ){
            result += 2000;
        } else if ( player.Sabre_count == 6 ){
            result += 1000;
        } else if ( player.Sabre_count == 5 ){
            result += 500;
        } else if ( player.Sabre_count == 4){
            result += 200;
        } else if (player.Sabre_count == 3){
            result += 100;
        } else if (player.Sabre_count == 8){
            result += 4000;
        }
    } else{
    if (player.Sabre_saved < 3){
    if ( player.Sabre_saved == 7 ){
        result += 2000;
    } else if ( player.Sabre_saved == 6 ){
        result += 1000;
    } else if ( player.Sabre_saved == 5 ){
        result += 500;
    } else if ( player.Sabre_saved == 4){
        result += 200;
    } else if (player.Sabre_saved == 3){
        result += 100;
    } else if (player.Sabre_saved == 8){
        result += 4000;
    }
} else {
    result += Set_difference(player.Sabre_saved, player.Sabre_diff);
}
    }
    
    } else {
        if ( player.Sabre_count == 7 ){
            result += 2000;
        } else if ( player.Sabre_count == 6 ){
            result += 1000;
        } else if ( player.Sabre_count == 5 ){
            result += 500;
        } else if ( player.Sabre_count == 4){
            result += 200;
        } else if (player.Sabre_count == 3){
            result += 100;
        } else if (player.Sabre_count == 8){
            result += 4000;
        }
    }

return result;
}

    // Checks if theres any Diamond sets starting from 3
    public static int Diamond_set (Player player){
    int result = 0;
    if (player.Strategy_Decision == "combo"){
    if (player.First_roll == true){
        if ( player.Diamond_count == 7 ){
            result += 2000;
        } else if ( player.Diamond_count == 6 ){
            result += 1000;
        } else if ( player.Diamond_count == 5 ){
            result += 500;
        } else if ( player.Diamond_count == 4){
            result += 200;
        } else if (player.Diamond_count == 3){
            result += 100;
        } else if (player.Diamond_count == 8){
            result += 4000;
        }
    } else {
    if (player.Diamond_saved < 3){
    if ( player.Diamond_saved == 7 ){
        result += 2000;
    } else if ( player.Diamond_saved == 6 ){
        result += 1000;
    } else if ( player.Diamond_saved == 5 ){
        result += 500;
    } else if ( player.Diamond_saved == 4){
        result += 200;
    } else if (player.Diamond_saved == 3){
        result += 100;
    } else if (player.Diamond_saved == 8){
        result += 4000;
    }

} else {
    result += Set_difference(player.Diamond_saved, player.Diamond_diff);
}
    }
} else {
    if ( player.Diamond_count == 7 ){
        result += 2000;
    } else if ( player.Diamond_count == 6 ){
        result += 1000;
    } else if ( player.Diamond_count == 5 ){
        result += 500;
    } else if ( player.Diamond_count == 4){
        result += 200;
    } else if (player.Diamond_count == 3){
        result += 100;
    } else if (player.Diamond_count == 8){
        result += 4000;
    }
}


return result;
}

    // Checks if theres any Gold sets starting from 3
    public static int Gold_set (Player player){
    int result = 0;
    if (player.Strategy_Decision == "combo"){
    if (player.First_roll == true){
        if ( player.Gold_count == 7 ){
            result += 2000;
        } else if ( player.Gold_count == 6 ){
            result += 1000;
        } else if ( player.Gold_count == 5 ){
            result += 500;
        } else if ( player.Gold_count == 4){
            result += 200;
        } else if (player.Gold_count == 3){
            result += 100;
        } else if (player.Gold_count == 8){
            result += 4000;
        }
    } else {
    if (player.Gold_saved < 3){
    if ( player.Gold_saved == 7 ){
        result += 2000;
    } else if ( player.Gold_saved == 6 ){
        result += 1000;
    } else if ( player.Gold_saved == 5 ){
        result += 500;
    } else if ( player.Gold_saved == 4){
        result += 200;
    } else if (player.Gold_saved == 3){
        result += 100;
    } else if (player.Gold_saved == 8){
        result += 4000;
    }
}else {
    result += Set_difference(player.Gold_saved, player.Gold_diff);
}
    }
} else {
    if ( player.Gold_count == 7 ){
        result += 2000;
    } else if ( player.Gold_count == 6 ){
        result += 1000;
    } else if ( player.Gold_count == 5 ){
        result += 500;
    } else if ( player.Gold_count == 4){
        result += 200;
    } else if (player.Gold_count == 3){
        result += 100;
    } else if (player.Gold_count == 8){
        result += 4000;
    }
}


return result;
}

    // Checks if theres any Monkey Business sets sets starting from 3
    public static int Monkeybusiness (Player player){
    int result = 0;
    if (player.Strategy_Decision == "combo"){
    if (player.First_roll == true){
        if ( player.MP_count == 7 ){
            result += 2000;
        } else if ( player.MP_count == 6 ){
            result += 1000;
        } else if ( player.MP_count == 5 ){
            result += 500;
        } else if ( player.MP_count == 4){
            result += 200;
        } else if (player.MP_count == 3){
            result += 100;
        } else if (player.MP_count == 8){
            result += 4000;
        }
    } else {
    if (player.MP_saved < 3){
    if ( player.MP_saved == 7 ){
        result += 2000;
    } else if ( player.MP_saved == 6 ){
        result += 1000;
    } else if ( player.MP_saved == 5 ){
        result += 500;
    } else if ( player.MP_saved == 4){
        result += 200;
    } else if (player.MP_saved == 3){
        result += 100;
    } else if (player.MP_saved == 8){
        result += 4000;
    }
} else {
    result += Set_difference(player.MP_saved, player.MP_diff);
}
    }
    } else {
        if ( player.MP_count == 7 ){
            result += 2000;
        } else if ( player.MP_count == 6 ){
            result += 1000;
        } else if ( player.MP_count == 5 ){
            result += 500;
        } else if ( player.MP_count == 4){
            result += 200;
        } else if (player.MP_count == 3){
            result += 100;
        } else if (player.MP_count == 8){
            result += 4000;
        }
    }
return result;
}

    // Function that chooses which dice to keep and what to reroll
    public static void Save_Dice(Player player){
        if (player.Card == "nop"){
            if (player.Diamond_count >= 1 || player.Diamond_saved > 1){
                player.Diamond_diff = (player.Diamond_count + player.Diamond_saved)-player.Diamond_saved;
                player.Diamond_saved += player.Diamond_count;
                DiceRoll.count+= player.Diamond_count;
            } if (player.Gold_count > 1 || player.Gold_saved > 1){
                player.Gold_diff = (player.Gold_count + player.Gold_saved)-player.Gold_saved;
                player.Gold_saved += player.Gold_count;
                DiceRoll.count += player.Gold_count;
            } if (player.Monkey_count > 3 || player.Monkey_saved > 3){
                player.Monkey_diff = (player.Monkey_count + player.Monkey_saved)-player.Monkey_saved;
                player.Monkey_saved += player.Monkey_count;
                DiceRoll.count+= player.Monkey_count;
            }if (player.Parrot_count > 3|| player.Parrot_saved > 3){
                player.Parrot_diff = (player.Parrot_count + player.Parrot_saved)-player.Parrot_saved;
                player.Parrot_saved += player.Parrot_count;
                DiceRoll.count+= player.Parrot_count;
            }if (player.Sabre_count > 3|| player.Sabre_saved > 3){
                player.Sabre_diff = (player.Sabre_count + player.Sabre_saved)-player.Sabre_saved;
                player.Sabre_saved += player.Sabre_count;
                DiceRoll.count+= player.Sabre_count;
            }
        } else if (player.Card == "Monkey Business"){
            if (player.Diamond_count > 1|| player.Diamond_saved > 1){
                player.Diamond_diff = (player.Diamond_count + player.Diamond_saved)-player.Diamond_saved;
                player.Diamond_saved += player.Diamond_count;
                DiceRoll.count+= player.Diamond_count;
            } if (player.Gold_count > 1|| player.Gold_saved > 1){
                player.Gold_diff = (player.Gold_count + player.Gold_saved)-player.Gold_saved;
                player.Gold_saved += player.Gold_count;
                DiceRoll.count += player.Gold_count;
            } if (player.MP_count >1|| player.MP_saved > 1){
                player.MP_diff = (player.MP_count + player.MP_saved)-player.MP_saved;
                player.MP_saved += player.MP_count;
                DiceRoll.count+= player.MP_count;
            }
            if (player.Sabre_count > 3|| player.Sabre_saved > 3){
                player.Sabre_diff = (player.Sabre_count + player.Sabre_saved)-player.Sabre_saved;
                player.Sabre_saved += player.Sabre_count;
                DiceRoll.count+= player.Sabre_count;
            }
        } else {
            if (player.Diamond_count >= 1 || player.Diamond_saved > 1){
                player.Diamond_diff = (player.Diamond_count + player.Diamond_saved)-player.Diamond_saved;
                player.Diamond_saved += player.Diamond_count;
                DiceRoll.count+= player.Diamond_count;
            } if (player.Gold_count > 1 || player.Gold_saved > 1){
                player.Gold_diff = (player.Gold_count + player.Gold_saved)-player.Gold_saved;
                player.Gold_saved += player.Gold_count;
                DiceRoll.count += player.Gold_count;
            } if (player.Monkey_count > 3 || player.Monkey_saved > 3){
                player.Monkey_diff = (player.Monkey_count + player.Monkey_saved)-player.Monkey_saved;
                player.Monkey_saved += player.Monkey_count;
                DiceRoll.count+= player.Monkey_count;
            }if (player.Parrot_count > 3|| player.Parrot_saved > 3){
                player.Parrot_diff = (player.Parrot_count + player.Parrot_saved)-player.Parrot_saved;
                player.Parrot_saved += player.Parrot_count;
                DiceRoll.count+= player.Parrot_count;
            }if (player.Sabre_count > 3|| player.Sabre_saved > 3){
                player.Sabre_diff = (player.Sabre_count + player.Sabre_saved)-player.Sabre_saved;
                player.Sabre_saved += player.Sabre_count;
                DiceRoll.count+= player.Sabre_count;
            }
        }
    }
}
