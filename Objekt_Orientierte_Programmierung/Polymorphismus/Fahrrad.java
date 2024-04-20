package Objekt_Orientierte_Programmierung.Polymorphismus;

// Unterklasse Fahrrad, die von Fahrzeug erbt
public class Fahrrad extends Fahrzeug {

    @Override
    public void beschreibung(){
        System.out.println("dies ist ein fahrrad");
    }
}
