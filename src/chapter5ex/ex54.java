package chapter5ex;

public class ex54 {
    public static void main(String[] args) {

    }
    public static void checkFermat(int a,int b,int c,int n){
        if ((n > 2) && (Math.pow(a,n) +Math.pow(b,n) == Math.pow(c,n))){
            System.out.println("Holy smoke,Fermat was wrong");
        }else{
            System.out.println("No thanks doesn't work");
        }

    }
}
