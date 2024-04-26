package JDBC_MySQL;

import java.util.Scanner;

import JDBC_MySQL.Database.DataAccessLayer;
import JDBC_MySQL.Database.InitDB;

public class Main_Method_JDBC {
    

    public static void main(String[] args) {
        
        // verbindungsherstellung
        InitDB.connectionToDB();
        
        controlFlow();
        
        // Verbindung am Ende schließen
        InitDB.closeConnection();
    }
    // TODO: controlFlow von dem Welcome (also Anki-Clone msg etc) trennen. controlFlow muss von anderen methoden auch während dem betrieb aufgerufen werden können.
    private static void controlFlow(){

        Scanner scanner = new Scanner(System.in);

        // boolean zur exit steuerung
        boolean wantsExit = false;

        boolean isWelcome = true;

        // basic control flow 
        while (!wantsExit){

            if (isWelcome) {

                System.out.println("\nAnki-Clone: Applikation für Lernkarten\n");
                System.out.println("Deine Lernkarten-Stapel\n");
                showCardDecks();
    
                System.out.println("\nBefehle: Neues Lernkarten-Stapel (n), Alle Decks anzeigen (a), Löschen (del), Update Deck-Name (u), Neue Karte hinzufügen (c), Beenden (e)");
                isWelcome = false;
            } else {
                System.out.println("\n-----------------------------------------------------------------------------");
                System.out.println("\nBefehle: Neues Lernkarten-Stapel (n), Alle Decks anzeigen (a), Löschen (del), Update Deck-Name (u), Neue Karte hinzufügen (c), Beenden (e)");
            }
            
            String input = scanner.nextLine().toLowerCase();
            input.toString(); // <= falls eine Zahl eingegeben worden ist, direkt zu einem String umwandeln
            
            if (input.startsWith("n")) {

                System.out.println("Gebe Deinem Lernkarten-Stapel einen Namen: ");
                String deckName = scanner.nextLine().toString().toLowerCase();

                try {
                    DataAccessLayer.addToCardDeck(InitDB.getConnection(), deckName);
                    System.out.println("Dein neuer Lernkarten-Stapel wurde hinzugefügt. " + deckName);
                    showCardDecks();

                } catch (Exception e) {
                    System.err.println("Fehler beim Hinzufügen. " + e.getMessage());
                }

            } else if (input.startsWith("a")) {
                showCardDecks();
            
            } else if (input.startsWith("e")) {
                System.out.println("Das Programm wird nun beendet. ");
                wantsExit = true;
            
            } else if (input.startsWith("del")) {
                System.out.println("Bitte gebe den Namen des zu löschenden Decks ein. ");
                String deckToDelete = scanner.nextLine().toString().toLowerCase();

                deleteCardDeck(deckToDelete);

            } else if (input.startsWith("u")) {

                System.out.println("Gebe den Namen des Decks ein, welches Du umbenennen möchtest.");
                String oldName = scanner.nextLine().toString();
                System.out.println("Gebe den neuen Namen für das Deck ein.");
                String newName = scanner.nextLine().toString();

                updateCardDeckName(oldName, newName);
            
            } else if (input.startsWith("c")) {
                addCard();
            } else if (input.startsWith("xx")) {
                DataAccessLayer.exportCardsToMarkdown(InitDB.getConnection());
            }
            
            else {
                System.out.println("Dieser Befehl ist nicht bekannt.");
            }

        }
        scanner.close();
    }

    private static void showCardDecks(){
        DataAccessLayer.retrieveAllCardDecks(InitDB.getConnection());
    }

    private static void deleteCardDeck(String deck_name){
        DataAccessLayer.deleteCardDeck(InitDB.getConnection(), deck_name);
    }

    private static void updateCardDeckName(String old_deck_name, String new_deck_name){
        DataAccessLayer.updateCardDeck(InitDB.getConnection(), old_deck_name, new_deck_name);
    }


    private static void addCard() {

        Scanner scanner = new Scanner(System.in);

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

        scanner.close();
    }


    /*
     * methode: deck auswählen und dann lernkarten dem deck zuordnen/erstellen
     * 
     * get selected deck name <= deck name wird als eingabeparameter übergeben
     * 
     * => db: card_id, deck_name, card_front, card_back -> erledigt
     * 
     * while loop um dann immer wieder neue karten hinzuzufügen, bis man keine mehr hinzufügen will.
     * 
     * 
     * 
     */


}
