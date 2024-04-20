package Java_API.File;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_IO_Basics {
    
    // methode zum lesen aus einer datei => char/zeichen für char/zeichen
    public static void readFile(){

        try {
            
            FileReader reader = new FileReader("dateiname.txt");
            int character;
            while ((character = reader.read()) != -1){
                System.out.println((char) character);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Methode zum Lesen aus einer Datei zeilenweise
    public static void readFileB() {
        try {
            FileReader fileReader = new FileReader("ZUreadFileB.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    // Methode zum Schreiben in eine Datei - überschreibt bereits vorhandene Text
    public static void writeFile() {
        try {
            FileWriter writer = new FileWriter("ZUwriteFile.txt");
            writer.write("Jetzt wurde etwas geschrieben. Überschrieben");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Methode zum Schreiben in eine Datei, indem der bereits vorhandene Text nicht überschrieben wird
    public static void appendFile() {
        try {
            FileWriter writer = new FileWriter("ZUwriteFile.txt", true); // 'true' bedeutet, dass der Text an die Datei angehängt wird
            writer.write("\nHier wird neuer Text hinzugefügt, ohne den vorhandenen Text zu überschreiben.");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Methode zum Schreiben eines übergebenen Strings in eine Datei - überschreibt
    public static void writeStringToFile(String content) {
        try {
            FileWriter writer = new FileWriter("ZUwriteStringFile.txt");
            writer.write(content); // Schreiben des übergebenen Strings in die Datei
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Methode zum Schreiben eines übergebenen Strings in eine Datei, ohne den vorhandenen Text zu überschreiben
    public static void writeStringToFileB(String content) {
        try {
            FileWriter writer = new FileWriter("ZUwriteStringFile.txt", true); // 'true' bedeutet, dass der Text an die Datei angehängt wird
            writer.write("\n" + content); // Schreiben des übergebenen Strings in die Datei
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}