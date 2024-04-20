package Objekt_Orientierte_Programmierung.Abstraktion;

// abstrakte klasse
abstract class Form {

    // abstrakte methode zur berechnung des flächeninhalts
    public abstract double berechneFlaecheninhalt();

}

// konkrete klasse, die von der abstrakten klasse erbt und die berechnung des flächeninhalts eines rechtecks implementiert
public class Rechteck extends Form {

    // attribute
    private double laenge;
    private double breite;

    // konstruktor 
    public Rechteck (double laenge, double breite){
        this.laenge = laenge;
        this.breite = breite;
    }
    
    // implementierung der abstrakten methode der abstract class Form
    @Override // <== Anmerkung zum überschreiben der abstrakten methode
    public double berechneFlaecheninhalt(){
        return laenge * breite;
    }
}
