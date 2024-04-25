execute(String sql):
    Verwendung für alle Arten von SQL-Anweisungen, einschließlich DDL-Anweisungen (Data Definition Language) wie CREATE, ALTER und DROP, DML-Anweisungen (Data Manipulation Language) wie INSERT, UPDATE und DELETE, und DQL-Anweisungen (Data Query Language) wie SELECT.

    "CREATE TABLE IF NOT EXISTS employees (id INT PRIMARY KEY, name VARCHAR(50))";

executeUpdate(String sql):
    Verwendung für DML-Anweisungen wie INSERT, UPDATE und DELETE, die eine Anzahl von betroffenen Zeilen zurückgeben.
    Geeignet für Anweisungen, die Daten in der Datenbank ändern.

    "INSERT INTO employees (id, name) VALUES (1, 'John')";

executeQuery(String sql):
    Verwendung für DQL-Anweisungen wie SELECT, die eine Ergebnismenge (ResultSet) zurückgeben.
    Geeignet für Abfragen, die Daten aus der Datenbank abrufen, aber keine Änderungen vornehmen.

    "SELECT * FROM employees";