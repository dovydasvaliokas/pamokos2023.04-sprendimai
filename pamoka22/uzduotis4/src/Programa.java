//Užduotis 4
// 1 Susikurkite Java projektą, susikurkite Programa.java failą (class), tame faile susikurkite main funkciją.
// 2 Susikurkite funkciją, kuri gauna du sveikus skaičius ir grąžina jų sumą padvigubintą.
// 3 Panaudokite tą funkciją, jog apskaičiuotumėte su 25 ir 37 dvigubą sumą.
// 4 Panaudokite tą funkciją, jog apskaičiuotumėte su -200 ir 100 dvigubą sumą.
public class Programa {
    // 1 punktas
    public static void main(String[] args) {
        // 3 punktas
        int sk1 = 25;
        int sk2 = 37;
        int suma1 = dvigubaSuma(sk1, sk2);
        System.out.println("suma1 = " + suma1);

        // 4 punktas
        int sk3 = -200;
        int sk4 = 100;
        int suma2 = dvigubaSuma(sk3, sk4);
        System.out.println("suma2 = " + suma2);

    }

    // 2 punktas
    public static int dvigubaSuma(int a, int b) {
        return 2 * (a + b);
    }
}
