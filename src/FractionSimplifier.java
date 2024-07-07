import java.util.Scanner;

public class FractionSimplifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Payı girin: ");
        int numerator = scanner.nextInt();

        System.out.print("Paydayı girin: ");
        int denominator = scanner.nextInt();

        if (denominator == 0) {
            System.out.println("Payda 0 olamaz.");
        } else {
            int gcd = findGCD(numerator, denominator);
            numerator /= gcd;
            denominator /= gcd;
            System.out.println("Sadeleştirilmiş kesir: " + numerator + "/" + denominator);
        }
    }

    // İki sayının EBOB'unu bulmak için öklid algoritması
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }
}
