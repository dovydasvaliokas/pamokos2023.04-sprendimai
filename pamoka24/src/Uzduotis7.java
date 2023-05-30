//Sukurkite funkciją, kuri patikrina kiek dienų turi mėnesis. Funkcija turėtų gauti metus ir mėnesioSkaičius per parametrus.
public class Uzduotis7 {
    public static void main(String[] args) {
        System.out.println(kiekDienuMenesyje(2004, 2));
        System.out.println(kiekDienuMenesyje(2005, 2));
        System.out.println(kiekDienuMenesyje(2012, 7));
        System.out.println(kiekDienuMenesyje(2012, 8));
        System.out.println(kiekDienuMenesyje(2012, 11));
    }

    public static boolean arKeliamieji(int metai) {
        return metai >= 1582 && metai % 4 == 0 && (metai % 100 > 0 || metai % 400 == 0);
    }

    public static int kiekDienuMenesyje(int metai, int menesis) {
        switch (menesis) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (arKeliamieji(metai)) {
                    return 29;
                }
                else {
                    return 28;
                }
            default:
                return -1;
        }
    }
}
