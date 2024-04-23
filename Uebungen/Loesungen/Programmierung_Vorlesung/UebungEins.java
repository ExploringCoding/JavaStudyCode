package Uebungen.Loesungen.Programmierung_Vorlesung;

public class UebungEins {
    
    public static void main(String[] args) {
        
        zweiB();
        zweiDEF();
    }

    // zu 2b)
    public static void zweiB() {
        int a = 2;
        int b = 5;
    
        // Berechnungen
        int result_i = a + b;
        int result_ii = -a + b;
        int result_iii = 2 * (a + b);
        int result_iv = b / a;
        int result_v = a / b;
        int result_vi = a % b;
        int result_vii = b % a;
    
        // Ausgabe der Ergebnisse
        System.out.println("i. a+b: " + result_i);
        System.out.println("ii. -a+b: " + result_ii);
        System.out.println("iii. 2 * (a+b): " + result_iii);
        System.out.println("iv. b/a: " + result_iv);
        System.out.println("v. a/b: " + result_v);
        System.out.println("vi. a % b: " + result_vi);
        System.out.println("vii. b % a: " + result_vii);
    }
    

    // zu Übung 2d
    public static void zweiDEF(){

        int a = 2;
        int b = 5;

        System.out.println("Vor dem Tausch: a= " + a + ", b= " + b);
        
        boolean i = (a == Math.pow(2,1));
        boolean ii = (a == 3);
        boolean iii = (a != 3);
        boolean iv = (a == 3) == false;
        boolean v = (a == 2) || (b == 4);
        boolean vi = (a == 2) && (b == 4);
        boolean vii = (a == 2) && !(b == 4);
        boolean viii = a < 2 && b == 4 || b == 5;
        boolean ix = a < 2 && (b == 4 || b == 5);

        System.out.println("i: " + i);
        System.out.println("ii: " + ii);
        System.out.println("iii: " + iii);
        System.out.println("iv: " + iv);
        System.out.println("v: " + v);
        System.out.println("vi: " + vi);
        System.out.println("vii: " + vii);
        System.out.println("viii: " + viii);
        System.out.println("ix: " + ix);

        // variablenwerte tauschen
        int temp = a;
        a = b;
        b = temp;

        System.out.println("Nach dem Tausch: a= " + a + ", b= " + b);

        boolean qi = (a == Math.pow(2, 1));
        boolean qii = (a == 3);
        boolean qiii = (a != 3);
        boolean qiv = (a == 3) == false;
        boolean qv = (a == 2) || (b == 4);
        boolean qvi = (a == 2) && (b == 4);
        boolean qvii = (a == 2) && !(b == 4);
        boolean qviii = a < 2 && b == 4 || b == 5;
        boolean qix = a < 2 && (b == 4 || b == 5);
    
        System.out.println("i: " + qi);
        System.out.println("ii: " + qii);
        System.out.println("iii: " + qiii);
        System.out.println("iv: " + qiv);
        System.out.println("v: " + qv);
        System.out.println("vi: " + qvi);
        System.out.println("vii: " + qvii);
        System.out.println("viii: " + qviii);
        System.out.println("ix: " + qix);

        // neue Variable zero: Ergebnis von a-a
        int zero = a - a;
        System.out.println("zero: " + zero);

        // neue Variable divByZero: Ergebnis von a / zero
        int divByZero = a / zero;
        System.out.println("divByZero: " + divByZero);
    }


}


