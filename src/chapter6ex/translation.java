package chapter6ex;

public class translation {
    public static void main(String[] args) {
        System.out.println(Acker(2,2));

    }
    public static int Acker(int m,int n){
        if (m == 0){
            return n + 1;
        }
        if ( m > 0 && n == 0){
            return Acker(m-1,1);
        }
        if (m > 0 && n > 0){
            return Acker(m-1,Acker(m,n-1));
        }
        else{
            return 233;
        }
    }
}
