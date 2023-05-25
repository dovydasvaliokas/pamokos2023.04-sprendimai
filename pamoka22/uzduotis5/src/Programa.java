//Užduotis 5
// 1 Susikurkite Java projektą, susikurkite Programa.java failą (class), tame faile susikurkite main funkciją.
// 2 Sukurkite papildomą funkciją, kuri gauna tekstinę reikšmę ir tą tekstinę reikšmę išveda tris kartus į konsolę
// 3 Panaudokite tą funkciją, jog išvestumėte Penktadienis tris kartus.
// 4 Panaudokite tą funkciją, jog išvestumėte Šiandien aš programuoju tris kartus.
public class Programa {
    // 1 punktas
    public static void main(String[] args) {
        // 3 punktas
        String s1 = "Penktadienis";
        isvestiTrisKartus(s1);

        // 4 punktas
        String s2 = "Šiandien aš programuoju";
        isvestiTrisKartus(s2);
    }

    // 2 punktas
    public static void isvestiTrisKartus(String tekstas) {
        System.out.println(tekstas);
        System.out.println(tekstas);
        System.out.println(tekstas);
    }
}
