package Java_API.System;

public class Clear_Console {
    

    public static void main(String[] args) {
        System.out.println("text der weg ist");
        
        try {
            
            Thread.sleep(3000); // <= muss in try/catch
            
            clearConsole();
        
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 



    }


    private static void clearConsole(){

        try {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

            } else { // unix
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }

        } catch (final Exception e){
            System.out.println("Fehler beim Löschen der Konsole " + e.getMessage());
        }
    }
}
