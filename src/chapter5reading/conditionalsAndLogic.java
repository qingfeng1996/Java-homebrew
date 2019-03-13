package chapter5reading;
import java.util.Scanner;
public class conditionalsAndLogic {
    public static void main(String[] args) {
        String fruit1 = "Apple";
        String fruit2 = "Orange";
        System.out.println(fruit1.equals(fruit2));

        Scanner in = new Scanner(System.in);

        System.out.println("what the number");
        int x = in.nextInt();


        if (x > 0) {
            System.out.println("x is positive");
        }

        if (x % 2 == 0) {
            System.out.println("x is even");
        }
        else {
            System.out.println("x is odd");
        }
    }


}
