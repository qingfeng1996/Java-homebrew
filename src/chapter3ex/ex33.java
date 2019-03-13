package chapter3ex;
import java.util.Scanner;
import jdk.swing.interop.SwingInterOpUtils;

public class ex33 {
    public static void main(String[] args) {
        int second;
        int minute;
        int hour;
        int remainder;
        final int NO_OF_MINUTE_IN_ONE_HOUR = 60;
        final int NO_OF_SECOND_IN_ONE_MINUTE = 60;
        System.out.println("How many seconds?");
        Scanner in = new Scanner(System.in);
        second = in.nextInt();
        minute = (second / NO_OF_SECOND_IN_ONE_MINUTE);
        hour = minute / NO_OF_MINUTE_IN_ONE_HOUR ;
        remainder = second - minute * NO_OF_MINUTE_IN_ONE_HOUR;
        //System.out.printf("%d second(s) = %d hours, %d minutes ,%d seconds", second,hour,minute,remainder);
        System.out.printf("%d second = %d hours, %d minutes ,%d seconds",second,hour,minute,remainder);



    }
}
