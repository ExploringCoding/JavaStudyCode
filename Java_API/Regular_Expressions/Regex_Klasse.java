package Java_API.Regular_Expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_Klasse {
    

    // überprüft, ob ein string dem muster entspricht
    public static void matchesA(){
        String text = "12345";
        boolean matches = text.matches("\\d+"); // Überprüft, ob der Text nur aus Zahlen besteht
        System.out.println("Matches: " + matches); // Ausgabe: true

    }

    // findet übereinstimmungen im text
    public static void findA(){
        String text = "The quick brown fox jumps over the lazy dog.";
        Pattern pattern = Pattern.compile("\\b\\w{3}\\b"); // Muster für Wörter mit 3 Buchstaben
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println("Word found: " + matcher.group()); // Ausgabe: The fox the dog
        }
    }

    // abrufen des texts, der der übereinstimmung entspricht
    public static void groupA(){
        String text = "The quick brown fox jumps over the lazy dog.";
        Pattern pattern = Pattern.compile("\\b\\w{3}\\b"); // Muster für Wörter mit 3 Buchstaben
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println("Word found: " + matcher.group()); // Ausgabe: The fox the dog
        }
    }

    // ersetzen aller übereinstimungen durch einen bestimmten text
    public static void replaceAllA(){
        String text = "The quick brown fox jumps over the lazy dog.";
        String replaced = text.replaceAll("\\b\\w{3}\\b", "WORD"); // Ersetzt alle 3-Buchstaben-Wörter
        System.out.println("Replaced: " + replaced); // Ausgabe: The quick brown WORD jumps over the lazy WORD
    }

    // teilen eines strings anhand eines musters
    public static void splitA(){
        String text = "apple,banana,orange";
        String[] parts = text.split(","); // Teilt den Text an Kommas
        for (String part : parts) {
            System.out.println("Fruit: " + part); // Ausgabe: apple banana orange
        }
    }

    // escapen von sonderzeichen in einem text
    public static void escapeA(){
        String text = "(abc.def)";
        String escaped = Pattern.quote(text); // Escaped Sonderzeichen für regelmäßigen Ausdruck
        System.out.println("Escaped: " + escaped); // Ausgabe: \(abc\.def\)
    }

    // abrufen des startindex der übereinstimmung
    public static void startA(){
        String text = "The quick brown fox jumps over the lazy dog.";
        Pattern pattern = Pattern.compile("fox");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            System.out.println("Start index: " + matcher.start()); // Ausgabe: 16
        }
    }

    // abrufen eines endindex der übereinstimmung
    public static void endA(){
        String text = "The quick brown fox jumps over the lazy dog.";
        Pattern pattern = Pattern.compile("fox");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            System.out.println("End index: " + matcher.end()); // Ausgabe: 19
        }
    }

    // überprüfen, ob das muster am anfang des texts übereinstimmt
    public static void lookingAtA(){
        String text = "apple banana orange";
        Pattern pattern = Pattern.compile("apple");
        Matcher matcher = pattern.matcher(text);
        boolean lookingAt = matcher.lookingAt();
        System.out.println("Looking at: " + lookingAt); // Ausgabe: true
    }

    // zurücksetzen des matcher-zustands für erneute verwendung
    public static void resetA(){
        String text = "The quick brown fox jumps over the lazy dog.";
        Pattern pattern = Pattern.compile("fox");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            System.out.println("First match: " + matcher.group()); // Ausgabe: fox
            matcher.reset(); // Zurücksetzen des Zustands
            if (matcher.find()) {
                System.out.println("Second match: " + matcher.group()); // Ausgabe: fox
            }
        }
    }
}
