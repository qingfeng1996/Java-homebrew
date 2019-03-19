package chapter7reading;

public class encapsulation {
    public static void main(String[] args) {
       printTable(7);
    }
    public static void printRow(int n,int cols){
        int i = 1;
        while (i <= cols){
            System.out.printf("%4d",n*i);
            i = i + 1;
        }
        System.out.println();
    }
    public static void printTable(int row){
        int i = 1;
        while( i <= row){
            printRow(i,row);
            i = i + 1;
        }
        System.out.println();
    }




}