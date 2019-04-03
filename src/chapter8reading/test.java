package chapter8reading;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int [] scores = myRandom.randomArray(10);
        // randomArray randomly picks number among 0-99,hence the size of array must be >99.
        int [] counts =new int [100];
        for (int i = 0; i < scores.length;i++){
            int index = scores[i];
            // the original array "counts" are filled up with zero
            // thats why we can add 1 to each position of the array
            counts[index]++;
        }
        System.out.println(Arrays.toString(counts));
        System.out.println(counts.length);
    }
}
