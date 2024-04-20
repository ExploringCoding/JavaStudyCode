package Objekt_Orientierte_Programmierung.Vererbung;

// kindklasse der Klasse Fahrzeug  => in Vererbung => Fahrzeug.java
public class Auto extends Fahrzeug {

    // klassenvariable
    public int baujahr;

    // Standardkonstruktor <= wenn nicht da dann => Implicit super constructor Fahrzeug() is undefined for default constructor. Must define an explicit constructorJava(134217868)
    public Auto(String marke, int baujahr) { // <= mit diesem Konstruktor ruft die Auto-Klasse den konstruktor der Fahrzeug klasse auf, um das attribut marke zu initialisieren.
        super(marke);
        this.baujahr = baujahr;
    }

    // neue methode in der kindklasse
    public void fahren(){
        System.out.println("Das Auto fährt. (Kindklasse)");
    }
}
