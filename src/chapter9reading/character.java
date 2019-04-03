package chapter9reading;

public class character {
    public static void main(String[] args) {
        String fruit = "banana";
        char letter = fruit.charAt(0);
        System.out.println(letter);
        // char can work with relational
        System.out.println('l' < 'a');
        System.out.println("Roman alphabet");
        // increment and decrement with char
        for (char c = 'A';c <= 'Z';c++){
            System.out.println(c);
        }
        // displaying greek alphabets.
        for(int i = 913; i<= 937; i++){
            System.out.println((char)i);
        }
    }
}
