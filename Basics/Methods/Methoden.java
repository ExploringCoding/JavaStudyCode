package Basics.Methods;

public class Methoden {
    
    // WICHTIG: in Java kann man nicht mehrere Rückgabetypen definieren. 
    // D.h. eine Methode kann nur einen Rückgabetyp haben.

    // methode gibt nichts zurück und hat keine parameter
    public static void methodeA(){
        System.out.println("diese methode hat keine rückgabe und keine parameter");
    }

    // methode gibt nichts zurück, hat aber einen parameter vom typ int
    public static void methodeB(int zahl){
        System.out.println("Der übergebene Wert ist: " + zahl);
    }

    // methode gibt einen wert vom typ int zurück, hat aber keine parameter
    public static int methodeC(){
        System.out.println("Diese methode hat keine Parameter, gibt aber einen Wert zurück");
        return 42; // aber nur mit print kann sichergestellt werden, dass dieser angezeigt wird. rückgabe muss sonst nicht in der konsole angezeigt werden.
    }

    // methode gibt einen Wert vom Typ int zurück und hat zwei Parameter vom Typ int
    public int methodeD(int a , int b){
        System.out.println("Die übergebenen Werte sind: " + a + " und " + b);
        return a + b;
    }

    // aufbau einer methode, die einen String und einen int zurückgibt. mithilfe eines arrays
    public Object[] methodeE(){
        String text = "Beispieltext";
        int zahl = 42;
        
        return new Object[] {text, zahl};
    }

    // aufbau einer methode, die einen String und einen int zurückgibt mithilfe eines Arrays durch Parameter in der Methoden-Signatur
    public static Object[] methodeF(String text, int zahl ){
        
        // System.out.println(text, zahl); <= The method println(int) in the type PrintStream is not applicable for the arguments (String, int)Java(67108979)
        String output = text + " " + zahl;
        System.out.println(output);
        return new Object[] {text, zahl};

    }

}
