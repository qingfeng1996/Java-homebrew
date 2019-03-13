package chapter5ex;

public class ex55 {public static void main(String[] args) {
    song(3);
}
    public static void song(int bottle){
        if (bottle == 0){
            System.out.println("No bottle of beer on the wall\nno bottle of beer\nya cant take one down,ya cant pass it around\ncasue there are no more bottles of beer on the wall");

        }else {

            System.out.println( bottle + " bottles of beer on the wall");
            System.out.println( bottle + " bottles of beer");
            System.out.println("ya take one down,ya pass it around\n");
            song(bottle-1);
        }


    }
}
