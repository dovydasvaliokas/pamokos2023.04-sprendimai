//Sukurkite funkciją, kuri patikrina du skaičius ar jie lygūs, bet tik per tris skaitmenis po kablelio.
// T.y., jeigu skaičius1 yra 15.0247, o skaičius2 yra 18.956, tai jie skirtingi, jeigu sk1 yra 12.0327,
// o sk2 yra 12.0358, tai jie yra skirtingi, tačiau jeigu sk1 yra 12.05847, o sk2 yra 12.05892,
// tai jau skaičiai yra vienodi, nes abiejų pradžia yra 12.058
public class Uzduotis8 {
    public static void main(String[] args) {
        System.out.println(arVienodiTrijuSkaitmenuPoKableliuTikslumu(12.0327, 12.0358));
        System.out.println(arVienodiTrijuSkaitmenuPoKableliuTikslumu(12.05847, 12.05892));
        System.out.println(arVienodiTrijuSkaitmenuPoKableliuTikslumu(3.5741, 3.573101));
    }

    public static boolean arVienodiTrijuSkaitmenuPoKableliuTikslumu(double a, double b) {
        return Math.abs(a - b) <= 0.001;
    }
}
