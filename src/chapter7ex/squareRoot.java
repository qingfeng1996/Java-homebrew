package chapter7ex;
import java.util.Scanner;

public class squareRoot {
    public static void main(String[] args) {
        System.out.println(squareRoot(16));
    }
    public static double squareRoot(double a){
        System.out.println("type a guess about the sqrt " + a);
        Scanner in = new Scanner(System.in);
        double oldValue = in.nextDouble();
        double newValue = (oldValue + a / oldValue);
        double interval = Math.abs(oldValue - newValue);
        do{
            oldValue = newValue;
            newValue = (oldValue + a/oldValue)/2;
            interval = Math.abs(newValue - oldValue);
            //System.out.println(newValue);
        }while(interval > 0.001);
        return newValue;
        //System.out.println("the estimate of sqrt of " + a + " is "+ newValue);
    }
    }


