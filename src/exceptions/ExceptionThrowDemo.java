package exceptions;

public class ExceptionThrowDemo {
    public static void main(String[] args) {

        ExceptionThrowDemo etd = new ExceptionThrowDemo();
        int numberOfSeconds = 0;
        numberOfSeconds = etd.getNumberOfSeconds(34);
        System.out.println(numberOfSeconds);


    }
    public int getNumberOfSeconds(int hours) {
        if (hours < 0) {
            throw new IllegalArgumentException("Liczba godzin musi być wieksza od  zero " + hours);
        }
        return hours + 60 * 60;
    }


}
