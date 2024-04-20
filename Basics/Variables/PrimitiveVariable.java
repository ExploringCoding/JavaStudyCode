package Basics.Variables;

public class PrimitiveVariable {
    

    public static void primVarExample(){

       // Deklaration und Initialisierung von primitiven Variablen
       int oldAge = 25;
       int age = oldAge;
       double height = 1.75;
       boolean isStudent = true;
       char grade = 'A';

       // Ausgabe der Variablen
       System.out.println("Age: " + age);
       System.out.println("Height: " + height + " meters");
       System.out.println("Is student? " + isStudent);
       System.out.println("Grade: " + grade);

       // Arithmetische Operationen mit primitiven Variablen
       int newAge = age + 5;
       double newHeight = height * 2;
       boolean canVote = age >= 18;

       // Ausgabe der Ergebnisse der arithmetischen Operationen
       System.out.println("Age after 5 years: " + newAge);
       System.out.println("Height doubled: " + newHeight + " meters");
       System.out.println("Can vote? " + canVote);

       // Verwendung von Vergleichsoperatoren mit primitiven Variablen
       boolean isTall = height > 1.8;
       boolean hasExcellentGrade = grade == 'A';

       // Ausgabe der Ergebnisse der Vergleichsoperatoren
       System.out.println("Is tall? " + isTall);
       System.out.println("Has excellent grade? " + hasExcellentGrade); 
    }
}
