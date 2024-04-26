package JDBC_MySQL.Database;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;




public class DataAccessLayer {
    
    // Anki Clone
    
    // card decks hinzufuegen
    public static void addToCardDeck(Connection connection, String deck_name){

        String sql = "INSERT INTO card_decks (deck_name) VALUES ('" + deck_name + "')";

        try (Statement statement = connection.createStatement()) {
            
            statement.executeUpdate(sql);
            System.out.printf("\n%s wurde erfolgreich erstellt.", deck_name);

        } catch (SQLException e) {
            System.err.printf("Fehler bei der Erstellung des Decks %s. ", deck_name + " " + e.getMessage());
        }
    }


    // card decks aus der datenbank ziehen
    public static List<String> retrieveAllCardDecks(Connection connection){

        List<String> deckList = new ArrayList<>();
        
        String sql = "SELECT deck_name FROM card_decks";

        try (Statement statement = connection.createStatement(); ResultSet resultSet = statement.executeQuery(sql)) {

            while (resultSet.next()){
                String name = resultSet.getString("deck_name"); // column name
                deckList.add(name);
                System.out.println("----------------------------------");
                System.out.println("Lernkarten-Stapel | " + name + "");
            }

        } catch (SQLException e) {
            System.err.println("Fehler beim Abrufen der Daten: " + e.getMessage());
        }

        return deckList;
        
    }

    // card deck löschen
    public static void deleteCardDeck(Connection connection, String deck_name) {
        try {
            
            if (deckExists(connection, deck_name)) {
                
                String sql = "DELETE FROM card_decks WHERE deck_name = '" + deck_name + "'";
                
                try (Statement statement = connection.createStatement()) {
                    statement.executeUpdate(sql);
                    System.out.printf("\n %s wurde erfolgreich gelöscht.", deck_name);
                }
            
            } else {
                System.out.println("Das Deck mit dem Namen '" + deck_name + "' existiert nicht.");
            }
        
        } catch (SQLException e) {
            System.err.println("Fehler bei der Löschung: " + e.getMessage());
        }
    }
    // helper methode für card deck löschen und card deck name update - Prüf-Methode, ob Eintrag in db vorhanden ist
    private static boolean deckExists(Connection connection, String deck_name) throws SQLException {
        
        String sql = "SELECT COUNT(*) AS count FROM card_decks WHERE deck_name = '" + deck_name + "'";
        
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
                
            resultSet.next();
        
            int count = resultSet.getInt("count");
            return count > 0;
        }
    }
    
    // card deck name update
    public static void updateCardDeck(Connection connection, String old_deck_name, String new_deck_name) {
        try {
            
            // einsatz helper methode, um zu checken ob deck existiert
            if (deckExists(connection, old_deck_name)) {
                
            
                String sql = "UPDATE card_decks SET deck_name = '" + new_deck_name + "' WHERE deck_name = '" + old_deck_name + "'";
                
                try (Statement statement = connection.createStatement()) {
                    statement.executeUpdate(sql);
                    System.out.printf("\nDer Karteikartenstapel '%s' wurde erfolgreich in '%s' umbenannt.", old_deck_name, new_deck_name);
                }
            
            } else {
                
                System.out.println("Das Deck mit dem Namen '" + old_deck_name + "' existiert nicht.");
            }
        
        } catch (SQLException e) {
            
            System.err.println("Fehler bei der Aktualisierung: " + e.getMessage());
        }
    }

    // lernkarte hinzufügen
    public static void addCard(Connection connection, String deck_name, String card_front, String card_back){
        
        String sql = "INSERT INTO cards (deck_name, card_front, card_back) VALUES ('" + deck_name + "', '" + card_front + "', '" + card_back + "')";
        
        try (Statement statement = connection.createStatement()) {
            
            statement.executeUpdate(sql);
            System.out.println("Lernkarte hinzugefügt.");

        } catch (SQLException e) {
            System.err.println("Fehler beim Hinzufügen der Lernkarte");
        }
    
    }

    // einfache export funktion als markdown, txt. 
    // excel, word, pdf gehen mit apache poi. muss aber ein build tool wie maven oder gradle projekt sein, wegen dependencys und library management.
    public static void exportCardsToMarkdown(Connection connection) {

        // SQL-Abfrage zum Abrufen der Karten
        String sql = "SELECT * FROM cards";

        // Pfad für den Download-Ordner
        String downloadFolderPath = System.getProperty("user.home") + "/Downloads";
        // "C:\Users\nenni\Downloads"
        
        // Dateipfad für die CSV-Datei
        String filePath = downloadFolderPath + "/cards.md";

        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql);
             FileWriter writer = new FileWriter(filePath)) {

            // Header
            //writer.append("Card_ID | Deck_Name | Card_Front | Card_Back\n");

            // Daten aus der Abfrage in die Datei schreiben
            while (resultSet.next()) {
                int cardId = resultSet.getInt("card_id");
                String deckName = resultSet.getString("deck_name");
                String cardFront = resultSet.getString("card_front");
                String cardBack = resultSet.getString("card_back");

                // Datenzeile in Format schreiben
                writer.append(String.format("# Card_ID: %d & Deck_Name: %s \n Card_Front: %s \n Card_Back: %s \n\n", cardId, deckName, cardFront, cardBack));
            }

            System.out.println("Die Karten wurden erfolgreich in die Markdown-Datei im Downloads-Ordner exportiert.");

        } catch (SQLException | IOException e) {
            System.err.println("Fehler beim Exportieren der Karten: " + e.getMessage());
        }
    }

}