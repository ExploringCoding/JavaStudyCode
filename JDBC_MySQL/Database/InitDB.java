package JDBC_MySQL.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InitDB {
    
    private static Connection connection;

    public static Connection getConnection() {
        return connection;
    }

    public static void connectionToDB(){

        // Verbindungsparameter
        // DO - NOCH IN .ENV DATEI EINFÜGEN
        String url = "jdbc:mysql://localhost:3306/java_db?useUnicode=true&characterEncoding=UTF-8";
        String user = "root";
        String password = "sqlpasswort";

        String sql = "CREATE DATABASE IF NOT EXISTS java_db";

        try {
            connection = DriverManager.getConnection(url, user, password);
            
            System.out.println("Verbindung zum MySQL-Server erfolgreich hergestellt.");
            
            try {
                Statement statement = connection.createStatement();
                statement.execute(sql);

                // Methoden, die pro Verbindung ausgeführt werden sollen.
                useDB();
                createUserTable();
                createCardDecksTable();
                createCardTable();

            } catch (SQLException e) {
                System.err.println("Fehler beim prüfen, ob Datenbank erstellt oder bereits vorhanden ist. " + e.getMessage());
            }

        } catch (SQLException e) {
            e.getErrorCode();
            System.err.println("Fehler beim Herstellen der Verbindung zum MySQL-Server: " + e.getMessage());
        }
    }

    private static void useDB(){

        String sql = "USE java_db";

        try (Statement statement = connection.createStatement()) {
            
            statement.execute(sql);
            //System.out.println("USE wurde erfolgreich angewendet");
        } catch (SQLException e) {
            System.err.println("Fehler bei der Verwendung von USE: " + e.getMessage());
        }
    }

    private static void createUserTable(){

        String sql = "CREATE TABLE IF NOT EXISTS user_table (" +
                     "id INT AUTO_INCREMENT PRIMARY KEY," +
                     "name VARCHAR(255) NOT NULL)";

        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(sql);
            //System.out.println("Table: user_table wurde erfolgreich erstellt");
        } catch (SQLException e) {
            System.err.println("Fehler bei der Erstellung des Table user_table " + e.getMessage());
        }
    }

    private static void createCardDecksTable(){

        String sql = "CREATE TABLE IF NOT EXISTS card_decks (" +
                    "deck_id INT AUTO_INCREMENT PRIMARY KEY," +
                    "deck_name VARCHAR(255) NOT NULL)";

        try (Statement statement = connection.createStatement()) {
            
            statement.executeUpdate(sql);
            //System.out.println("card_deck table wurde erstellt.");

        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Fehler bei der Erstellung des card_deck table: " + e.getMessage());
        }
    }

    private static void createCardTable(){

        String sql = "CREATE TABLE IF NOT EXISTS cards (" +
        "card_id INT AUTO_INCREMENT PRIMARY KEY," +
        "deck_name VARCHAR(255) NOT NULL," +
        "card_front VARCHAR(255) NOT NULL," +
        "card_back VARCHAR(255) NOT NULL)";

        try (Statement statement = connection.createStatement()) {
            
            statement.executeUpdate(sql);
            //System.out.println("cards table hinzugefügt");

        } catch (SQLException e) {
            System.err.println("Fehler beim hinzufügen der Lernkarte. " + e.getMessage());
        }
    }

    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Verbindung zur Datenbank erfolgreich geschlossen.");
            } catch (SQLException e) {
                System.err.println("Fehler beim Schließen der Verbindung zur Datenbank: " + e.getMessage());
            }
        }
    }
}
