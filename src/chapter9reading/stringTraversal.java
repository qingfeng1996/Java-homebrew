package chapter9reading;

public class stringTraversal {
    public static void main(String[] args) {
        String fruit = "banana";
        for (int i = 0;i < fruit.length();i++){
            char letter = fruit.charAt(i);
            System.out.println(letter);
        }

        // enhanced for loop with string
        for(char letter : fruit.toCharArray()){
            System.out.println(letter);
        }

        //test reverse
        System.out.println(reverse("fruit"));



    }
    public static String reverse(String s){
        String r = "";
        for (int i =s.length()-1;i >= 0;i--){
            r = r + s.charAt(i);
        }
        return r;

    }
}
