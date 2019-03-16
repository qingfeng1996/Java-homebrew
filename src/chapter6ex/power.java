package chapter6ex;

public class power {
    public static void main(String[] args) {
        System.out.println(pow(0,3));
    }
    public static double pow(int n,int m){
        if (n == 0){
            return 1;
        }
        else{
            return m * pow(n-1,m);
        }
    }
}
