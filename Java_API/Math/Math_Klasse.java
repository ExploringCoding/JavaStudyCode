package Java_API.Math;

public class Math_Klasse {
    

    // quadratwurzel 
    public static void sqrtA(){

        double zahl = 64.0;
        double quadratwurzel = Math.sqrt(zahl);
        System.out.println(quadratwurzel);
    }

    // potenzierung
    public static void powA(){
        double ergebnis = Math.pow(2, 10);
        System.out.println(ergebnis); 
    }

    // absoluter wert einer gleitkommazahl
    public static void absA(){
        double wert = -42.56;
        double absoluterWert = Math.abs(wert);
        System.out.println(absoluterWert);
    }

    // logarithmus
    public static void logA(){
        int zahl = 100;
        double log = Math.log10(zahl);
        System.out.println("Logarithmus von " + zahl + " zur Basis 10 ist: " + log);
    }

    // kleinste ganzzahl zurück, die größer oder gleich a ist
    public static void ceilA(){
        double a = 15.25;
        double ergebnis = Math.ceil(a);
        System.out.println("ergebnis der deckung: " + ergebnis);
    }

    // exponent abrufen
    public static void getExponentA(){
        double wert = 123.45;

        int exponent = Math.getExponent(wert);
        System.out.println("Exponent von " + wert + " ist " + exponent);
    }
}
