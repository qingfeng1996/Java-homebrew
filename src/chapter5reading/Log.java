package chapter5reading;
import java.util.Scanner;
public class Log {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        scanDouble(in);


    }
    public static void printLog(double x){
        if (x <= 0) {
            System.err.println("invalid, x must be larger than 0");
        }
        double result = Math.log(x);
        System.out.printf("the log of x is %.2f" ,result);
    }
    public static void scanDouble(Scanner in){
        System.out.println("what the number");
        if(!in.hasNextDouble()){
            String word = in.next();
            System.err.println(word + " is not a number");
            return;

        }
        double x = in.nextDouble();
        printLog(x);
    }

    }