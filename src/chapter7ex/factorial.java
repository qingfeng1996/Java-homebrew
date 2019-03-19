package chapter7ex;

public class factorial {
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
    public static int factorial(int n){
        int i = 0;
        final int x = n;
        int result = 1;
        while (i < x){
            result = result * n;
            //System.out.println(result);
            n = n -1;
            //System.out.println(n);
            i = i + 1;
            //System.out.println(i);
        }
        return result;
    }
}
