//1. Sukurkite funkciją, kuri patikrina ar metai yra keliamieji ar ne.
// Pvz. 2000 metai yra keliamieji, 2003 ne keliamieji, 2008 keliamieji, 1602 ne keliamieji, 1596 metai keliamieji.
// P.S. keliamieji metai atsirado tik 1582, tai prieš tai esantys metai neturėtų turėti nei to, nei to.
public class Uzduotis6 {
    public static void main(String[] args) {
        System.out.println(arKeliamieji(2003));
        System.out.println(arKeliamieji(2008));
        System.out.println(arKeliamieji(1602));
        System.out.println(arKeliamieji(1596));
        System.out.println(arKeliamieji(1592));
        System.out.println(arKeliamieji(1200));

    }

    public static boolean arKeliamieji(int metai) {
        return metai >= 1582 && metai % 4 == 0 && (metai % 100 > 0 || metai % 400 == 0);
    }

}
