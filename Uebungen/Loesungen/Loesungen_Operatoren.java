package Uebungen.Loesungen;

public class Loesungen_Operatoren {
    
    public static void main(String[] args) {
        
        summe(3, 5);
        multiplikation(4);

        erhoehen(10);
        produkt(3, 9);

        trueZurueck(3, 2);
        groeßerKleiner(41, 1);
        bothTrue(false, false);
        oneTrue(false, false);
        vorInk(2);
        int nach = nachInk(2);
        System.out.println(nach);
        test(nachInk(2));

        ternary(12, 123);
    }

    private static void test(int result){
        System.out.println(result);
    }

    // zu arithmetische operatoren
    private static int summe(int a , int b){
        return a + b;
    }

    private static int multiplikation(int a){
        return a * 10;
    }

    // zu Zuweisungsoperatoren
    private static int erhoehen(int a){
       return a += 5; 
    }

    private static int produkt(int a, int b){
        return a * b;
    }

    // zu Vergleichsoperatoren
    private static boolean trueZurueck(int a, int b){
        return a == b;
    }

    private static boolean groeßerKleiner(int a, int b){
        return a > b;
    }

    // zu Logische Operatoren
    private static boolean bothTrue(boolean a, boolean b) {
        return a && b;
    }

    private static boolean oneTrue(boolean a, boolean b){
        return a || b;
    }

    // zu Inkrement-/Dekrementoperatoren
    private static int vorInk(int a){
        return ++a;
    }

    private static int nachInk(int a){
        int temp = a;
        temp++;
        return temp;
    }

    // zu Bedingte Operatoren (Ternary Operator)
    public static boolean ternary(int a, int b){
        return (a > b) ? true : false;
    }
}
