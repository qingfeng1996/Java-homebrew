package chapter6ex;

public class isDivisible {
    public static void main(String[] args) {
        System.out.println(isDivisible(2,2));
    }
    public static boolean isDivisible (double x,double y){
        if (x % y == 0 || y % x == 0){
            return true;
        }else return false;
    }
}
