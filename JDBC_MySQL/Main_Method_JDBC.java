package JDBC_MySQL;

import java.util.List;
import java.util.Scanner;

import JDBC_MySQL.Database.DataAccessLayer;
import JDBC_MySQL.Database.InitDB;

public class Main_Method_JDBC {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        // verbindungsherstellung
        InitDB.connectionToDB();
        
        welcomeStart();
        
        // Verbindung am Ende schließen
        InitDB.closeConnection();
        scanner.close();
    }
    
    private static void welcomeStart(){

        System.out.println("\n===> SPACED-CMD-REPETITION: Lernkarten-Applikation <===\n");
        System.out.println("Deine Karten-Stapel");
        showCardDecks();

        // weiterleitung zu controlFlow()
        controlFlow();
        
    }

    private static void controlFlow(){


        // boolean zur exit steuerung
        boolean wantsExit = false;

        //boolean isWelcome = true;

        // basic control flow 
        while (!wantsExit){

            System.out.println("\nBefehle:\n");
            System.out.println("Karten-Stapel: Karten-Stapel hinzufuegen (n), Alle Karten-Stapel anzeigen (a), Karten-Stapel löschen (del-stapel), Karten-Stapel umbenennen (u), Alle Karten-Stapel als Markdown exportieren (md-stapel)");
            System.out.println("Karten: Neue Karte hinzufügen (c)");
            System.out.println("Beenden (e)");

            /*
            if (isWelcome) {

                System.out.println("\nAnki-Clone: Applikation für Lernkarten\n");
                System.out.println("Deine Lernkarten-Stapel\n");
                showCardDecks();
    
                System.out.println("\nBefehle: Neues Lernkarten-Stapel (n), Alle Decks anzeigen (a), Löschen (del), Update Deck-Name (u), Neue Karte hinzufügen (c), Beenden (e)");
                isWelcome = false;
            } else {
                System.out.println("\n-----------------------------------------------------------------------------");
                System.out.println("\nBefehle: Neues Lernkarten-Stapel (n), Alle Decks anzeigen (a), Löschen (del), \nUpdate Deck-Name (u), Neue Karte hinzufügen (c), Markdown-Export (md), \nBeenden (e)");
            }
            */
            
            String input = scanner.nextLine().toLowerCase().toString(); // <= falls eine Zahl eingegeben worden ist, direkt zu einem String umwandeln
            
            
            if (input.equals("n")) { // karten-stapel-hinzufuegen
                addCardDeck();

            } else if (input.equals("a")) { // alle karten-stapel anzeigen
                showCardDecks();
                            
            } else if (input.equals("e")) { // exit
                System.out.println("Das Programm wird nun beendet.");
                wantsExit = true;
                break;
                
            } else if (input.equals("del-stapel")) { // karten-stapel löschen
                deleteCardDeck();

            } else if (input.equals("u")) { // umbenennen eines kartenstapels
                renameCardDeck();
            
            } else if (input.equals("c")) { // lernkarte einem deck hinzufuegen
                addCard();
                
            } else if (input.equals("md-stapel")) { // karten-stapel als markdown exportieren
                exportAllCardsToMarkdown();
            } else if (input.equals("md-sel")){
                exportSelectedDeckToMarkdown();
            } else if (input.equals("simple")) {
                learnCardsSimpleMode();
            }
            
            else {
                System.out.println("Dieser Befehl ist nicht bekannt.");
            }

        }
        
    }

    // ------------------------------------------------------------------------------------------------------------
    // Methoden zu Karten-Stapel
    private static void addCardDeck(){

        boolean wantsExit = false;

        while (!wantsExit) {

            System.out.println("Gebe Deinem Lernkarten-Stapel einen Namen: ");
            String deckName = scanner.nextLine().toString().toLowerCase();

            try {
                DataAccessLayer.addCardDeck(InitDB.getConnection(), deckName);
                System.out.println("Dein neuer Karten-Stapel wurde hinzugefügt: " + deckName);
                showCardDecks();
    
            } catch (Exception e) {
                System.err.println("Fehler beim Hinzufügen. " + e.getMessage());
            }

            System.out.println("Noch einen Karten-Stapel hinzufuegen? (j/n)");
            String input = scanner.nextLine().toLowerCase().toString();
            
            if (input.equals("n")){
                wantsExit = true;
                controlFlow();
            }
        }
    }

    private static void renameCardDeck(){

        boolean wantsExit = false;

        while (!wantsExit) {
            
            System.out.println("\nGebe den Namen des Decks ein, welches Du umbenennen möchtest.");
            String oldName = scanner.nextLine().toString();

            System.out.println("\nGebe den neuen Namen für das Deck ein.");
            String newName = scanner.nextLine().toString();

            updateCardDeckName(oldName, newName);

            System.out.println("Noch einen Karten-Stapel umbenennen? (j/n)");

            String input = scanner.nextLine();

            if (input.equals("n")) {
                wantsExit = true;
                controlFlow();
            } else {
                wantsExit = false;
            }
            
        }

    }

    private static void showCardDecks(){
        DataAccessLayer.retrieveAllCardDecks(InitDB.getConnection());
    }

    private static void deleteCardDeck(){

        System.out.println("Bitte gebe den Namen des zu löschenden Decks ein. ");
        String deck_name = scanner.nextLine().toString().toLowerCase();
        DataAccessLayer.deleteCardDeck(InitDB.getConnection(), deck_name);
    }

    private static void updateCardDeckName(String old_deck_name, String new_deck_name){
        DataAccessLayer.updateCardDeck(InitDB.getConnection(), old_deck_name, new_deck_name);
    }
    
    private static void exportAllCardsToMarkdown(){

        System.out.println("Wie soll der Name der zu exportierenden Datei lauten?");
        String nameInput = scanner.nextLine().toString().toLowerCase();

        DataAccessLayer.exportAllCardsToMarkdown(InitDB.getConnection(), nameInput);

    }


    // ------------------------------------------------------------------------------------------------------------
    // Methoden zu Lernkarten

    
    private static void addCard() {
        
        boolean wantsExit = false;
        
        System.out.println("Wähle ein Deck aus.");
        showCardDecks();
        String deckSelection = scanner.nextLine().toString();
        
        while (!wantsExit) {
            
            String tempDeck = deckSelection;
            
            System.out.println("Text für die Vorderseite: ");
            String inputFront = scanner.nextLine().toString();
            
            System.err.println("Text für die Rückseite: ");
            String inputBack = scanner.nextLine().toString();
            
            DataAccessLayer.addCard(InitDB.getConnection(), tempDeck, inputFront, inputBack);
            
            System.out.println("Noch eine Lernkarte hinzufügen? (j/n)");
            String goAgain = scanner.nextLine().toString().toLowerCase();
            
            if (goAgain.equals("n")) {
                wantsExit = true;
                controlFlow();
            } 
        }
    }
    
    private static void exportSelectedDeckToMarkdown(){

        System.out.println("Wähle das Deck aus.");
        String deckInput = scanner.nextLine().toString().toLowerCase();


        System.out.println("Wie soll der Name der zu exportierenden Datei lauten?");
        String nameInput = scanner.nextLine().toString().toLowerCase();

        DataAccessLayer.exportSelectedDeckToMarkdown(InitDB.getConnection(), deckInput, nameInput);

    }


    // ------------------------------------------------------------------------------------------------------------
    // Methoden zu Lernen-Funktion

    // simple mode

    public static void learnCardsSimpleMode() {
        System.out.println("Wähle ein Deck aus:");
        String selectedDeck = scanner.nextLine().toLowerCase();
    
        List<String[]> cardsList = DataAccessLayer.fetchCardsForDeck(InitDB.getConnection(), selectedDeck);
        
        for (String[] cardData : cardsList) {
            // Vorderseite anzeigen
            System.out.println("\nVorderseite:");
            System.out.println(cardData[0]);
            
            // Benutzer zur Eingabe auffordern, um die Rückseite anzuzeigen oder zur nächsten Karte zu gehen
            System.out.println("\nGib 'weiter' ein, um die Rückseite anzuzeigen, oder 'fertig', um das Lernen zu beenden.");
            String input = scanner.nextLine().toLowerCase();
            
            if (input.equals("weiter")) {
                // Rückseite anzeigen
                System.out.println("\nRückseite:");
                System.out.println(cardData[1]);
                
                // Benutzer zur Eingabe auffordern, um zur nächsten Karte zu gehen
                System.out.println("\nGib 'weiter' ein, um zur nächsten Karte zu gehen.");
                input = scanner.nextLine().toLowerCase();
                
                // Wenn der Benutzer "fertig" eingibt, das Lernen beenden
                if (input.equals("fertig")) {
                    return;
                }
            } else if (input.equals("fertig")) {
                // Wenn der Benutzer "fertig" eingibt, das Lernen beenden
                return;
            } else {
                // Ungültige Eingabe behandeln
                System.out.println("Ungültige Eingabe. Bitte gib 'weiter' ein, um zur Rückseite zu gelangen, oder 'fertig', um das Lernen zu beenden.");
            }
        }
    }
    
    


}
