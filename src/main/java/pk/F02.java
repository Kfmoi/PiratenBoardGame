package pk;


public class F02 {



    public static Faces firstroll(){
        Faces results = null;
        Dice myDice = new Dice();
        for(int j =0; j<8; j++){
            System.out.println("I'm rolling a dice");
            results = myDice.roll();
            
    }
    return results;
}
}