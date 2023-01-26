package pk;

public class points_system {

    public static int setdifference(int num,int difference){
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
    public static int addpoints(Faces roll){
        int amountofpoints=0;

        if (roll.equals(Faces.GOLD)|| roll.equals(Faces.DIAMOND)){
            amountofpoints++;
        }
        return amountofpoints;
    }

    // From the points, gets the score by *100
    public static int finalscore(int points){
        points = points*100;
        return points;

    }

    // Determines the winner of each game
    public static void results(Player player1, Player player2){

        if ((player1.totalscore > player2.totalscore) && player1.totalscore >=6000){
            player1.wins++;
            System.out.println("Player 1 Wins!!!");
        } else if ((player2.totalscore > player1.totalscore) && player2.totalscore >=6000){
            System.out.println("Player 2 Wins!!!");
            player2.wins++;
        } else {
            System.out.println("Tie Game");
        }
    }

    // // Function to count the amount of Gold faces has been rolled
    public static int goldcount(Faces roll){
        int amountofgold = 0;
        String std = roll.name();
        String [] list = {"MONKEY", "PARROT", "GOLD", "DIAMOND", "SABER", "SKULL"};
        if (std == list[2]){
            amountofgold++;
        }
        return amountofgold;
    }

    // Function to count the amount of Diamond faces has been rolled
    public static int diamondcount(Faces roll){
        int amountofdiamond = 0;
        String std = roll.name();
        String [] list = {"MONKEY", "PARROT", "GOLD", "DIAMOND", "SABER", "SKULL"};
        if (std == list[3]){
            amountofdiamond++;
        }
        return amountofdiamond;
    }

    // A full chest check function
    public static int fullchestcheck(Player player, int num){
        int result = 0;
        if (num == 8){
            result += 500;
        }
        return result;
    }

    // Combo checks
    public static int monkeyset (Player player){
        int result = 0;
        if (player.decision == "combo"){
        if (player.firstroll == true){
            if ( player.mcount == 7 ){
                result += 2000;
            } else if ( player.mcount == 6 ){
                result += 1000;
            } else if ( player.mcount == 5 ){
                result += 500;
            } else if ( player.mcount == 4){
                result += 200;
            } else if (player.mcount == 3){
                result += 100;
            } else if (player.mcount == 8){
                result += 4000;
            }
        } else {
        if (player.msaved < 3){
        if ( player.msaved == 7 ){
            result += 2000;
        } else if ( player.msaved == 6 ){
            result += 1000;
        } else if ( player.msaved == 5 ){
            result += 500;
        } else if ( player.msaved == 4){
            result += 200;
        } else if (player.msaved == 3){
            result += 100;
        } else if (player.msaved == 8){
            result += 4000;
        }
    } else {
        result += setdifference(player.msaved, player.diffm);
    }
        
}
} else {
    if ( player.mcount == 7 ){
        result += 2000;
    } else if ( player.mcount == 6 ){
        result += 1000;
    } else if ( player.mcount == 5 ){
        result += 500;
    } else if ( player.mcount == 4){
        result += 200;
    } else if (player.mcount == 3){
        result += 100;
    } else if (player.mcount == 8){
        result += 4000;
    }
}
    return result;
}

    public static int parrotset (Player player){
    int result = 0;
    if (player.decision == "combo"){
    if (player.firstroll == true){
        if ( player.pcount == 7 ){
            result += 2000;
        } else if ( player.pcount == 6 ){
            result += 1000;
        } else if ( player.pcount == 5 ){
            result += 500;
        } else if ( player.pcount == 4){
            result += 200;
        } else if (player.pcount == 3){
            result += 100;
        } else if (player.pcount == 8){
            result += 4000;
        }
    } else {
    if (player.psaved < 3){
    if ( player.psaved == 7 ){
        result += 2000;
    } else if ( player.psaved == 6 ){
        result += 1000;
    } else if ( player.psaved == 5 ){
        result += 500;
    } else if ( player.psaved == 4){
        result += 200;
    } else if (player.psaved == 3){
        result += 100;
    } else if (player.psaved == 8){
        result += 4000;
    }
} else {
    setdifference(player.psaved, player.diffp);
}
    
    }
} else {
    if ( player.pcount == 7 ){
        result += 2000;
    } else if ( player.pcount == 6 ){
        result += 1000;
    } else if ( player.pcount == 5 ){
        result += 500;
    } else if ( player.pcount == 4){
        result += 200;
    } else if (player.pcount == 3){
        result += 100;
    } else if (player.pcount == 8){
        result += 4000;
    }
}

return result;
}

    public static int sabreset (Player player){
    int result = 0;
    if (player.decision == "combo"){
    if (player.firstroll == true){
        if ( player.scount == 7 ){
            result += 2000;
        } else if ( player.scount == 6 ){
            result += 1000;
        } else if ( player.scount == 5 ){
            result += 500;
        } else if ( player.scount == 4){
            result += 200;
        } else if (player.scount == 3){
            result += 100;
        } else if (player.scount == 8){
            result += 4000;
        }
    } else{
    if (player.ssaved < 3){
    if ( player.ssaved == 7 ){
        result += 2000;
    } else if ( player.ssaved == 6 ){
        result += 1000;
    } else if ( player.ssaved == 5 ){
        result += 500;
    } else if ( player.ssaved == 4){
        result += 200;
    } else if (player.ssaved == 3){
        result += 100;
    } else if (player.ssaved == 8){
        result += 4000;
    }
} else {
    result += setdifference(player.ssaved, player.diffs);
}
    }
    
    } else {
        if ( player.scount == 7 ){
            result += 2000;
        } else if ( player.scount == 6 ){
            result += 1000;
        } else if ( player.scount == 5 ){
            result += 500;
        } else if ( player.scount == 4){
            result += 200;
        } else if (player.scount == 3){
            result += 100;
        } else if (player.scount == 8){
            result += 4000;
        }
    }

return result;
}

    public static int diamondset (Player player){
    int result = 0;
    if (player.decision == "combo"){
    if (player.firstroll == true){
        if ( player.dcount == 7 ){
            result += 2000;
        } else if ( player.dcount == 6 ){
            result += 1000;
        } else if ( player.dcount == 5 ){
            result += 500;
        } else if ( player.dcount == 4){
            result += 200;
        } else if (player.dcount == 3){
            result += 100;
        } else if (player.dcount == 8){
            result += 4000;
        }
    } else {
    if (player.dsaved < 3){
    if ( player.dsaved == 7 ){
        result += 2000;
    } else if ( player.dsaved == 6 ){
        result += 1000;
    } else if ( player.dsaved == 5 ){
        result += 500;
    } else if ( player.dsaved == 4){
        result += 200;
    } else if (player.dsaved == 3){
        result += 100;
    } else if (player.dsaved == 8){
        result += 4000;
    }

} else {
    result += setdifference(player.dsaved, player.diffd);
}
    }
} else {
    if ( player.dcount == 7 ){
        result += 2000;
    } else if ( player.dcount == 6 ){
        result += 1000;
    } else if ( player.dcount == 5 ){
        result += 500;
    } else if ( player.dcount == 4){
        result += 200;
    } else if (player.dcount == 3){
        result += 100;
    } else if (player.dcount == 8){
        result += 4000;
    }
}


return result;
}

    public static int goldset (Player player){
    int result = 0;
    if (player.decision == "combo"){
    if (player.firstroll == true){
        if ( player.gcount == 7 ){
            result += 2000;
        } else if ( player.gcount == 6 ){
            result += 1000;
        } else if ( player.gcount == 5 ){
            result += 500;
        } else if ( player.gcount == 4){
            result += 200;
        } else if (player.gcount == 3){
            result += 100;
        } else if (player.gcount == 8){
            result += 4000;
        }
    } else {
    if (player.gsaved < 3){
    if ( player.gsaved == 7 ){
        result += 2000;
    } else if ( player.gsaved == 6 ){
        result += 1000;
    } else if ( player.gsaved == 5 ){
        result += 500;
    } else if ( player.gsaved == 4){
        result += 200;
    } else if (player.gsaved == 3){
        result += 100;
    } else if (player.gsaved == 8){
        result += 4000;
    }
}else {
    result += setdifference(player.gsaved, player.diffg);
}
    }
} else {
    if ( player.gcount == 7 ){
        result += 2000;
    } else if ( player.gcount == 6 ){
        result += 1000;
    } else if ( player.gcount == 5 ){
        result += 500;
    } else if ( player.gcount == 4){
        result += 200;
    } else if (player.gcount == 3){
        result += 100;
    } else if (player.gcount == 8){
        result += 4000;
    }
}


return result;
}

    public static int monkeybusiness (Player player){
    int result = 0;
    if (player.decision == "combo"){
    if (player.firstroll == true){
        if ( player.mpcount == 7 ){
            result += 2000;
        } else if ( player.mpcount == 6 ){
            result += 1000;
        } else if ( player.mpcount == 5 ){
            result += 500;
        } else if ( player.mpcount == 4){
            result += 200;
        } else if (player.mpcount == 3){
            result += 100;
        } else if (player.mpcount == 8){
            result += 4000;
        }
    } else {
    if (player.mpsaved < 3){
    if ( player.mpsaved == 7 ){
        result += 2000;
    } else if ( player.mpsaved == 6 ){
        result += 1000;
    } else if ( player.mpsaved == 5 ){
        result += 500;
    } else if ( player.mpsaved == 4){
        result += 200;
    } else if (player.mpsaved == 3){
        result += 100;
    } else if (player.mpsaved == 8){
        result += 4000;
    }
} else {
    result += setdifference(player.mpsaved, player.diffmp);
}
    }
    } else {
        if ( player.mpcount == 7 ){
            result += 2000;
        } else if ( player.mpcount == 6 ){
            result += 1000;
        } else if ( player.mpcount == 5 ){
            result += 500;
        } else if ( player.mpcount == 4){
            result += 200;
        } else if (player.mpcount == 3){
            result += 100;
        } else if (player.mpcount == 8){
            result += 4000;
        }
    }
return result;
}

    public static void caldifference(Player player){
        if (player.card == "nop"){
            if (player.dcount >= 1 || player.dsaved > 1){
                player.diffd = (player.dcount + player.dsaved)-player.dsaved;
                player.dsaved += player.dcount;
                Start.count+= player.dcount;
            } if (player.gcount > 1 || player.gsaved > 1){
                player.diffg = (player.gcount + player.gsaved)-player.gsaved;
                player.gsaved += player.gcount;
                Start.count += player.gcount;
            } if (player.mcount > 3 || player.msaved > 3){
                player.diffm = (player.mcount + player.msaved)-player.msaved;
                player.msaved += player.mcount;
                Start.count+= player.mcount;
            }if (player.pcount > 3|| player.psaved > 3){
                player.diffp = (player.pcount + player.psaved)-player.psaved;
                player.psaved += player.pcount;
                Start.count+= player.pcount;
            }if (player.scount > 3|| player.ssaved > 3){
                player.diffs = (player.scount + player.ssaved)-player.ssaved;
                player.ssaved += player.scount;
                Start.count+= player.scount;
            }
        } else{
            if (player.dcount > 1|| player.dsaved > 1){
                player.diffd = (player.dcount + player.dsaved)-player.dsaved;
                player.dsaved += player.dcount;
                Start.count+= player.dcount;
            } if (player.gcount > 1|| player.gsaved > 1){
                player.diffg = (player.gcount + player.gsaved)-player.gsaved;
                player.gsaved += player.gcount;
                Start.count += player.gcount;
            } if (player.mpcount >1|| player.mpsaved > 1){
                player.diffmp = (player.mpcount + player.mpsaved)-player.mpsaved;
                player.mpsaved += player.mpcount;
                Start.count+= player.mpcount;
            }
            if (player.scount > 3|| player.ssaved > 3){
                player.diffs = (player.scount + player.ssaved)-player.ssaved;
                player.ssaved += player.scount;
                Start.count+= player.scount;
            }
        }
    }
}
