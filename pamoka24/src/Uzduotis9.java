//Funkcija gauna sveiką skaičių, ir išveda "didelis neigiamas",
// jeigu yra mažiau -1 000 000, "neigiamas" jeigu tarp 0 ir -1 000 000, "nulis",
// jeigu nulis, "teigiamas" jeigu nuo 0 iki 1 000 000, "didelis teigiamas", jeigu daugiau nei 1 000 000
public class Uzduotis9 {
    public static void main(String[] args) {
        patikrintiSkaiciu(-200000000);
        patikrintiSkaiciu(-2000);
        patikrintiSkaiciu(0);
        patikrintiSkaiciu(10);
        patikrintiSkaiciu(1500000);
    }

    public static void patikrintiSkaiciu(int sk) {
        String tekstas = "";
        if (Math.abs(sk) > 1000000) {
            tekstas += "didelis ";
        }
        if (sk > 0) {
            tekstas += "teigiamas";
        } else if (sk < 0) {
            tekstas += "neigiamas";
        } else {
            tekstas += "nulis";
        }
        System.out.println(tekstas);
    }
}
