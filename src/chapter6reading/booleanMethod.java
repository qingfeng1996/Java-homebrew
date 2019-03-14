package chapter6reading;

public class booleanMethod {
    public static void main(String[] args) {
        System.out.println(isSingleDigit(7));
    }
    public static boolean isSingleDigit(int x){
        return (x > -10 && x < 10);
        /*if (x > -10 && x < 10){
            return true;
        }
        else{
            return false;*/
        }
    }

