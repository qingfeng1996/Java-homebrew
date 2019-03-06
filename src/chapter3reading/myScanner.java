package chapter3reading;
import java.util.Scanner;

public class myScanner {
    public static void main(String[] args) {
        String line;
        Scanner in = new Scanner(System.in);

        System.out.println("Type something: ");
        line = in.nextLine();
        System.out.println("You said " + line );


    }
}
