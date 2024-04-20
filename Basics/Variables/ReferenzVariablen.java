package Basics.Variables;
import java.util.Arrays;

public class ReferenzVariablen {

    /*
     * Unterschied: Primitive Variable und Referenzvarible
     * PV= int age = 25; => wert wird direkt in der variable gespeichert
     * RV= String name = "Alice"; => referenz der speicheradresse wird in der variable gespeichert.
     */
    
    @SuppressWarnings("static-access") // wegen static-access bei Referenzklassenbeispiel, da in Java 21 nicht so zu machen
    public static void referenzVariablen(){

        // deklaration und initialisierung von referenzvariablen
        String name = "Alice"; // referenzvariable, weil der tatsächliche wert des objekts gespeichert wird, sondern nur die referenz
        StringBuilder address = new StringBuilder("Frankfurter Straße 1");
        int[] numbers = {1,2,3,4,5};
        boolean[] flags = {true, false, true};

        // Erzeugt eine Instanz/Objekt der Klasse ReferenzKlasseBeispiel und ruft die Methode KlassenBeispiel() auf.
        ReferenzKlasseBeispiel referenzKlasseBeispiel = new ReferenzKlasseBeispiel();
        referenzKlasseBeispiel.KlassenBeispiel();

        // Ausgabe der Referenzvariablen
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Numbers: " + Arrays.toString(numbers));
        System.out.println("Flags: " + Arrays.toString(flags));
    }
}
