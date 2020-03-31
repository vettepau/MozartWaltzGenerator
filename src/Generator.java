import java.util.Random;

public class Generator {
    public static void main(String[] args) {
        Operator yeet = new Operator();
        int[][] Minuet;
        int[][] Trio;
        // An example of how to play M1

        for(int i = 1; i <= 172; i++) {
            double[] sample = StdAudio.read("mozart/M"+i+".wav");
            StdAudio.play(sample);
            System.out.println(yeet.roll());
            System.out.println(yeet.doubleRoll());
        }

    }
}
