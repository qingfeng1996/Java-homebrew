package chapter7reading;

public class newCountDown {
    public static void main(String[] args) {
        countDown(9);
    }
    public static void countDown(int n){
        while(n > 0){
            System.out.println(n);
            n = n - 1;

        }
        System.out.println("boom");
    }

}
