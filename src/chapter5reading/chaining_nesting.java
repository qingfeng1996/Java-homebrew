package chapter5reading;

public class chaining_nesting {
    public static void main(String[] args) {
        int x = 6;
        if(x < 0) {
            System.out.println("x is negative");
        }
        else if (x > 0) {
            System.out.println(" x is positive");

        }
        else{
            System.out.println("x is zero");
        }
    }
    int n = 4;
    int x = 6;

    boolean evenFlag = (n % 2 == 0);
    boolean postiveFlag = (x > 0);

}
