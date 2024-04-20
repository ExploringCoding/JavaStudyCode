package Basics.Methods;

import java.util.ArrayList;

public class ParameterDatenbankSimulation {
    
    // datenbank-alternative in form eines arrays
    private ArrayList<String> datenbank = new ArrayList<>();

    // methode zum hinzufügen eines datensatzes zur datenbank
    public void datensatzHinzufuegen(String datensatz){

        System.out.println("Füge Datensatz hinzu: " + datensatz);
        datenbank.add(datensatz);
    }

    // Methode zum Aktualisieren eines vorhandenen Datensatzes in der "Datenbank"
    public void datensatzAktualisieren(int index, String neuerDatensatz) {
        if (index >= 0 && index < datenbank.size()) {
            System.out.println("Aktualisiere Datensatz an Index " + index + ": " + neuerDatensatz);
            datenbank.set(index, neuerDatensatz);
        } else {
            System.out.println("Ungültiger Index für Aktualisierung.");
        }
    }

    // Methode zum Anzeigen aller Datensätze in der "Datenbank"
    public void alleDatensaetzeAnzeigenOhneIndex(){
        System.out.println("Alle Datensätze in der Datenbank");
        for (String datensatz : datenbank){
            System.out.println(datensatz);
        }
    }

    // methode zum löschen eines Eintrags aus der "Datenbank" anhand seines indexs
    public void datensatzLoeschen(int index){

        if (index >=0 && index < datenbank.size()){
            System.out.println("Lösche Datensatz an Index " + index);
            datenbank.remove(index);
        } else {
            System.out.println("Ungültiger Index für Löschung");
        }
    }

    // Methode zum Anzeigen aller Datensätze in der "Datenbank" inkl. Index-Position
    public void alleDatensaetzeAnzeigen() {
        System.out.println("Alle Datensätze in der Datenbank:");
        for (int i = 0; i < datenbank.size(); i++) {
            System.out.println("Index " + i + ": " + datenbank.get(i));
        }
    }

    // Methode zum Löschen eines Eintrags aus der "Datenbank" anhand seines Inhalts
    public void datensatzLoeschenNachInhalt(String zuLoeschenderDatensatz) {
        int index = -1; // Initialisiere den Index als ungültig <= um sicherzustellen, dass, wenn der zu löschende Datensatz nicht gefunden wird, der Index unverändert bleibt und keine gültige Position in der Datenbank darstellt

        // Durchsuche die Datenbank nach dem zu löschenden Datensatz
        for (int i = 0; i < datenbank.size(); i++) {
            if (datenbank.get(i).equals(zuLoeschenderDatensatz)) {
                index = i; // Setze den Index auf die Position des gefundenen Datensatzes
                break; // Beende die Schleife, sobald der Datensatz gefunden wurde
            }
        }

        // Überprüfe, ob der Datensatz gefunden wurde
        if (index != -1) {
            System.out.println("Lösche Datensatz '" + zuLoeschenderDatensatz + "' an Index " + index);
            datenbank.remove(index); // Lösche den Datensatz an der gefundenen Position
        } else {
            System.out.println("Datensatz '" + zuLoeschenderDatensatz + "' nicht gefunden.");
        }
    }

    // Methode zum Ausführen einer Beispielsequenz von Operationen
    public void datenbankOperationenAusfuehren() {
        datensatzHinzufuegen("Datensatz 1");
        datensatzHinzufuegen("Datensatz 2");
        datensatzLoeschen(0);
        alleDatensaetzeAnzeigen();
        datensatzAktualisieren(1, "Aktualisierter Datensatz 2");
        alleDatensaetzeAnzeigen();
    }
}
