// 1. Tame pačiame projekte susikurkite naują failą (class) `Uzduotis3.java`, jame susikurkite `main` funkciją.
// 2. Susikurkite papildomą funkciją, kuri gauna du skaičius per parametrus, tarkim `x` ir `y`.
//    Funkcija grąžina `true`, jeigu `x` yra `y` kartotinis, `false`, jeigu ne. Pvz., jeigu `x = 20`, o `y = 5`,
//    tai funkcija turėtų grąžinti `true`, nes 20 dalinasi iš 5 be liekanos. Jeigu `x = 14`, o `y = 5`,
//    tai turėtų grąžinti `false`, nes 14 nesidalina iš 5 be liekanos
public class Uzduotis3 {
    // 1 punktas
    public static void main(String[] args) {
        System.out.println(arDalinasi(20, 5));
        System.out.println(arDalinasi(14, 5));
    }

    // 2 punktas
    public static boolean arDalinasi(int x, int y) {
        return x % y == 0;
    }
}
