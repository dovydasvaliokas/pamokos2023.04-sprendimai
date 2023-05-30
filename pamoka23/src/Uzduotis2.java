//  1. Susikurkite `Java` projektą, susikurkite `Uzduotis2.java` failą (class), tame faile susikurkite `main` funkciją.
//  2. Susikurti papildomą funkciją, kuri gauna du skaičius `x` ir `y`. Jeigu `x` yra lyginis skaičius,
//     tai tada `funkcija` grąžina `x * y`. Jeigu `x` yra nelyginis skaičius, tai tada funkcija grąžina `y - x`;
public class Uzduotis2 {
    // 1 punktas
    public static void main(String[] args) {
        System.out.println(skaiciuoti(8, 2));
        System.out.println(skaiciuoti(5, 2));
    }

    // 2 punktas
    public static int skaiciuoti(int x, int y) {
        if (x % 2 == 0) {
            return x * y;
        }
        else {
            return y - x;
        }
    }
}
