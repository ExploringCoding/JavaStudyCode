package Uebungen.Loesungen;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Loesungen_Kontroll_Strukturen {

    // zu A)
    public static void loesungA(){

        int zahl = 6;
        
        /* => DIESER LÖSUNGSWEG IST EBENFALLS KORREKT
        //zahl %= 2;
        if (zahl == 0){
            System.out.println("die zahl ist gerade");
        } else {
            System.out.println("die zahl ist ungerade");
        }
        */

        // ELEGANTERER WEG
        String ergebnis = (zahl % 2 == 0) ? "gerade" : "ungerade";
        System.out.println(ergebnis);
    }

    // zu B)
    public static void loesungB(){

        // scanner-objekt erstellen
        Scanner scanner = new Scanner(System.in);

        // altersabfrage
        System.out.println("gebe dein alter ein, um herauszufinden, ob du volljährig bist.");
        int alter = scanner.nextInt();
        scanner.close();
        
        // alter validieren
        if (alter >= 18){
            System.out.println("du bist volljährig");
        } else {
            System.out.println("du bist nicht volljährig");
        }

        // datums-objekt erstellen
        LocalDate datum = LocalDate.now();
        int jahr = datum.getYear();
        System.out.println(jahr);

        // geburtsjahr berechnen
        int geburtsjahr = jahr - alter - 1;
        System.out.println("Dein Geburtsjahr ist" + geburtsjahr);
    }

    // zu C)
    public static void loesungC(){

        // scanner objekt erstellen
        Scanner scanner = new Scanner(System.in);

        // abfrage der note durch nutzereingabe
        System.out.println("bitte gebe deine note ein. z.b. 4.0");
        String note = scanner.next();
        Double parsedToDouble = Double.parseDouble(note);

        if (parsedToDouble <= 4.0){
            System.out.printf("du hast bestanden mit deiner %f", parsedToDouble);
        } else {
            System.out.printf("mit einer %f hast du nicht bestanden.", parsedToDouble);
        }

        scanner.close();
    }

    // zu D)
    public static void loesungD(){

        // scanner objekt 
        Scanner scanner = new Scanner(System.in);

        // nutzereingabe
        System.out.println("bitte gebe eine ganzzahl ein wie z.b. 1, -10");
        String eingabe = scanner.next();
        Integer parsedEingabe = Integer.parseInt(eingabe);

        // validierung
        if (parsedEingabe > 0) {
            System.out.printf("die zahl %d ist positiv", parsedEingabe);
        } else {
            System.out.printf("die zahl %d ist negativ", parsedEingabe);
        }
        scanner.close();
    }

    public static void loesungE(){

        Scanner scanner = new Scanner(System.in);
        
        // variablen für seitenlängen
        System.out.println("gebe wert für a ein: ");
        String aRaw = scanner.next();
        double a = Double.parseDouble(aRaw);
        scanner.reset();

        System.out.println("gebe wert für b ein: ");
        String bRaw = scanner.next();
        double b = Double.parseDouble(bRaw);
        scanner.reset();

        System.out.println("gebe wert für c ein: ");
        String cRaw = scanner.next();
        double c = Double.parseDouble(cRaw);
        scanner.close();

        // validierung
        if (a == b && b == c){
            System.out.println("das dreieck ist gleichseitig");
        } else if (a == b || b == c || a == c){
            System.out.println("das dreieck ist gleichschenklich");
        } else {
            System.out.println("das dreieick ist ungleichseitig");
        }
    }

    public static void loesungF(){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("gebe irgendetwas ein");
        String input = scanner.nextLine();
        scanner.close();

        int inputLength = input.length() % 2;

        if (inputLength == 0) {
            System.out.printf("die zeichenlänge ist gerade. %d", inputLength);
        } else {
            System.out.printf("die zeichenlänge ist ungerade. %d", inputLength);
        }
    }

    public static void loesungG(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("gebe einen buchstaben ein, um herauszufinden, ob dieser ein vokal ist. ");
        String isVokal = scanner.next().toLowerCase();
        scanner.close();

        if (isVokal.equals("a") || isVokal.equals("e") || isVokal.equals("i") || isVokal.equals("o") || isVokal.equals("u")){
            System.out.printf("%s ist ein vokal", isVokal);
        } else {
            System.out.printf("%s ist kein vokal", isVokal);
        }
    }

    // zu H)
    public static void loesungH(){

        int i = 1;
        while (i <= 10){
            System.out.println(i);
            i++;
        }
    }

    // zu I)
    public static void loesungI(){

        int i = 0;
        while(i <= 20){
            System.out.println(i);
            i += 2;
        }
    }

    // zu J)
    public static void loesungJ(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("gebe den endwert ein. ");
        int n = scanner.nextInt(); // <= endwert
        int i = 0; //<= startwert
        int summe = 0; // <= zähler für summe
        
        while (i <= n) {
            summe += i; // Summe aktualisieren, indem i addiert wird
            System.out.println("Zwischenberechnung: Summe bis " + i + " beträgt: " + summe);
            i++; // Inkrementiere i für die nächste Zahl
        }

        scanner.close();
        System.out.println("Die Summe der Zahlen von 1 bis " + n + " beträgt: " + summe);
    }

    // zu K)
    public static void loesungK(){
        
        int i = 100;

        while(i > 0){
            System.out.println(i);
            i--;
        }
    }

    // zu L)
    public static void loesungL(){

        int startwert = 1;
        int endwert = 100;

        while (startwert <= endwert){
        
            boolean isBuzz = startwert % 3 == 0;
            boolean isFizz = startwert % 5 == 0;
            
            if (isFizz && isBuzz) {
                System.out.println("FizzBuzz");
            } else if (isFizz) {
                System.out.println("Fizz");
            } else if (isBuzz) {
                System.out.println("Buzz");
            } else {
                System.out.println(startwert);
            }
            startwert++;
        }
    }

    // zu M)
    public static void loesungM(){

        Scanner scanner = new Scanner(System.in);
        String name;

        do {
            System.out.println("Gebe Deinen Namen ein");
            name = scanner.next();

        } while(name.isEmpty());
        
        System.out.println("Hallo, " + name + "! Willkommen!");
        scanner.close();
    }

    // zu N)
    public static void loesungN(){

        Scanner scanner = new Scanner(System.in);
    
        String passwort;    
        boolean isCompatible;

        do {
            System.out.println("gebe ein passowrt ein. mindestens 6 zeichen");
            passwort = scanner.nextLine();
            isCompatible = passwort.length() >= 6;
            
        } while (!isCompatible);

        System.out.println("Dein Passwort: " + passwort);
        scanner.close();
    }

    // zu O)
    public static void loesungO(){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int zufallszahl;
        int eingabe;

        do {
            System.out.println("Gebe eine Zahl ein.");
            eingabe = scanner.nextInt();
            zufallszahl = random.nextInt(10);

            if (eingabe != zufallszahl){
                System.out.println("nochmal probieren");
            } else {
                System.out.println("Du hast die Zahl erraten");
            }

        } while(eingabe != zufallszahl);

        scanner.close();
    }

    // zu P)
    public static void loesungP(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("gebe ein wort ein");
        String wort = scanner.nextLine();
        int count = 0;

        for (int i = 0; i < wort.length(); i++){
            if (Character.isLetter(wort.charAt(i))) {
                count++;
            }
        }
        System.out.println("Das Wort \"" + wort + "\" hat " + count + " Buchstaben.");
        scanner.close();
    }

    // zu Q)
    public static void loesungQ(){

        Scanner scanner = new Scanner(System.in);
        String[] existierendeNutzernamen = {"user1", "user2", "user3"};
        System.out.println("gebe einen benutzernamen ein");
        String nutzername = scanner.nextLine();

        boolean isVerfügbar = true;

        for (String existierenderNutzername : existierendeNutzernamen){
            if (existierenderNutzername.equalsIgnoreCase(nutzername)){
                isVerfügbar = false;
                break;
            }
        }
        if (isVerfügbar){
            System.out.printf("verfügbar: %s", nutzername);
        } else {
            System.out.printf("nicht verfügbar: %s", nutzername);
        }
        scanner.close();
    }

    // zu R)
    public static void loesungR(){
        ArrayList<String> shoppingList = new ArrayList<>();
        shoppingList.add("Milch");
        shoppingList.add("Brot");
        shoppingList.add("Eier");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welche Artikel haben Sie bereits gekauft? (Trennen Sie die Artikel durch Kommas)");
        String input = scanner.nextLine();
        String[] boughtItems = input.split(",");
        
        for (String item : boughtItems) {
            shoppingList.remove(item.trim());
        }
        System.out.println("Die folgenden Artikel stehen noch auf Ihrer Einkaufsliste:");
        
        for (String item : shoppingList) {
            System.out.println(item);
        }
        scanner.close();
    }
}
