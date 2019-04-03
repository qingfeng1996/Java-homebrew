package chapter8reading;

import java.lang.reflect.Array;
import java.util.Arrays;
public class array_traversal {
    public static void main(String[] args) {
        // initialize a array with 8 elems
        double[] tony = new double[8];

        // assigning values by for loop
        int i = 0;
        int e = 0;
        for (i = 0;i < tony.length;i++){
            tony[i] = e;
            e ++;
        }
        //System.out.println(Arrays.toString(tony));
        //square all elems in the array tony
        for(i = 0;i < tony.length;i++){
            tony[i] = Math.pow(tony[i],2);

    }
        double [] david = {1,2,3,4,5};
        //System.out.println(Arrays.toString(tony));
        //System.out.println(search(david,4));
        System.out.println(reduce(david));

    }

    public static int search(double [] array,double target){
        int i = 0;
        for (i = 0;i < array.length;i++) {
            if (array[i] == target){
                return i;
            }

        }
        return -1;
    }
    public static double reduce(double [] array){
        int i = 0;
        int a = 0;
        for (i = 0;i<array.length;i++)
            a += array[i];


    return a;}
}