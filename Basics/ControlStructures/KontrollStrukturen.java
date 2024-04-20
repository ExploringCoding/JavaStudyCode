package Basics.ControlStructures;

public class KontrollStrukturen {
    
    // if
    public static void ifStatement(){

        int zahl = 10;

        if (zahl > 0) {
            System.out.println("Die Zahl ist positiv.");
        }
    }

    // if-else
    public static void ifElseStatement(){

        int zahl = 10;
        if (zahl % 2 == 0){
            System.out.println("ist gerade");
        } else {
            System.out.println("ist ungerade");
        }
    }

    // if-else else-if 
    public static void elseIfStatement(){

        int zahl = 10;
        if (zahl > 0){
            System.out.println("positiv");
        } else if (zahl < 0){
            System.out.println("negativ");
        } else {
            System.out.println("zahl ist null");
        }
    }

    // while schleife
    public static void whileSchleife(){

        int i = 0;
        while (i < 0){
            System.out.println("schleifendurchlauf #" + i);
            i++;
        }
    }

    // do-while schleife
    public static void doWhileSchleife(){

        int j = 0;
        do {
            System.out.println("Schleifendurchlauf #" + j);
            j++;
        } while (j < 5);
    }

    // for schleife
    public static void forSchleife(){
        for (int k = 0; k < 5; k++) {
            System.out.println("Schleifendurchlauf #" + k);
        }
    }

    // for-each schleife (für arrays und collections)
    // ABER: kann keine Indexierung einzelner Elemente vornehmen. d.h. eintrag + index nicht möglich.
    public static void forEachSchleife(){

        int[] zahlenArray = {1, 2, 3, 4, 5};
        for (int zahl : zahlenArray) {
            System.out.println("Zahl: " + zahl);
        }  
    }
}
