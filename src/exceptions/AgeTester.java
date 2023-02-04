package exceptions;

public class AgeTester {
    public static void main(String[] args) {
        try {
            checkAge(32);
        } catch (AgeRangeException e) {
            System.out.println("Problem: "  );;
        }
    }

    public static void checkAge(int age) {
        if (age < 18) {
            throw new AgeRangeException("Uwaga! osoba niepełnoletnia");

        }else
            System.out.println("Dostęp przyznany");
    }
}
