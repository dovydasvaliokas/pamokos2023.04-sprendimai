//1. Susikurkite `Uzduotis2.java` failą (klasę) ir tame faile susikurkite `main` funkciją
//2. Tame faile, susikurkite papildomą funkciją, kuri gauna 2 realiųjų skaičių parametrus: `islaidos`, `pajamos`.
// Funkcija turėtų patikrinti ar pagal reikalingas išlaidas ir iš to gaunamas pajamas, verslas yra pelningas ar ne.
// Jeigu verslas yra pelningas, tada grąžina `true`, jeigu nesidalina iš abiejų, tada grąžina `false`.
//3. Panaudokite šią papildomą funkciją `main` dalyje su duomenimis `islaidos = 1679.25`, `pajamos = 2631.25`
//4. Panaudokite šią papildomą funkciją `main` dalyje su duomenimis `islaidos = 2300.25`, `pajamos = 2300.25`
//5. Panaudokite šią papildomą funkciją `main` dalyje su duomenimis `islaidos = 1325.25`, `pajamos = 1131.25`
public class Uzduotis2 {
    // 1 punktas
    public static void main(String[] args) {
        // 3 - 5 punktas
        System.out.println(arPelninga(1679.25, 2631.25));
        System.out.println(arPelninga(2300.25, 2300.25));
        System.out.println(arPelninga(1325.25, 1131.25));
    }

    public static boolean arPelninga(double islaidos, double pajamos) {
        return pajamos > islaidos;
    }
}
