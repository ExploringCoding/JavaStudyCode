package Objekt_Orientierte_Programmierung.Vererbung;

// elternklasse (überklasse) der Klasse Auto  => in Vererbung => Auto.java
public class Fahrzeug {
    
    // klassenvariable
    public String marke;

    // konstruktor
    public Fahrzeug(String marke){
        this.marke = marke;
    }

    // methode
    public void starten(){
        System.out.println("Das Fahrzeug startet. <= Methode der Elternklasse, aber aufgerufen von der Kindklasse!");
    }

}
