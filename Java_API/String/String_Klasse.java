package Java_API.String;

import java.util.Locale;

/*
 * Formatierungsoptionen:
 * %s = String
 * %c = Char
 * %d = Zahl als Dezimalzahl
 * %x = Zahl als Hexzahl
 * %f = Gleitkommazahl
 * %% = Prozentzeichen
 */

 // NICHT VERGESSEN: in der IT fängt man an bei 0 zu zählen und Leerzeichen haben auch eine Position im Index!

public class String_Klasse {
    

    // formartierung eines zeichenkette mittels .format()
    public static void formatStringA(){

        String formattierterString = String.format("Hallo, %s! Das ist ein Beispiel für %d %s.", "Coder", 3, "Parameter");
        System.out.println(formattierterString);
    }

    // verwendung von format mit einer bestimmten locale
    public static void formatStringB(){

        @SuppressWarnings(value = { "", "deprecation" }) // siehe grund bei unten stehender zeile
        Locale localeDeutsch = new Locale("de", "DE"); // <= ab java 21 deprecated. 
        String formattierterString = String.format(localeDeutsch ,"Das ist ein Beispiel: %d %s", 42, "Beispiel");
        System.out.println(formattierterString);
    }

    // verwendung von .formatted()
    public static void formatStringC(){

        String formattedString = "Das ist ein Beispiel: %d %s".formatted(42, "Beispiel");
        System.out.println(formattedString);
    }

    // .join()
    public static void joinA() {

        // array von zeichenfolgeelementen
        String[] elemente = {"Apfel", "Banane", "Kirsche"};

        // verbinden der elemente mit einem trennzeichen
        String result = String.join(", ", elemente);
        System.out.println(result);
    }
    
    // .toLowerCase()
    public static void toLowerCaseA(){
        String str = "Hallo, Welt";
        String lowerCaseStr = str.toLowerCase();
        System.out.println(lowerCaseStr);
    }

    // .toUpperCase
    public static void toUpperCaseA(){
        String str = "Hallo, Du";
        String upperCaseStr = str.toUpperCase();
        System.out.println(upperCaseStr);
    }

    // .trim()
    public static void trimA(){
        String str = "Hallo, Du        ";
        String trimmedStr = str.trim();
        System.out.println(trimmedStr);
    }

    // .startsWith()
    public static void startsWithA(){
        String str = "Hallo, Du";
        boolean startsWith = str.startsWith("Hallo");
        System.out.println(startsWith);
    }

    // .endsWith()
    public static void endsWithA(){
        String str = "Hallo, Du";
        boolean endsWith = str.endsWith("Du");
        System.out.println(endsWith);
    }

    // .contains()
    public static void containsA(){
        String str = "Hallo, Du";
        boolean contains = str.contains("Du");
        System.out.println(contains);
    }

    // .charAt()
    public static void charAtA(){
        String str = "Hallo, Du";
        char charAt = str.charAt(4);
        System.out.println(charAt);
    }

    // .length()
    public static void lengthA(){
        String str = "Hallo, Du";
        int length = str.length();
        System.out.println("länge des strings: " + length);
    }

    // .isEmpty()
    public static void isEmptyA(){
        String str = "Hallo, Welt";
        boolean isEmpty = str.isEmpty();
        System.out.println("ist der string leer? " + isEmpty);
    }

    // .indexOf
    public static void indexOfA() {
        String str = "Java ist eine Programmiersprache";
        int index = str.indexOf("e");
        System.out.println("Index des ersten 'e': " + index);
    }

    // .lastIndexOf
    public static void lastIndexOfA() {
        String str = "Java ist eine Programmiersprache";
        int lastIndex = str.lastIndexOf("e");
        System.out.println("Index des letzten 'e': " + lastIndex);
    }

    // .split()
    public static void splitA() {
        String str = "Java ist eine Programmiersprache";
        String[] splitArray = str.split(" ");
        System.out.println("Split-Array:");
        for (String s : splitArray) {
            System.out.println(s);
        }
    }

    // .insert()
    public static void insertA() {
        // Z = 0, Leerzeichen zählt auch mit und offset 14 ist nach dem &
        StringBuffer stringBuffer = new StringBuffer("Zwischen mir & mir wird es eingefügt");
        stringBuffer.insert(14, " (Hallo) ", 0, 8);
        System.out.println(stringBuffer); 
    }

    // .substring() => kürzung eines String
    public static void substringA(){

        StringBuffer stringBuffer = new StringBuffer("Hallo, Welt");
        String substring = stringBuffer.substring(0, 5);
        System.out.println(substring);
    }

    // .replace()
    public static void replaceA(){

        StringBuffer stringBuffer = new StringBuffer("Hallo, Welt");
        stringBuffer.replace(7, 12, "Java");
        System.out.println(stringBuffer);
    }

    // .concat()
    public static void concatA(){
        String str1 = "Hallo, ";
        String str2 = "DUU";

        // konkatenation der beiden String
        String ergebnis = str1.concat(str2);
        System.out.println(ergebnis);
    }

    // .compareTo()
    public static void compareToA(){

        String str1 = "apfel";
        String str2 = "banane";

        // vergleichen => lexographisch
        int ergebnis = str1.compareTo(str2);

        if (ergebnis < 0){
            System.out.println(str1 + " kommt vor " + str2);
        } else if (ergebnis > 0){
            System.out.println(str1 + " kommt nach " + str2);
        } else {
            System.out.println(str1 + " ist gleich zu " + str2);
        }
    }

    // .contentEquals()
    public static void contentEqualsA(){

        String str1 = "Java";
        StringBuilder str2 = new StringBuilder("Java");

        boolean contentEquals = str1.contentEquals(str2);

        if (contentEquals){
            System.out.println("Die Inhalte stimmen überein");
        } else {
            System.out.println("die inhalte stimmen nicht überein");
        }
    }

}
