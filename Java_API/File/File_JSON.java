package Java_API.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public class File_JSON {
    
    private static final Scanner scanner = new Scanner(System.in);

    // von json lesen
    public static String[] loadFromJSON(){

        // ggf. absoluten pfad angeben
        String filePath = "Java_API\\File\\words.json";

        // reader immer in try catch block
        try {
            
            FileReader fileReader = new FileReader(filePath);
            JSONTokener tokener = new JSONTokener(fileReader);
            JSONObject jsonObject = new JSONObject(tokener);

            // woerter aus json extrahieren
            JSONArray jsonArray = jsonObject.getJSONArray("words"); // <= referenziert das Objekt, nicht den dateinamen
            String[] words = new String[jsonArray.length()];

            // iteration um jedes wort zu extrahieren
            for (int i = 0; i < jsonArray.length(); i++){
                words[i] = jsonArray.getString(i);
                System.out.println(words[i].toLowerCase());
            }
            
            return words;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new String[0];
        }

    }

    // als json schreiben
    public static void writeToJSON(){

        try {
            
            // zweites json array in einem objekt
            JSONObject jsonObject = new JSONObject();
            JSONArray wordsArray = new JSONArray();
            wordsArray.put("Haus");
            wordsArray.put("Baum");
            wordsArray.put("Straße\nNeuer Absatz");
            jsonObject.put("woerter", wordsArray);

            // zweites json array in einem objekt
            JSONArray array2 = new JSONArray();
            array2.put("Apfel");
            array2.put("Tisch");
            array2.put("Stuhl");
            jsonObject.put("array2", array2);

            String filePath = "Java_API\\File\\woerter.json";

            FileWriter fileWriter = new FileWriter(filePath);
            fileWriter.write(jsonObject.toString(6)); // <== 4 = einrückung
            fileWriter.close();

            System.out.println("JSON-Objekt erfolgreich erstellt");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // einzelne wörter aus einem json array anzeigen lassen
    public static void displayWordsFromJSON(){

        final String FILE_PATH = "Java_API\\File\\woerter.json";
        

        try {
            FileReader fileReader = new FileReader(FILE_PATH);
            JSONTokener tokener = new JSONTokener(fileReader);
            JSONObject jsonObject = new JSONObject(tokener);

            JSONArray wordsArray = jsonObject.getJSONArray("woerter");

            for (int i = 0; i < wordsArray.length(); i++) {
                String word = wordsArray.getString(i);
                System.out.println(word);
                waitForEnter();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void waitForEnter() {
        System.out.println("Weiter per Konsole...");
        scanner.nextLine();
    }


    // jedes array einzeln anzeigen
    public static void displayArraysFromJSON() {
        final String FILE_PATH = "Java_API\\File\\woerter.json";

        try {
            FileReader fileReader = new FileReader(FILE_PATH);
            JSONTokener tokener = new JSONTokener(fileReader);
            JSONObject jsonObject = new JSONObject(tokener);

            for (String key : jsonObject.keySet()) {
                JSONArray jsonArray = jsonObject.getJSONArray(key);
                displayArray(jsonArray);
                waitForEnter();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void displayArray(JSONArray jsonArray) {
        for (int i = 0; i < jsonArray.length(); i++) {
            System.out.println(jsonArray.getString(i));
        }
    }
}
