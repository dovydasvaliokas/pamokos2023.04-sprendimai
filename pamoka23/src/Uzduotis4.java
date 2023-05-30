// 1. Tame pačiame projekte susikurkite naują failą (class) `Uzduotis4.java`, jame susikurkite `main` funkciją.
// 2. Susikurkite papildomą funkciją, kuri gauna du tekstinius kintamuosius per parametrus.
// Funkcija IŠVEDA Į konsolę `Tekstai yra vienodi`, jeigu tekstai yra vienodi, o jeigu ne, tai išveda į konsolę `Tekstai yra skirtingi`
public class Uzduotis4 {
    // 1 punktas
    public static void main(String[] args) {
        arVienodi("tekstas", "tekstas");
        arVienodi("belekas", "bet kas");

    }

    // 2 punktas
    public static void arVienodi(String s1, String s2) {
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Tekstai yra vienodi");
        }
        else {
            System.out.println("Tekstai yra skirtingi");
        }
    }
}
