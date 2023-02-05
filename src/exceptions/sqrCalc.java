package exceptions;

import java.util.Scanner;

public class sqrCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double d = 0;
        System.out.println("Podaj liczbe: ");

        try {
            d = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Błąd, Podana wartość nie jest liczbą");
            System.exit(-1);
        } finally {
            System.out.println("Koniec");
        }

        if (d < 0) {
            throw new IllegalArgumentException();
        }
        System.out.println(Math.sqrt(d));
    }
}
