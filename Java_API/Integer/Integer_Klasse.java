package Java_API.Integer;

public class Integer_Klasse {
    
    // compare(num1, num2)
    public static void compareA(){
        
        // => Verständnis zur Ausgabe
        // wenn Wert größer als 0, dann ist num1 größer als num2
        // wenn Wert kleiner als 0, dann ist num1 kleiner als num2
        // wenn Wert gleich 0, dann ist num1 gleich num2

        Integer num1 = 42;
        Integer num2 = 24;

        int vergleicheErgebnis = Integer.compare(num1,num2);
        System.out.println(vergleicheErgebnis);
    }

    // compareTo(Integer andererInteger)
    public static void compareToA(){

        Integer num1 = 42;
        Integer num2 = 24;

        int vergleicheErgebnis = num1.compareTo(num2);
        System.out.println(vergleicheErgebnis);
    }

    // intValue
    public static void intValueA(){
        
        Integer num1 = 42;
        int intValue =  num1.intValue();
        System.out.println(intValue);
    }

    // .equals(num2)
    public static void equalsA(){

        Integer num1 = 42;
        Integer num2 = 24;

        boolean isEqual = num1.equals(num2);
        System.out.println(isEqual);
    }

    // toString()
    public static void toStringA(){
        Integer num1 = 42;
        String intToString = num1.toString();
        System.out.println(intToString);
    }

    // MIN_VALUE_FIELD
    public static void minValueField(){
        int minValue = Integer.MIN_VALUE;
        System.out.println(minValue);
    }

    // MAX_VALUE_FIELD
    public static void maxValueField(){
        int maxValue = Integer.MAX_VALUE;
        System.out.println(maxValue);
    }

    // SIZE_FIELD
    public static void sizeField(){
        int byteSize = Integer.SIZE;
        System.out.println("SIZE: " + byteSize + " bits");
    }

    // arrayCopy()
    public static void arrayCopyA(){

        int[] quellArray = {1,2,3,4,5};

        int[] zielArray = new int[5]; // <= mit ausreichender Länge

        System.arraycopy(quellArray, 0, zielArray, 0, quellArray.length);

        System.out.println("Zielarray nach dem Kopieren:  ");
        for (int value : zielArray){
            System.out.println(value + " ");
        }

    }

}
