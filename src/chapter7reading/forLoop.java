package chapter7reading;

public class forLoop {
    public static void main(String[] args) {
        printTable(9);
    }
    public static void printTable(int rows){
        for(int i = 1;i <= rows; i = i + 1){
            printRow(i,rows);
        }
    }
    public static void printRow(int n,int cols){
        int i = 1;
        while(i <= cols){
            System.out.printf("%4d", n*i );
            i = i + 1;
        }
        System.out.println();
    }
}
