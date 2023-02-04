package exceptions;

public class ExceptionTester {
    public static void main(String[] args) {
        int[] numbers = {1,2,3};

        System.out.println("Start");
        try {
            System.out.println("Nasz numer to: " + numbers[10/0]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Nie ma takiego indeksu");
        } catch (ArithmeticException e ) {
            //e.printStackTrace();
            System.out.println("Wystapił błąd w obliczeniach: " + e.getMessage());
        }




        System.out.println("Koniec");
    }
}
