package Java_API.Scanner;

import java.util.Scanner;

public class Scanner_Klasse {
    
    // string
    public static void scannerString(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("gebe deinen namen ein : ");
        String name = scanner.nextLine();
        System.out.println(name);
        scanner.close(); // <= in java, muss der scanner nach der nutzung IMMER geschlossen werden
    }

    // Kurze Zeichenfolge
    public static void scannerShortString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib eine kurze Zeichenfolge ein: ");
        String text = scanner.next(); // Liest nur das erste Wort
        System.out.println("Du hast '" + text + "' eingegeben.");
        scanner.close();
    }

    // int
    public static void scannerInt(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gebe eine Zahl ein: ");
        int zahl = scanner.nextInt();
        System.out.println(zahl);
        scanner.close();
    }

    // double
    public static void scannerDouble(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("gebe eine fließkommazahl ein: ");
        double zahl = scanner.nextDouble();
        System.out.println(zahl);
        scanner.close();
    }

    // boolean
    public static void scannerBoolean() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib true oder false ein: ");
        boolean wert = scanner.nextBoolean();
        System.out.println("Du hast " + wert + " eingegeben.");
        scanner.close();
    }

    // Zeichen
    public static void scannerChar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib ein einzelnes Zeichen ein: ");
        char zeichen = scanner.next().charAt(0);
        System.out.println("Du hast das Zeichen '" + zeichen + "' eingegeben.");
        scanner.close();
    }

    // Überprüfung, ob Eingabe vorhanden ist
    public static void scannerHasNext() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib eine Zeichenfolge ein (oder drücke Enter, um zu beenden): ");
        if (scanner.hasNext()) {
            String text = scanner.nextLine(); // <= konvertiert z.b. int in einem string automatisch
            System.out.println("Du hast '" + text + "' eingegeben.");
        } else {
            System.out.println("Keine Eingabe erkannt.");
        }
        scanner.close();
    }

    // SICHERSTELLEN, DAS EIN INT EINGEGEBEN WIRD Überprüfung, ob Eingabe vorhanden ist mit überspringen einer ungültigen Eingabe
    public static void scannerHasNextINT() {
        Scanner scanner = new Scanner(System.in);
        boolean korrekteEingabe = false;

        while (!korrekteEingabe) {
            System.out.println("Gib eine Zeichenfolge ein (oder drücke Enter, um zu beenden): ");
            if (scanner.hasNextInt()) {
                int zahl = scanner.nextInt();
                System.out.println("Du hast die Zahl '" + zahl + "' eingegeben.");
                korrekteEingabe = true;
            } else {
                System.out.println("Keine gültige Eingabe erkannt. Bitte versuche es erneut.");
                scanner.nextLine(); // Überspringe ungültige Eingabe
            }
        }

        scanner.close();
    }
    
}
