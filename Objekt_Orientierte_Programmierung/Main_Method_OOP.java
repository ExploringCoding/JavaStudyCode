package Objekt_Orientierte_Programmierung;

//import Objekt_Orientierte_Programmierung.Polymorphismus.Auto;
//import Objekt_Orientierte_Programmierung.Polymorphismus.Fahrrad;
//import Objekt_Orientierte_Programmierung.Polymorphismus.Fahrzeug;

//import Objekt_Orientierte_Programmierung.Abstraktion.Rechteck;
//import Objekt_Orientierte_Programmierung.Kapselung.KapselungErklaerung;
// => xxx.*; => beudetet das alles aus dem paket importiert wird.
//import Objekt_Orientierte_Programmierung.Klassen_und_Objekte.*;
//import Objekt_Orientierte_Programmierung.Vererbung.*;

public class Main_Method_OOP {
    
    public static void main(String[] args) {
        
        // Obekt_Orientierte_Programmierung => Klassen_und_Objekte => Auto.java

            /* 
            // Erstellung von Objekten der Klasse Auto
            Auto auto1 = new Auto("Volkswagen", "Golf", 2020);
            Auto auto2 = new Auto("Mercedes", "CLA", 2024);

            // Zugriff auf die Methoden und Attribute der objekte
            auto1.detailsAnzeigen();
            System.out.println(); // leerzeile zur trennung der ausgabe
            auto2.detailsAnzeigen();
            */

        // Obekt_Orientierte_Programmierung => Vererbung => Fahrzeug.java
            /* 
            Auto auto = new Auto("Mercedes", 2024);

            // aufruf von methoden der elternklasse
            auto.starten();

            // aufruf von methoden der kindklasse
            auto.fahren();

            // zugriff auf die Attribute der Elternklasse
            System.out.println("Marke des Autos: " + auto.marke);
            // zugriff auf die Attribute der Kindklasse
            System.out.println("Baujahr des Autos: " + auto.baujahr);

            Fahrzeug fahrzeug = new Fahrzeug("BMW");
            fahrzeug.starten();
            // fahrzeug.fahren(); <== Elternklasse kann NICHT auf die Methoden der Kindklasse zugreifen!! Vererbung nur Top to Bottom!!
            */

        // Obekt_Orientierte_Programmierung => Kapselung => Fahrzeug.java
            /* 
            KapselungErklaerung person = new KapselungErklaerung("Max", 30);

            // Zugriff auf private Variable nicht möglich (nur über öffentliche Methoden)
            // person.name; // Dies würde zu einem Kompilierfehler führen

           // Daten abrufen und ändern über die öffentlichen Methoden
            System.out.println("Name: " + person.getName());
            System.out.println("Alter: " + person.getAlter());

            person.setName("Moritz");
            person.setAlter(25);

            System.out.println("Neuer Name: " + person.getName());
            System.out.println("Neues Alter: " + person.getAlter()); 

            // Direkter Zugriff auf die Variablen ist nicht möglich, was die Datenintegrität gewährleistet
            // person.alter = -5; // Dies würde zu einem Kompilierfehler führen
            */

        // Obekt_Orientierte_Programmierung => Abstraktion => Rechteck.java
            /*
            // erstellung des rechteck-objekts
            Rechteck rechteck = new Rechteck(5, 3);

            // aufruf der methode zur berechnung des flächeninhalts
            double flaecheninhalt = rechteck.berechneFlaecheninhalt();
            System.out.println("flächeninhalt des rechtecks: " + flaecheninhalt);
            */
        
        // Obekt_Orientierte_Programmierung => Polymorphismus => Fahrzeug.java
            /*
            // erstellung der fahrzeug-objekte
            Fahrzeug fahrzeug1 = new Fahrzeug();
            Fahrzeug fahrzeug2 = new Auto();
            Fahrzeug fahrzeug3 = new Fahrrad();

            // Aufruf der Methode beschreibung für jedes Fahrzeug-Objekt
            fahrzeug1.beschreibung(); // Ruft die Methode von Fahrzeug auf
            fahrzeug2.beschreibung(); // Ruft die überschriebene Methode von Auto auf
            fahrzeug3.beschreibung(); // Ruft die überschriebene Methode von Fahrrad auf
            */
        


    }
}
