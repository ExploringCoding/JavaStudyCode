package Basics.Constructors;

public class KonstruktorenErklaerung {
    

    // Standardkonstruktor ohne Parameter => wird automatisch erstellt, wenn kein anderer Konstruktor definiert ist.
    public KonstruktorenErklaerung(){
        System.out.println("Standardkonstruktor aufgerufen");
    } 

    // Parameterisierter Konstruktor => wird verwendet, um Objekte zu initialisieren und zu konfigurieren
    public KonstruktorenErklaerung(int zahl){
        System.out.println("Parameterisierter Konstruktor mit Zahl " + zahl + " aufgerufen");
    }

    // Überladen des parameterisierten Konstruktors => konstruktor mit mehreren Signaturen, der verschiedene Kombinationen von Parametern aktzeptiert, um Flexibilität bei der Objekterzeugung zu bieten.
    public KonstruktorenErklaerung(int zahl, String text) {
        System.out.println("Parameterisierter Konstruktor mit Zahl " + zahl + " und Text '" + text + "' aufgerufen");
    }

    // Kopierkonstruktor => eine vorhandene Instanz derselben Klasse als Parameter aktzeptiert und ein neues Objekt mit denselben Eigenschaften erstellt. 
    public KonstruktorenErklaerung(KonstruktorenErklaerung obj) {
        System.out.println("Kopierkonstruktor aufgerufen");
    }
}
