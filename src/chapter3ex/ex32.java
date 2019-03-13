package chapter3ex;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class ex32 {
    public static void main(String[] args) {
        final double d1 = (1.8);
        final int i1 = 32;
        double F;
        double C;
        System.out.println("what the value of temperature in C?");
        Scanner in = new Scanner(System.in);
        C = in.nextDouble();
        F = C * d1 + i1;
        System.out.printf("%.1f C = %.1f F", C,F );

    }
}
