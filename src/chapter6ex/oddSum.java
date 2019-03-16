package chapter6ex;

public class oddSum {
    public static void main(String[] args) {
        System.out.println(oddSum(10));
    }
    public static int oddSum(int x){
        if(x == 1)
            return 1;

        else if(x % 2 != 0)
            {return  x + oddSum(x-2);}
            else{
                return (x-1) + oddSum(x-3);
        }


    }
}
