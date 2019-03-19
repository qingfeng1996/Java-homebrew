package chapter7reading;
import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean okay;
        do {
            System.out.println("Enter a name: ");
            if (in.hasNextDouble()) {
                okay = true;
            }else{
                okay = false;
                String word = in.next();
                System.err.print(word + "is not a number");
            }
        }while (!okay);
        double x = in.nextDouble();

    }
}