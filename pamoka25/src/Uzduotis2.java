import java.util.Scanner;

// Sukurkite programą, kuri nuskaito stačiakampio ilgį ir plotį,
// apskaičiuoja stačiakampio plotą, perimetrą ir išveda į konsolę. Taip pat padarykite,
// jog po jų išvestų žodžiais, kuris yra didesnis plotas  ar perimetras į konsolę.
public class Uzduotis2 {
    public static void main(String[] args) {
        Scanner skait = new Scanner(System.in);
        System.out.println("Įveskite stačiakampio ilgį:");
        double ilgis = skait.nextDouble();
        System.out.println("Įveskite stačiakampio plotį:");
        double plotis = skait.nextDouble();
        if (!arTeisingiDuomenys(ilgis, plotis)) {
            System.out.println("Ilgis ir plotis negali būti neigiami. Bandykit per naujo");
            return;
        }
        System.out.println("plotas(ilgis, plotis) = " + plotas(ilgis, plotis));
        System.out.println("perimetras(ilgis, plotis) = " + perimetras(ilgis, plotis));
        kurisDidesnis(ilgis, plotis);
    }

    public static boolean arTeisingiDuomenys(double a, double b) {
        return a > 0 && b > 0;
    }
    public static double plotas(double a, double b) {
        return a * b;
    }

    public static double perimetras(double a, double b) {
        return 2 * (a + b);
    }

    public static void kurisDidesnis(double a, double b) {
        if (plotas(a, b) > perimetras(a, b)) {
            System.out.println("Plotas yra didesnis už perimetrą");
        }
        else {
            System.out.println("Perimetras yra didesnis už plotą");
        }
    }
}
