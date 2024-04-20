package Objekt_Orientierte_Programmierung.Polymorphismus;

// unterklasse Auto, die von Fahrzeug erbt
public class Auto extends Fahrzeug {

    // überschriebene methode zur ausgabe einer spezifischen beschreibung
    @Override
    public void beschreibung(){
        System.out.println("dies ist ein auto");
    }
}

