package chapter6reading;

public class returnValue {
    public static void main(String[] args) {
        double result = area(6);
        System.out.printf("%.2f",result);;
    }
    public static double area(double radius){
        return Math.PI * radius * radius;

    }
    public static int abs(int x){
        if (x>0){
            return x;}
        else{return (-x);}



    }
}
