//1. Susikurkite `Uzduotis4.java` failą (klasę) ir tame faile susikurkite `main` funkciją
//2. Tame faile, susikurkite papildomą funkciją, kuri gauna 4 realiųjų skaičių parametrus,
// keturkampio kraštines: `a`, `b`, `c`, `d` Funkcija turėtų patikrinti ar su šiom kraštinėm gali būti kvadratas.
// Grąžina `true`, jeigu kvadratas, `false` jeigu ne.
//3. Panaudokite šią papildomą funkciją `main` dalyje su duomenimis `a = 12.5`, `b = 12.5`, `c = 12.5`, `d = 12.5`
//4. Panaudokite šią papildomą funkciją `main` dalyje su duomenimis `a = 1`, `b = 1`, `c = 1`, `d = 1`
//5. Panaudokite su `a = 13.4`, `b = 13.4`, `c = 13.34`, `d = 13.24`
public class Uzduotis4 {
    public static void main(String[] args) {
        System.out.println(arKvadratas(12.5, 12.5, 12.5, 12.5));
        System.out.println(arKvadratas(1, 1, 1, 1));
        System.out.println(arKvadratas(13.4, 13.4, 13.34, 13.24));
    }

    public static boolean arKvadratas(double a, double b, double c, double d) {
        return a == b && a == c && a == d;
    }
}
