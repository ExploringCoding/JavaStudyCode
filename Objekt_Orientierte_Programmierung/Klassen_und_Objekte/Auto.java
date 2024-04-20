package Objekt_Orientierte_Programmierung.Klassen_und_Objekte;

public class Auto {

    // klassenvariablen oder -attribute
    String marke;
    String modell;
    int baujahr;
    
    // konstruktor zur initialisierung eines autos
    public Auto (String marke, String modell, int baujahr){

        this.marke = marke;
        this.modell = modell;
        this.baujahr = baujahr;
    }

    // methode zum anzeigen der details des autos
    public void detailsAnzeigen(){
        System.out.println("Marke: " + marke);
        System.out.println("Modell: " + modell);
        System.out.println("Baujahr: " + baujahr);
    }
}
