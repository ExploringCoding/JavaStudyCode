package Objekt_Orientierte_Programmierung.Kapselung;

// lasse, die das konzept der Kapselung demonstriert
public class KapselungErklaerung {
    

    // private Klassenvariablen
    private String name;
    private int alter;

    // konstruktor
    public KapselungErklaerung(String name, int alter){
        this.name = name;
        this.alter = alter;
    }

    // öffentliche methoden zum datenzugriff
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAlter(){
        return alter;
    }

    public void setAlter(int alter){
        if (alter > 0) {
            this.alter = alter;
        } else {
            System.out.println("ungültiges alter");
        }
    }

}
