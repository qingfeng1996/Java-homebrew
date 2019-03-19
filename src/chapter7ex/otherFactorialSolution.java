package chapter7ex;

public class otherFactorialSolution {
    public static void main(String[] args) {
        System.out.println(fac(4));
    }
    public static int fac(int n){
        int result = 1;
        for(int i=1; i < n;i++){
            result = result * i;
        }
        return result;
    }
}
