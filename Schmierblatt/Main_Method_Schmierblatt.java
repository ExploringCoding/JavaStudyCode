package Schmierblatt;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_Method_Schmierblatt {
    
    private ArrayList<String> datenbank = new ArrayList<>();

    public static void main(String[] args) {
        
        Main_Method_Schmierblatt m = new Main_Method_Schmierblatt();
        
        boolean wantExit = false;
        Scanner scanner = new Scanner(System.in);

        while(!wantExit){

            System.out.println("Welche Aktion soll durchgeführt werden? => Add, Show All, Exit");
            String aktion = scanner.nextLine().toLowerCase();
            

            if (aktion.equals("add")){
                
                System.out.println("Bitte eingeben was hinzugefügt werden soll.");
                String eintrag = scanner.nextLine().toLowerCase();
            
                m.add_Datenbank(eintrag);

            } else if (aktion.equals("show all")){
                m.showAll_Datenbank();

            } else if (aktion.equals("exit")) {
                System.out.println("Programm wird beendet");
                wantExit = true;
            } else if (aktion.equals("remove")){
                System.out.println("Welcher eintrag soll gelöscht werden?");
                m.showAll_Datenbank();
                String toDelete = scanner.nextLine();
                m.dynamicRemove(toDelete);
            } else {
                System.out.println("Ungültige Aktion. Bitte erneut eingeben.");
            }
             
        }

        scanner.close();
    }

    // anzeigen der gesamten datenbank
    private void showAll_Datenbank(){

        if (datenbank.isEmpty()){
            System.out.println("Es gibt keine Einträge in der Datenbank");
        } else {
            System.out.println("ALLE EINTRÄGE");
            for (int index = 0; index < datenbank.size(); index++){
            System.out.println("Index " + index + ": " + datenbank.get(index));
        }
        }
    }

    // dinge zur datenbank hinzufügen
    private void add_Datenbank(String eintrag){

        System.out.println("Hinzugefügt wurde: " + eintrag);
        datenbank.add(eintrag);
    }  

    public void dynamicRemove(String removeEintrag){

        int index = -1;

        for (int i = 0; i < datenbank.size(); i++){

            if (datenbank.get(i).equals(removeEintrag)){
                index = i;
                break;
            }
        }

        // Überprüfe, ob der Datensatz gefunden wurde
        if (index != -1) {
            System.out.println("Lösche Datensatz '" + removeEintrag + "' an Index " + index);
            datenbank.remove(index); // Lösche den Datensatz an der gefundenen Position
        } else {
            System.out.println("Datensatz '" + removeEintrag + "' nicht gefunden.");
        }
    }

    


}
