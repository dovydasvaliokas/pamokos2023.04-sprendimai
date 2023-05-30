//1. Susikurkite `Uzduotis3.java` failą (klasę) ir tame faile susikurkite `main` funkciją
//2. Tame faile, susikurkite papildomą funkciją, kuri gauna 3 realiųjų skaičių parametrus, trikampio kraštines: `a`, `b`, `c`.
// Funkcija turėtų patikrinti ar pagal kraštinių ilgius iš jų galima sudaryti trikampį. Jeigu verslas yra pelningas,
// tada grąžina `true`, jeigu nesidalina iš abiejų, tada grąžina `false`.
//3. Panaudokite šią papildomą funkciją `main` dalyje su duomenimis `a = 25`, `b = 14`, `c = 10`
//4. Panaudokite šią papildomą funkciją `main` dalyje su duomenimis `a = 1`, `b = 1`, `c = 1`
//5. Panaudokite šią papildomą funkciją `main` dalyje su duomenimis `a = 12`, `b = 5`, `c = 7`
//6. Panaudokite šią papildomą funkciją `main` dalyje su duomenimis `a = 123.451`, `b = 146.541`, `c = 100.2257`
public class Uzduotis3 {
    // 1 punktas
    public static void main(String[] args) {
        System.out.println(arGalimaSudarytiTrikampi(25, 14, 10));
        System.out.println(arGalimaSudarytiTrikampi(1, 1, 1));
        System.out.println(arGalimaSudarytiTrikampi(12, 5, 7));
        System.out.println(arGalimaSudarytiTrikampi(123.451, 146.541, 100.2257));
    }

    // 2 punktas
    public static boolean arGalimaSudarytiTrikampi(double a, double b, double c) {
        return a + b > c && b + c > a && a + c > b;
    }
}
