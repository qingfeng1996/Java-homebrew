package chapter5reading;

import java.util.Scanner;

public class BinaryConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        console(in);
    }
    public static void cal(int x) {
        if( x <= 1){
            System.out.println(1);
        }
        else{
            System.out.println(x % 2);
            cal(x / 2);
        }
    }
    public static void console(Scanner in){
        System.out.println("what the number in decimal ?");
        int x = in.nextInt();
        cal(x);
    }




}

