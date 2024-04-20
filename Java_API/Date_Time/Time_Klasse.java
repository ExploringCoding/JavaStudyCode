package Java_API.Date_Time;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time_Klasse {
    
    // Aktuelle Zeit erhalten
    public static void aktuelleZeit() {
        LocalTime zeit = LocalTime.now();
        System.out.println("Aktuelle Zeit: " + zeit);
    }

    // Eine bestimmte Zeit erstellen
    public static void spezifischeZeit() {
        LocalTime spezZeit = LocalTime.of(13, 30, 0);
        System.out.println("Spezifische Zeit: " + spezZeit);
    }

    // Zeit aus einem String parsen
    public static void parseStringZeit() {
        String zeitAlsString = "12:45";
        LocalTime parsedZeit = LocalTime.parse(zeitAlsString);
        System.out.println("Geparste Zeit: " + parsedZeit);
    }

    // Zeit formatieren
    public static void formatierenZeit() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime zeit = LocalTime.now();
        String formatierteZeit = zeit.format(formatter);
        System.out.println("Formatierte Zeit: " + formatierteZeit);
    }
}
