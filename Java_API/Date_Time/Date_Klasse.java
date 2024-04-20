package Java_API.Date_Time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date_Klasse {
    

    // aktuelle datum erhalten
    public static void aktuellesDatum(){
        LocalDate datum = LocalDate.now();
        System.out.println(datum);
    }

    // teile eines datums erhalten
    public static void teileDatum(){

        LocalDate datum = LocalDate.now();

        int jahr = datum.getYear();
        int monat = datum.getMonthValue();
        int tag = datum.getDayOfMonth();

        System.out.println(jahr);
        System.out.println(monat);
        System.out.println(tag);
    }

    // ein bestimmtes datum erstellen
    public static void spezifischesDatum(){
        LocalDate spezDatum = LocalDate.of(2024, 10, 1);
        System.out.println(spezDatum);

    }

    // datum aus einem String parsen
    public static void parseStringDatum(){
        String datumAlsString = "2024-12-01";
        LocalDate parsedDatum = LocalDate.parse(datumAlsString);
        System.out.println(parsedDatum);
    }

    // datum formatieren
    public static void formatierenDatum(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate datum = LocalDate.now();
        String formartiertesDatum = datum.format(formatter);
        System.out.println(formartiertesDatum);
    }
}
