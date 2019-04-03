package chapter8reading;
import java.util.Arrays;
public class array {


    public static void main(String[] args) {
        // initialize the array
        int[] counts = new int[4];
        double[] values = new double[8];
        int [] a = {1,2,3,4,5};
        // copy the array
        int [] b = Arrays.copyOf(a,3);
        // assign value to the array "counts"
        counts[0] = 1;
        counts[1] = 2;
        counts[2] = 3;
        counts[3] = 4;
        // print the each elem by looping through the array
        for(int i = 0; i < 4;i++)
            System.out.println(counts[i]);

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));


    }
}
