import java.util.Random;

public class Generator {
    public static void main(String[] args) {
        Operator yeet = new Operator();
        int[][] Minuet = {}, {}, {}, {}, {148,74,163,45,80,97,36,107,25,143,64,125,76,136,1,93}, {104,157,27,167,154,68,118,91,138,71,150,29,101,162,23,151}, {152,60,171,53,99,133,21,127,16,155,57,175,43,168,89,172}, {119,84,114,50,140,86,169,94,120,88,48,166,51,115,72,111}, {98,142,42,156,75,129,62,123,65,77,19,82,137,38,149,8}, {3,87,165,61,135,47,147,33,102,4,31,164,144,59,173,78}, {54,130,10,103,28,37,106,5,35,20,108,92,12,124,44,131};
        int[][] Trio = {}, {}, {}, {}, {}, {};

        int wav = -1;
        for(int i = 0; i < 16; i++) {
            wav = Minuet[yeet.doubleRoll()][i];
            double[] sample = StdAudio.read("mozart/M"+wav+".wav");
            StdAudio.play(sample);
        }

        for(int i = 0; i < 16; i++) {
            wav = Trio[yeet.roll()][i];
            double[] sample = StdAudio.read("mozart/M"+wav+".wav");
            StdAudio.play(sample);
        }

    }
}
