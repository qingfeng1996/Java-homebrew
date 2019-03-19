package chapter7ex;

public class power {
    public static void main(String[] args) {
        System.out.println(pow(2,4));
    }
    /*public static double pow(double x,int n){
        if (n == 0){return 1;}
        if (n == 1){return x;}

        int i = 2;
        do{ x = x * x;
            i = i + 1;


        }while(i<n);
        return x;
    }*/

    public static double pow(double n,int x){
        int i = 0;
        double result = 1;
        do{result = result * n;
            i ++;

        }while(i < x);
        return result;
    }

}
