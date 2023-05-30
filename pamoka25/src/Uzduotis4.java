import java.util.Scanner;

//Sukurkite programą, kuri nuskaito skaičių iš konsolės, tada nuskaito procentus iš konsolės.
// Apskaičiuoja skaičių pakeltą procentine dalimi ir išveda rezultatą į konsolę.
public class Uzduotis4 {
    public static void main(String[] args) {
        Scanner skait = new Scanner(System.in);
        System.out.println("Įveskite skaičių, kurį norite keisti procentine dalimi");
        double skaicius = skait.nextDouble();
        System.out.println("Įveskite procentuis kiek didinti (teigiamą) arba mažinti (neigiamą)");
        double procentas = skait.nextDouble();
        System.out.println("Pakeistas skaičius: " + pakeltiProcentais(skaicius, procentas));
    }

    public static double pakeltiProcentais(double x, double p) {
        return x + x * p / 100;
    }
}
