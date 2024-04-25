package Schmierblatt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class mysql_test {
    
    public static void main(String[] args) {
        
        connectionDB();
    }

    private static void connectionDB(){

        // Verbindungsparameter
        String url = "jdbc:mysql://localhost:3306/java_db";
        String user = "root";
        String password = "sqlpasswort";

        // Verbindung herstellen
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("Verbindung zur MySQL-Datenbank erfolgreich hergestellt.");
            
            // Hier kannst du deine SQL-Abfragen ausführen
            // Beispiel: Statement statement = connection.createStatement();
            //          ResultSet resultSet = statement.executeQuery("SELECT * FROM deineTabelle");

            useDB(connection);
            createTable(connection);
            deleteTable(connection);


        } catch (SQLException e) {
            System.err.println("Fehler beim Herstellen der Verbindung zur MySQL-Datenbank: " + e.getMessage());
        }
    }

    private static void useDB(Connection connection){

        String sql = "USE java_db";

        try (Statement statement = connection.createStatement()) {
            // SQL-Anweisung ausführen, um den neuen Table zu erstellen
            statement.executeUpdate(sql);
            System.out.println("Table in USE erfolgreich.");
        } catch (SQLException e) {
            System.err.println("Fehler bei in USE des Tables: " + e.getMessage());
        }
    }

    private static void createTable(Connection connection) {
        // SQL-Anweisung zum Erstellen eines neuen Table
        String sql = "CREATE TABLE IF NOT EXISTS neuer_table (" +
                     "id INT AUTO_INCREMENT PRIMARY KEY," +
                     "name VARCHAR(255) NOT NULL)";

        // Verbindung herstellen
        try (Statement statement = connection.createStatement()) {
            // SQL-Anweisung ausführen, um den neuen Table zu erstellen
            statement.executeUpdate(sql);
            System.out.println("Table erfolgreich erstellt.");
        } catch (SQLException e) {
            System.err.println("Fehler beim Erstellen des Tables: " + e.getMessage());
        }
    }

    private static void deleteTable(Connection connection){

        String sql = "DROP table neuer_table";

        // Verbindung herstellen
        try (Statement statement = connection.createStatement()) {
            // SQL-Anweisung ausführen, um den neuen Table zu erstellen
            statement.executeUpdate(sql);
            System.out.println("Table erfolgreich gelöscht.");
        } catch (SQLException e) {
            System.err.println("Fehler beim löschen des Tables: " + e.getMessage());
        }
    }


}
