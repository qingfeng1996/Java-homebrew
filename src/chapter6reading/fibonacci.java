package chapter6reading;

public class fibonacci {
    public static void main(String[] args) {

    }
    public static int fibonacci(int x){
        if(x == 1 || x == 2){
            return 1;
        }
        else{
            return fibonacci(x-1) + fibonacci(x-2);
        }
    }
}
