import java.util.Random;

public class Operator {
    Operator(){

    }

    public int roll(){
        Random rand = new Random();
        return rand.nextInt(6);
    }

    public int doubleRoll(){
        Random rand = new Random();
        return rand.nextInt(11);
    }
}
