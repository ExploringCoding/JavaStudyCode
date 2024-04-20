package Basics.DataTypes;

public class PrimitiveDataTypes {

    // primitive datentypen sind immer kleingeschrieben. => double, int und NICHT Double, Int...
    // Siehe auch Aufgaben ganz unten auf der Seite zu Legalität

    // beide schreibweise zur deklaration legal
    // <datentyp> <name> = <wert>;
    // <datentyp> <name>; // wert 0 und compiler zeigt fehler an!

    // BOOLESCHE UND CHAR PRIMITIVE TYPES ----------------------------------------------------------------
    
    // boolean - Wahrheitswerte => JVM-spezifisch true oder false
    public static void booleanTypes(){

        boolean isJavaFun = true;
        boolean isCodingEasy = false;

        if (isJavaFun){
            System.out.println("Java is fun!");
        } else {
            System.out.println("Java is not fun!");
        }

        if (isCodingEasy) {
            System.out.println("Coding is not hard!");
        } else {
            System.out.println("Coding is hard");
        }

    }

    // char - Character => 16 bits => 0 bis 65535
    public static void charType(){

        char grade = 'A';
        char firstLetter = 'J';
        char specialLetter = '@';

        System.out.println(grade);
        System.out.println(firstLetter);
        System.out.println(specialLetter);
    }


    // NUMERISCHE PRIMITIVE TYPES ----------------------------------------------------------------
    // int - Ganzzahlen => -128 bis 127
    public static void ganzzahlen(){

        // int zero;
        int age = 30;
        int numberOfStudents = 100;
        int sum = 10 + 20;

        System.out.println(age + numberOfStudents + sum); // addition
        System.out.println(age);
        System.out.println(numberOfStudents);
        System.out.println(sum);
        // System.out.println(zero); -> Fehler, da nicht mit einem Wert initialisiert.  
    }

    // long - Ganzzahlen => 64-Bit
    public static void longGanzzahlen(){

        long worldPopulation = 7800000000L; // Das "L" am Ende zeigt an, dass es sich um einen long-Wert handelt.
        long distanceToSun = 149600000000L;

        System.out.println(worldPopulation);
        System.out.println(distanceToSun);

    }

    // short - Ganzzahlen => 16 bits
    public static void shortGanzzahlen(){
        short population = 20000;
        short distanceInMeters = 1500;

        System.out.println(population);
        System.out.println(distanceInMeters);

    }

    // byte - Ganzzahlen => 8 bit
    public static void byteGanzzahlen(){
        byte numberOfSeats = 50;
        byte ageInYears = 25;

        System.out.println(numberOfSeats);
        System.out.println(ageInYears);

    }

    // double - Gleitkommazahlen => 64-Bits
    public static void double64(){

        double pi = 3.14; // => Variable
        final double PI = 3.14; // => Konstante
        double result = 5.0 / 2.0;

        System.out.println(pi + PI + result);
        System.out.println(pi);
        System.out.println(PI);
        System.out.println(result);
    }
    
    // float - Gleitkommazahlen => 32 bits
    public static void float32(){

        float weight = 65.5f; // Das "f" am Ende zeigt an, dass es sich um einen float-Wert handelt.
        float height = 1.75f;

        System.out.println(weight);
        System.out.println(height);
    }


    // DENKMUSTER ----------------------------------------------------------------
    public static void legaleExamples(){

        int x = 3;
        System.out.println(x);

        char initial = 'A';
        System.out.println(initial);

        double d = 456.709;
        System.out.println(d);

        boolean isLearning;
        isLearning = true;
        System.out.println(isLearning);

        int y = x + 456;
        System.out.println(y);

    }
    
    
    public static void legalLines(){

        //int x = 34.5; // ILLEGAL, da gleitkomma-wert nicht als int deklariert werden kann. TypeMismatch
        //boolean boo = x; // ILLEGAL
        //int g = 17; // LEGAL
        //int y = g; // LEGAL
        // y = y + 10; // LEGAL
        // short s; // LEGAL
        // s = y; // ILLEGAL
        // byte b = 3; // LEGAL
        // short n = 12; // LEGAL
        // byte k = 128; // ILLEGAL
    }
}
