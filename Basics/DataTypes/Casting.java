package Basics.DataTypes;

interface Animal {
    void makeSound();
}

public class Casting {
    
    // casting von einem primitiven datentyp zu einem anderen
    public static int doubleToInt(double num){
        return (int) num; // von double zu int
        // ABER: von double zu int bedeutet DATENVERLUST
    }

    // casting von einem größeren zu einem kleineren primitiven datentyp
    public static short intToShort(int number){
        return (short) number;
    }

    // casting von einem objekttyp zu einem anderen
    public static String objectToString(Object object){
        return (String) object;
    }


}

class Dog implements Animal {
    
    public void makeSound(){
        System.out.println("Woof");
    }

    // FÜR CASTING - siehe Main Method
}

