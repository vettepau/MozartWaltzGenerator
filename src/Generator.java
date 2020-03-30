public class Generator {
    public static void main(String[] args) {

        // An example of how to play M1

        for(int i = 1; i <= 172; i++) {
            double[] sample = StdAudio.read("mozart/M"+i+".wav");
            StdAudio.play(sample);
        }

    }
}
