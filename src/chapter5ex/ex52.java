package chapter5ex;

public class ex52 {
    public static void main(String[] args) {
        int buzz = 5;
        int bizz = 2;
        zoop("just for",bizz);
        clink(2 * buzz);
    }
    public static void clink(int fork){
        System.out.println("it's ");
        zoop("breakfast ", fork);
    }
    public static void zoop(String fred,int bob){
        System.out.println(fred);
        if (bob == 5){
            ping("not");

        }else{
            System.out.println("!");
        }
    }
    public static void ping(String strangStrung){
        System.out.println("any" + strangStrung + "more");
    }
}
