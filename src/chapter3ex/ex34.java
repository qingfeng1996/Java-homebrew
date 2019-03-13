package chapter3ex;
import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Random;
import java.util.Scanner;

public class ex34 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        guessmachine(random,in);

    }
    public static void guessmachine(Random random,Scanner guess){
        random = new Random();
        int x = random.nextInt(99) + 1;


        System.out.println("I am thinking a number between 1 and 100");
        System.out.println("including both,Can you guess what is that?");
        System.out.println("Type a number");
        int n = guess.nextInt();
        int off = Math.abs(x - n);
        System.out.println("Your guess is " + n);
        if (x != n){
            if(x>n){
                System.out.println("your guess is too small,off by " + off);
                guessmachine(random,guess);
            }else{
                System.out.println("your guess is too big,off by " + off);
                guessmachine(random,guess);
            }
        }else{
            System.out.println("congrats,you win");
        }

    }
}