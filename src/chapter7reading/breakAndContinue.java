package chapter7reading;
import java.util.Scanner;
public class breakAndContinue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.println("Enter a number ");
            if(in.hasNextDouble()){
                break;
            }
        }
        String word = in.next();
        System.err.println(word + " is not a number ");
        double x = in.nextDouble();

}}
