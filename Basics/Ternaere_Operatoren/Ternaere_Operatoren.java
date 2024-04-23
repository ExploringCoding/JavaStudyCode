package Basics.Ternaere_Operatoren;

public class Ternaere_Operatoren {
    
    // maximales von zwei zahlen finden
    public static int max(int a, int b){
        return (a > b) ? a : b;
    }

    // prüfen, ob eine zahl gerade oder ungerade ist
    public static String geradeUngerade(int zahl){
        return (zahl % 2 == 0) ? "gerade" : "ungerade";
    }

    // umwandeln eines wertes in ein anderes format basierend auf einer bedingung
    public static String formatResults(boolean pass){
        return (pass) ? "Pass" : "Fail";
    }

    // umwandeln einer zeichenfolge in eine andere basierend auf einer bedingung
    public static String getGreeting(boolean isMorning){
        return (isMorning) ? "Guten Morgen" : "Hallo!";
    }

    // überprüfen, ob ein string leer ist oder nicht
    public static String checkEmpty(String str){
        return (str.isEmpty()) ? "String leer " : "String nicht leer";
    }

    // bestimmen ob eine zahl positiv, negativ oder null ist
    public static String checkSign(int number) {
        return (number > 0) ? "Positive" : (number < 0) ? "Negative " : "Null";
    }


}
