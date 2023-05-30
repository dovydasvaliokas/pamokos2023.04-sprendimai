import java.util.Scanner;

//Sukurkite programą, kuri nuskaito tris trikampio kraštines, apskaičiuoja trikampio perimetrą,
// apskaičiuoja trikampio plotą, patikrina ar trikampis yra statusis/lygiašonis/lygiakraštis/paprastas
// ir visa tai išveda į konsolę.
public class Uzduotis3 {
    public static void main(String[] args) {
        Scanner skait = new Scanner(System.in);
        System.out.println("Įveskite pirmą trikampio kraštinę:");
        double a = skait.nextDouble();
        System.out.println("Įveskite antrą trikampio kraštinę:");
        double b = skait.nextDouble();
        System.out.println("Įveskite trečią trikampio kraštinę:");
        double c = skait.nextDouble();
        if (!arGaliButiTrikampis(a, b, c)) {
            System.out.println("Negalima sudaryti trikampio su tokiomis kraštinėmis");
            return;
        }
        System.out.println("perimetras(a, b, c) = " + perimetras(a, b, c));
        System.out.println("plotas(a, b, c) = " + plotas(a, b, c));
        System.out.println("koksTrikampis(a, b , c) = " + koksTrikampis(a, b, c));
        System.out.println("arStatus(a, b, c) = " + arStatus(a, b, c));


    }

    public static boolean arGaliButiTrikampis(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a && a > 0 && b > 0 && c > 0;
    }

    public static double perimetras(double a, double b, double c) {
        return a + b + c;
    }

    public static double plotas(double a, double b, double c) {
        double p = perimetras(a, b, c);
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static String koksTrikampis(double a, double b, double c) {
        if (a == b && a == c) {
            return "lygiakraštis";
        } else if (a == b || b == c || a == c) {
            return "lygiašonis";
        } else {
            return "paprastas (skirtingos kraštinės)";
        }
    }

    public static boolean arStatus(double a, double b, double c) {
        return a * a + b * b == c * c
                || a * a + c * c == b * b
                || b * b + c * c == a * a;
    }

}
