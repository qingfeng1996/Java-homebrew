package chapter8reading;
import java.util.Random;
import java.util.Arrays;

public class myRandom {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(randomArray(8)));

    }
    public static int[] randomArray(int size){

        Random random = new Random();
        int [] a = new int[size];
        for(int i = 0;i< a.length;i++){
            a[i] = random.nextInt(100);
        }
    return a;}
}
