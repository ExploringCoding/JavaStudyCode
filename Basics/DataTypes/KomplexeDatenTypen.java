package Basics.DataTypes;

import java.util.ArrayList; // für arrayList
import java.util.Arrays; // für arrays im allgemeinen
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class KomplexeDatenTypen {
    

    // String => repräsentieren eine Sequenz von Zeichen 
    public static void stringDatenTyp(){

        String message = "Hello, World.";
        String name = "Alice";

        System.out.println(message);
        System.out.println(name);
    }

    // Arrays => speicherung mehrerer elemente des gleichen datentyps in einer einzigen variable
    public static void arraysDatenTyp(){

        int[] number = {1,2,3,4,5};
        String[] names = {"Alice", "Bob", "Charlie"};

        System.out.println(Arrays.toString(number)); // vor dem print eines arrays muss dieser erst als String konvertiert werden
        System.out.println(Arrays.toString(names));

        // ausgabe ohne toString sieht wie folgt aus: [I@78dd667e
        // [ zeigt an, dass es sich um ein array handelt
        // I zeigt an, dass es sich um ein array von ganzzahlen handelt
        // @78dd667e zeigt den Hashcode des arrays an

    }

    // ArrayList => dynamische Liste, die elemente verschiedener datentypen speichern kann
    public static void arrayList(){

        // arraylist mit datentyp int
        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.add(10);
        numbersList.add(20);
            //System.out.println(String.valueOf(numbersList)); // andere möglichkeit um es als String anzeigen zu lassen
        System.out.println(numbersList);

        // arraylist mit datentyp String
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Alice");
        stringList.add("Bob");
        System.out.println(stringList);

        // arraylist mit datentyp double
        ArrayList<Double> doubleList = new ArrayList<>();
        doubleList.add(3.14);
        doubleList.add(1.2);
        System.out.println(doubleList);

    }

    // HashMap => datenstruktur, die schlüssel-wert-paare speichert und für schnelle suchvorgänge optimiert ist
    public static void hashMap(){

        HashMap<String, Integer> ageMap = new HashMap<>();
        ageMap.put("Alice", 20);
        ageMap.put("Bob", 25);
        
        System.out.println(ageMap);
    }

    // HashSet => datenstruktur, die eine sammlung von eindeutigen Elementen ohne Duplikate speichert
    public static void hashSet(){

        HashSet<String> nameList = new HashSet<>();
        nameList.add("Alice");
        nameList.add("Bob");

        System.out.println("hashset " + nameList);
    }

    // Queue => datenstruktur, die elemente in der reihenfolge ihres hinzufügens speichert und für die verwendung in warteschlangen geeignet ist. 
    public static void queue(){
        Queue<String> waitingQueue = new LinkedList<>();
        waitingQueue.add("Alice");
        waitingQueue.add("Bo");

        System.out.println(waitingQueue);
    }

    // stack => datenstruktur, die nach dem Prinzip last in first out (lifo) funktioniert und für die verwendung in stapeln geeignet ist
    public static void stack(){

        Stack<String> browserHistory = new Stack<>();
        browserHistory.push("https://www.google.com");
        browserHistory.push("https://www.openai.com");  

        System.out.println(browserHistory);
    }
}
