package pk;

public class Player {
    public int totalpoints = 0;
    public int totalscore = 0;
    public int totalsk = 0;
    public int wins;
    public String name;
    public boolean skcheck = false;
    public boolean skullcheck(boolean skcheck){
        if (skcheck == true){
        System.out.println("Three skulls have been rolled");
        return true;
    } else {
        return false;}
    }
}
