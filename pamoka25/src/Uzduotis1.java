import java.util.Scanner;

//Sukurkite programą, kuri nuskaito apskritimo spindulį iš konsolės,
// apskaičiuoja plotą, apskaičiuoja ilgį, apskaičiuoja diametrą ir juos visus išveda į konsolę kaip rezultatą.
public class Uzduotis1 {
    public static void main(String[] args) {
        Scanner skait = new Scanner(System.in);
        System.out.println("Įveskite r");
        double r = skait.nextDouble();
        if (!arGaliButiSpindulys(r)) {
            System.out.println("Neteisingas spindulys");
            return;
        }
        System.out.println("plotas(r) = " + plotas(r));
        System.out.println("ilgis(r) = " + ilgis(r));
        System.out.println("diametras(r) = " + diametras(r));
    }

    public static boolean arGaliButiSpindulys(double r) {
        return r > 0;
    }

    public static double plotas(double r) {
        return Math.PI * r * r;
    }

    public static double ilgis(double r) {
        return Math.PI * r * 2;
    }

    public static double diametras(double r) {
        return 2 * r;
    }
}
