package chapter6ex;

public class isTriangle {
    public static void main(String[] args) {
        System.out.println(isTriangle(2,4,6));
    }
    public static boolean isTriangle (double x,double y,double z){
        if(x+y <= z || y+z <= x || x+z <= y){
            return true;
        }else return false;
    }
}
