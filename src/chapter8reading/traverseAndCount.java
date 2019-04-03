package chapter8reading;
import java.util.Random;

public class traverseAndCount {
    public static void main(String[] args) {
        // random array of size socres
        int [] scores = randomArray(30);
        // counting the number of scores within the range.
        int a = count(90,100,scores);
        int b = count(80,90,scores);
        int c = count(70,80,scores);
        int d = count(60,70,scores);
        int e = count(0,60,scores);
        System.out.println(b);

    }
    public static int[] randomArray(int size){
        Random random = new Random();
        int [] david = new int [size];
        for (int i = 0;i<david.length;i++){
            david[i] = random.nextInt(99);

        }
        return david;
    }
    public static int count(int low,int high,int[] array){
        int i = 0;
        int c = 0;
        for(i = 0; i < array.length;i++){
            if(array[i] >= low && array[i] < high){
                c ++;
            }
        }

    return c;}

    public static int[] myHistogram(int size){
        int [] histogram = new int[size];
        int i = 0;
        int [] scores = randomArray(30);
        for (i = 0; i < histogram.length;i++){
            histogram[i] = count(i,i+1,scores);
        }
    return  histogram;}




}
