//1. Susikurkite `Uzduotis5.java` failą (klasę) ir tame faile susikurkite `main` funkciją
//2. Tame faile, susikurkite papildomą funkciją, kuri gauna 1 realųjį skaičių per parametrus: `x`.
// Funkcija turėtų grąžinti šio skaičiaus modulį. Modulis, tai visada teigiama reiškmė, t.y., jeigu `x = 50`,
// tai turėtų grąžinti `50`, jeigu `x = -40`, tai turėtų grąžinti `40`. NEGALIMA NAUDOTI `Math` klasės funkcijų.
//3. Panaudokite šią papildomą funkciją `main` dalyje su duomenimis `x = -27.327`
//4. Panaudokite šią papildomą funkciją `main` dalyje su duomenimis `x = 258`
//5. Panaudokite šią papildomą funkciją `main` dalyje su duomenimis `x = -147.25`
//6. Panaudokite šią papildomą funkciją `main` dalyje su duomenimis `x = 154.20`
public class Uzduotis5 {
    public static void main(String[] args) {
        System.out.println(modulis(-27.327));
        System.out.println(modulis(258));
        System.out.println(modulis(-147.25));
        System.out.println(modulis(154.20));
    }

    public static double modulis(double a) {
        if (a < 0) {
            a *= -1;
        }
        return a;
    }
}
