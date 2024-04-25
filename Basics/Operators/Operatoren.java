package Basics.Operators;

public class Operatoren {
    

    // Arithmetische Operatoren: +, -, *, /, % 
    public static void arithmetischeOp(){

        int a = 10, b = 4;
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraktion: " + (a - b));
        System.out.println("Multiplikation: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulo: " + (a % b));
    }

    // Zuweisungsoperatoren: =, +=, -=, *=, /=, %=
    public static void zuweisungsOp(){

        int a = 10;
        a += 5; // äquivalent zu a = a + 5;
        System.out.println("Zuweisung mit Addition: " + a);

        int b = 10;
        b -= 5; // b = b - 5;
        System.out.println("Zuweisung mit Subtraktion: " + b);

        int c = 10;
        c *= 5; // c = c * 5;
        System.out.println("Zuweisung mit Multiplikation: " + c);

        int d = 10;
        d /= 5; // d = d / 5;
        System.out.println("Zuweisung mit Division: " + d);

        int e = 10;
        e %= 5; // e = e % 5
        System.out.println("Zuweisung mit Modolo: " + e);

    }

    // Vergleichsoperatoren: ==, !=, <, >, <=, >=
    public static void vergleichsOp(){

        int x = 10, y = 5;
        System.out.println("Gleich: " + (x == y));
        System.out.println("Ungleich: " + (x != y));
        System.out.println("Kleiner als: " + (x < y));
        System.out.println("Größer als: " + (x > y));
        System.out.println("Kleiner oder gleich: " + (x <= y));
        System.out.println("Größer oder gleich: " + (x >= y));
    }

    // Logische Operatoren: &&, ||, !
    public static void logischeOp(){

        boolean p = true, q = false;
        System.out.println("UND: " + (p && q));
        System.out.println("ODER: " + (p || q));
        System.out.println("NICHT: " + (!p));
    }

    // Bitweise Operatoren: &, |, ^, ~, <<, >>
    public static void bitwiseOp(){
        int m = 5, n = 3;
        System.out.println("UND: " + (m & n));
        System.out.println("ODER: " + (m | n));
        System.out.println("XOR: " + (m ^ n));
        System.out.println("NICHT: " + (~m));
        System.out.println("Verschiebung nach links: " + (m << 1));
        System.out.println("Verschiebung nach rechts: " + (m >> 1));
    }

    // Inkrement-/Dekrementoperatoren: ++, --
    public static void inkrementDekrementOp(){
        int num = 10;
        System.out.println("Vorinkrement: " + (++num)); // inkrementiert vor der Verwendung
        System.out.println("Nachinkrement: " + (num++)); // inkrementiert nach der Verwendung
        // (num++) => stellt sicher, dass das inkrement erst nach der ausgabe von num erfolgt
        System.out.println("Wert nach Nachinkrement: " + num);

        int zahl = 20;
        System.out.println("Vorinkrement: " + zahl++);
        System.out.println("Nachinkrement: " + ++zahl);
    }

    // Bedingte Operatoren (Ternary Operator): ?: => siehe auch BASICS => TERNAERE_OPERATOREN => *.java 
    public static void bedingteOp(){
        int a = 10, b = 20;
        int max = (a > b) ? a : b;
        System.out.println("Maximalwert: " + max);  
    }

}
