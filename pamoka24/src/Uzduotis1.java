//1. Susikurkite `Uzduotis1.java` failą (klasę) ir tame faile susikurkite `main` funkciją
//2. Tame faile, susikurkite papildomą funkciją, kuri gauna 3 sveikųjų skaičių parametrus: `skaicius`, `daliklis1`, `daliklis2`.
// Funkcija turėtų patikrinti ar `skaicius` dalinasi be liekanos iš abiejų daliklių. Jeigu dalinasi, tada grąžina `true`,
// jeigu nesidalina iš abiejų, tada grąžina `false`.
//3. Panaudokite šią papildomą funkciją `main` dalyje su duomenimis `skaicius = 25`, `daliklis1 = 6`, `daliklis2 = 5`
//4. Panaudokite šią papildomą funkciją `main` dalyje su duomenimis `skaicius = -100`, `daliklis1 = 10`, `daliklis2 = -20`
//5. Panaudokite šią papildomą funkciją `main` dalyje su duomenimis `skaicius = 140`, `daliklis1 = 7`, `daliklis2 = 2`
//6. Panaudokite šią papildomą funkciją `main` dalyje su duomenimis `skaicius = 12`, `daliklis1 = 4`, `daliklis2 = 5`
public class Uzduotis1 {
    // 1 punktas
    public static void main(String[] args) {
        // 3 - 6 punktai
        System.out.println(arDalinasiIsAbieju(25, 6, 5));
        System.out.println(arDalinasiIsAbieju(-100, 10, -20));
        System.out.println(arDalinasiIsAbieju(140, 7, 2));
        System.out.println(arDalinasiIsAbieju(12, 4, 5));
    }

    // 2 punktas
    public static boolean arDalinasiIsAbieju(int skaicius, int daliiklis1, int daliklis2) {
        return skaicius % daliiklis1 == 0 && skaicius % daliklis2 == 0;
    }
}
