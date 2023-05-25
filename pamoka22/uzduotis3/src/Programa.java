//Užduotis 3
// 1 Susikurkite Java projektą, susikurkite Programa.java failą (class), tame faile susikurkite main funkciją.
// 2 Susikurkite papildomą funkciją, kuri apskaičiuoja keturkampio namo perimetrą. Namas nėra lygių sienų (visos keturios skirtingos sienos/kraštinės). Ilgiai sienų gali būti realūs skaičiai (skaičiai su kableliu)
// 3 Panaudokite tą funkciją, jog apskaičiuotumėte perimetrą namo su 17.35, 18, 20.47 ir 16.37 sienomis
// 4 Panaudokite tą funkciją, jog apskaičiuotumėte perimetrą namo su 2, 4, 2 ir 4.1 sienomis
public class Programa {
    // 1 punktas
    public static void main(String[] args) {
        // 3 punktas
        double a1 = 17.35;
        double b1 = 18;
        double c1 = 20.47;
        double d1 = 16.37;
        double rezultatas1 = keturkampioPerimetras(a1, b1, c1, d1);
        System.out.println("rezultatas1 = " + rezultatas1);

        // 4 punktas
        double a2 = 2;
        double b2 = 4;
        double c2 = 2;
        double d2 = 4.1;
        double rezultatas2 = keturkampioPerimetras(a2, b2, c2, d2);
        System.out.println("rezultatas2 = " + rezultatas2);
    }

    // 2 punktas
    public static double keturkampioPerimetras(double a, double b, double c, double d) {
        return a + b + c + d;
    }
}
