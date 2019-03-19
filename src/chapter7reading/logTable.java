package chapter7reading;

public class logTable {
    public static void main(String[] args) {
        logTable(10);
    }
    public static void logTable(int n){
        while(n>0){
            System.out.printf("the log of " + n + " is %.2f\n" ,Math.log(n));
            n = n -1;
        }
        System.out.println(" here is your log table");

    }
}
