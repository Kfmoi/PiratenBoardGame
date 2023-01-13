
import pk.Faces;
import pk.F02;
import pk.F04;
import pk.F05;
import pk.F06;

public class PiratenKarpen {

    public static int finalpoints;
    

    public static void main(String[] args) {
        int amountofgames = 1;
        int score = 0;


        System.out.println("Welcome to Piraten Karpen Simulator!");
        

        for (int i=0; i<amountofgames; i++){
            Faces check = F02.firstroll();
            System.out.println(check);
            int skullcount = F04.count(check);
            F04.check(skullcount);
            score = F06.addpoints(check);
            int num = F05.randomnum();
            for(int j=0; j<num; j++){
                Faces seccheck = F02.firstroll();
                int secskullcount = F04.count(seccheck);
                F04.check(secskullcount);
                score += F06.addpoints(seccheck);
            }

           
            finalpoints = F06.finalscore(score);
            System.out.println(finalpoints);

        System.out.println("That's all folks!");
    }
    
}
}
