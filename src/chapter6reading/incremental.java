package chapter6reading;

public class incremental {
    public static void main(String[] args) {
        double x = distance(1.0,2.0,3.0,4.0);
        System.out.println(x);
    }
    public static double distance(double x1,double y1, double x2,double y2){
        double dx = Math.abs(x1-x2);
        double dy = Math.abs(y1-y2);
        double sqrt = dx*dx + dy*dy;
        double distance = Math.sqrt(sqrt);
        return distance;
    }

}
