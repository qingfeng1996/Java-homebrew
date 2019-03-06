public class Time {
    public static void main(String[] args) {
        int hour = 19;
        int minute = 38;
        int second = 20;
        double noOfSecond = hour * 3600.0 + minute * 60.0 + second;
        double day = 24 * 3600.0;
        double percentage = noOfSecond / day;


        System.out.println("number of seconds since midnight is" + " " + noOfSecond);
        System.out.println("the percentage of the day has passed" + " " + percentage * 100 + "%");

    }
}
