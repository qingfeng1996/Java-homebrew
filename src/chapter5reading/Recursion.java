package chapter5reading;

public class Recursion {
    public static void main(String[] args) {
        countDown(5);
        nLine(5);
    }
    public static void countDown(int n){
        if (n == 0){
            System.out.println("boom!");

        }
        else{
            System.out.println(n);
            countDown(n -1);
        }
    }
    public static void nLine(int n){
        if (n > 0){
            System.out.println();
            nLine(n-1);
        }
    }

}
