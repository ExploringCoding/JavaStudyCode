package Generics;

import java.util.ArrayList;
import java.util.List;

// Eine generische Klasse mit einem Typparameter T
class Box<T> {
    private T content;

    // Eine generische Methode, die zwei generische Elemente vergleicht und das kleinere zurückgibt
    public static <T extends Comparable<T>> T min(T a, T b) {
        return a.compareTo(b) < 0 ? a : b;
    }

    // Eine generische Methode, die eine Liste von Elementen akzeptiert und ihren Durchschnitt berechnet
    public static double average(List<? extends Number> numbers) {
        double sum = 0.0;
        for (Number num : numbers) {
            sum += num.doubleValue();
        }
        return sum / numbers.size();
    }

    // Eine Methode, die eine Liste von Elementen akzeptiert und Zahlen von 1 bis 10 hinzufügt
    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
    }

    // Eine Methode, die den Inhalt der Box zurückgibt
    public T get() {
        return content;
    }

    // Eine Methode, die den Inhalt der Box setzt
    public void set(T content) {
        this.content = content;
    }
}

public class GenericsExample {
    public static void main(String[] args) {
        // Verwendung der generischen Klasse Box mit Integer-Typ
        Box<Integer> intBox = new Box<>();
        intBox.set(42);
        System.out.println("Inhalt der Box: " + intBox.get());

        // Verwendung der generischen Methode min
        System.out.println("Kleineres Element: " + Box.min(10, 20));

        // Verwendung der generischen Methode average
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(2.0);
        doubleList.add(3.0);
        doubleList.add(4.0);
        System.out.println("Durchschnitt: " + Box.average(doubleList));

        // Verwendung der Methode addNumbers
        List<Number> numberList = new ArrayList<>();
        Box.addNumbers(numberList);
        System.out.println("Inhalt der Number-Liste: " + numberList);
    }
}