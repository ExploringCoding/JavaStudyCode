package Basics.Methods;

// Siehe auch Datenbank-Simulation: Methods => ParameteruebergabeBeiMethoden.java

public class ParameteruebergabeBeiMethoden {
    
    // Methode mit Wertübertragung
    private static void wertuebergabe(int zahl){

        zahl *= 2;
        System.out.println("Wert innerhalb der Methode (nach Verdoppelung): " + zahl);
    }

    // Methode mit Referenzübertragung
    private static void referenzuebergabe(int[] array){

        for (int i = 0; i < array.length; i++) {

            array[i] *= 2;
        }
        System.out.println("Array innerhalb der Methode (nach Verdoppelung): ");
        
        for (int num : array){
            System.out.println(num + " ");
        }
        System.out.println();
    }

    // Methode zum Aufruf anderer Methoden mit Parameterübergabe
    public static void methodenAufruf() {
        int zahl = 5;
        System.out.println("Wert vor Aufruf der Methode: " + zahl);
        wertuebergabe(zahl);
        System.out.println("Wert nach Aufruf der Methode: " + zahl);

        int[] array = {1, 2, 3, 4, 5};
        System.out.print("Array vor Aufruf der Methode: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        referenzuebergabe(array);
        System.out.print("Array nach Aufruf der Methode: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
