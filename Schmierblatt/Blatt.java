package Schmierblatt;

import java.util.ArrayList;
import java.util.Scanner;

public class Blatt {
    
    private static ArrayList<String> datenbank = new ArrayList<>(); 
    
    public static void main(String[] args) {

        startup();
        
        
    }

    private static void testDatensatz(){
        datenbank.add("Hallo");
        datenbank.add("Hallosdasd");
        datenbank.add("Hallosadasfdsaffa");
        
    }

    private static void startup(){

        System.out.println("DATENBANK-Sim - Herzlich Willkommen!");
        testDatensatz();
        controlFlow();
    }

    private static void controlFlow(){

        Scanner scanner = new Scanner(System.in);

        // variablen
        boolean wantsExit = false;

        while (!wantsExit){

            System.out.println("Befehle: Hinzufügen (h), Exit (e), Alles Anzeigen (v), Index-Suche (i), Delete (d)");
            System.out.println("Welchen Befehl möchten Sie ausführen?");
    
            String eingabe = scanner.nextLine().toLowerCase();

            if (eingabe.startsWith("e")) {
                System.out.println("Auf Wiedersehen!");
                wantsExit = true;
            
            } else if (eingabe.startsWith("h")) {

                System.out.println("Was möchten Sie hinzufügen?");
                String inputAdd = scanner.nextLine();
                
                add(inputAdd);

            } else if (eingabe.startsWith("v")) {
                
                showAll();
            } else if (eingabe.startsWith("i")) {
                
                System.out.println("Bitte geben Sie den gesuchten Index ein. ");
                int requiredIndex = scanner.nextInt();
            
                showAtIndex(requiredIndex);
            } else if (eingabe.startsWith("d")) {

                System.out.println("Möchten Sie mit dem Index oder dem Begriffseingabe löschen?");
                String inputDesicion = scanner.nextLine().toLowerCase();

                if (inputDesicion.startsWith("i")){
                    System.out.println("Geben Sie den Index ein.");
                    int toDeleteIndex = scanner.nextInt();
                    removeByIndex(toDeleteIndex);

                } else if (inputDesicion.startsWith("b")) {

                    System.out.println("Schreiben Sie das Wort welches Sie löschen wollen. ");
                    String stringToDelete = scanner.nextLine();
    
                    remove(stringToDelete);
                } else {
                    System.out.println("Bitte geben Sie einen gültigen Befehl ein.");
                }
            }
        }
        
        scanner.close();
    } // ende methode

    private static void add(String inputAdd){

        try {
            datenbank.add(inputAdd);
            System.out.println(inputAdd + " wurde hinzugefügt.");
        } catch (Exception e){
            e.printStackTrace();
            System.out.println( inputAdd + " konnte der Datenbank nicht hinzugefügt werden");
        }

    }

    private static void showAll(){

        System.out.println("Folgende Einträge sind abgespeichert: ");

        for (int i = 0; i < datenbank.size(); i++){

            System.out.println("Index: " + i + " Inhalt: " + datenbank.get(i));
        }
    }

    private static void showAtIndex(int requiredIndex){

        for (int i = 0; i < datenbank.size(); i++) {

            if (requiredIndex == i) {
                System.out.println("Folgendes befindet sich bei Index " + i + " " + datenbank.get(requiredIndex));
                break;
            }
        }
    }

    private static void remove(String toDelete){

        for (int i = 0; i < datenbank.size(); i++){

            if (datenbank.get(i).equals(toDelete)){
                datenbank.remove(i);
            }
        }
    }

    private static void removeByIndex(int indexToRemove){

        for (int i = 0; i < datenbank.size(); i++){
            
            if (indexToRemove == i){
                datenbank.remove(i);
            }
        }
    }

}
