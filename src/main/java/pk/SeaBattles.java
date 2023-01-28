package pk;


public class SeaBattles{

    // Checks if the number of sabres match the card
    public static boolean check(Player player){
        boolean ans = false;
        if (player.Card == "2 Sea Battle"){
            if (player.Sabre_saved < 2){
                ans = false;
            } else {
                ans = true;
            }
        } else if (player.Card == "3 Sea Battle"){
            if (player.Sabre_saved < 3){
                ans = false;
            } else {
                ans = true;
            }
        } else if (player.Card == "4 Sea Battle"){
            if (player.Sabre_saved < 4){
                ans = false;
            } else {
                ans = true;
            }
        }
        return ans;
    }

    // Determines how many sabres are needed for each sea battle card
    public static void needed(Player player){
        if (player.Card == "2 Sea Battle"){
            player.sabresneeded = 2;
        } else if (player.Card == "3 Sea Battle"){
            player.sabresneeded = 3;
        }else if (player.Card == "4 Sea Battle"){
            player.sabresneeded = 4;
        }
    }

    // Reward based on the sea battle cards
    public static int reward(Player player){
    int ans=0;
    if (player.Card == "2 Sea Battle"){
        ans = 300;
    } else if (player.Card == "3 Sea Battle"){
        player.sabresneeded = 500;
    }else if (player.Card == "4 Sea Battle"){
        player.sabresneeded = 1000;
    }
    return ans;
}
}