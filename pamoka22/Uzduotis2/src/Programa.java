//Užduotis 2
//  1    Susikurkite Java projektą, susikurkite Programa.java failą (class), tame faile susikurkite main funkciją.
//  2    main funkcijoje susikurkite short kintamąjį, jam priskirkite reikšmę ir išveskite į konsolę.
//  3    main funkcijoje susikurkite boolean kintamąjį, jam priskirkite reikšmę ir išveskite į konsolę.
//  4    main funkcijoje susikurkite String kintamąjį, jam priskirkite reikšmę ir išveskite į konsolę.
//  5    main funkcijoje susikurkite double kintamąjį, jam priskirkite reikšmę ir išveskite į konsolę.
//  6    main funkcijoje susikurkite short kintamąjį, jam priskirkite reikšmę, tada susikurkite int kintamąjį ir int kintamajame išsaugokite short kintamojo reikšmę ir išveskit į konsolę.
//  7    main funkcijoje susikurkite int kintamąjį, jam priskirkite reikšmę, tada susikurkite byte kintamąjį ir byte kintamajame išsaugokite int kintamojo reikšmę. Išveskit į konsolę.
public class Programa {
    // 1 punktas susikurt projektą ir šitą main funkciją
    public static void main(String[] args) {
        // 2 punktas
        short sh = 57;
        System.out.println("sh = " + sh);
        // 3 punktas
        boolean b = true;
        System.out.println("b = " + b);
        // 4 punktas
        String s = "Uraganas";
        System.out.println("s = " + s);
        // 5 punktas
        double d = 511547.512;
        System.out.println("d = " + d);
        // 6 punktas
        short sh2 = 4785;
        int i2 = sh2;
        System.out.println("sh2 = " + sh2);
        System.out.println("i2 = " + i2);
        // 7 punktas
        int i3 = 58;        // negali būt daugiau nei 127, nes konvertuojant į byte prarastume reikšmę
        byte byte3 = (byte) i3;
        System.out.println("i3 = " + i3);
        System.out.println("byte3 = " + byte3);
    }
}
