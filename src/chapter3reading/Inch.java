package chapter3reading;
import java.sql.SQLOutput;
import java.util.Scanner;


public class Inch {
    public static void main(String[] args) {
        final double CM_PER_INCH = 2.54;
        double cm; // convert inch to cm
        Scanner in = new Scanner(System.in);
        System.out.println("How many inches? ");
        int inch = in.nextInt();

        cm = inch * CM_PER_INCH;
        System.out.print(inch + " inch = ");
        System.out.println(cm + " cm");
        Scanner in1 = new Scanner(System.in); // starting convert cm to inch
        System.out.println("How many cm? ");
        double cm1 = in1.nextDouble();
        double inch1 = (cm1 / CM_PER_INCH);
        System.out.printf("%.2f cm = %.2f inch ",cm1,inch1);
    }
}
