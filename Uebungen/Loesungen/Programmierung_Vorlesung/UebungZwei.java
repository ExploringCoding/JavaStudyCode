package Uebungen.Loesungen.Programmierung_Vorlesung;

import java.util.Scanner;

public class UebungZwei {
    
    public static void main(String[] args) {
        
        eins();
    }

    public static void eins(){

        Scanner scanner = new Scanner(System.in);
        int e1 = scanner.nextInt();
        int e2 = scanner.nextInt();
        int e3 = scanner.nextInt();

        if (e1 > e2 && e1 > e3){
            System.out.println("Erste Eingabe ist die größte: " + e1);

        } else if (e2 > e1 && e2 > e3){
            System.out.println("Zweite Eingabe ist die größte: " + e2);

        } else if (e3 > e2 && e3 > e1){
            System.out.println("Dritte Eingabe ist die größte: " + e3);

        } else {
            System.out.println("alle sind gleich");
        }


        scanner.close();
    }

    public static void eins_2(){

        Scanner scanner = new Scanner(System.in);
        int e1 = scanner.nextInt();
        int e2 = scanner.nextInt();
        int e3 = scanner.nextInt();

        int max = e1;

        if (e1 < e2){
            max = e2;
        } else if (max < e3){
            max = e3;
        }

        System.out.println("max: " + max);

        scanner.close();
    }

    public static void quadratischeGleichung(){

        
    }

    public static void zwei(){


    }
}
