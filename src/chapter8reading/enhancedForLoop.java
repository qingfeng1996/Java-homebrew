package chapter8reading;

public class enhancedForLoop {
    public static void main(String[] args) {
        int [] values = {1,2,3,4,5};
       /*for(int i = 0; i < values.length;i++){
            int value = values[i];
            value ++;
            System.out.println(value);
        }*/
        //enchanced for loop
        for(int value : values){
            value ++;
            System.out.println(value);}
    }

}
