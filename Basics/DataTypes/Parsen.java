package Basics.DataTypes;

public class Parsen {
    
    // REGEL:
    // von einer "Zahl oder Wahrheitswert" Integer/Double/etc.toString();
    // vom String in Zahl oder Wahrheitswert Integer/Double/etc.parseXX()

    public static void stringToInt(){
        String str = "42";
        int number = Integer.parseInt(str);
        System.out.println("Parsed Integer: " + number);
    }

    public static void stringToDouble(){
        String str = "3.14";
        double number = Double.parseDouble(str);
        System.out.println("Parsed Double: " + number);
    }

    public static void stringToBoolean(){
        String str = "true";
        boolean bool = Boolean.parseBoolean(str);
        System.out.println("Parsed Boolean: " + bool);
    }

    public static void intToString(){
        int number = 42;
        String str = Integer.toString(number);
        System.out.println("Parsed String: " + str);
    }

    public static void doubleToString(){
        double number = 3.14;
        String str = Double.toString(number);
        System.out.println("Parsed String: " + str);
    }

    public static void boolenToString(){
        boolean bool = true;
        String str = Boolean.toString(bool);
        System.out.println("Parsed String: " + str);
    }
}
