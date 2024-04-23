package Basics;
//import Basics.DataTypes.PrimitiveDataTypes;
//import Basics.DataTypes.KomplexeDatenTypen;
//import Basics.Variables.PrimitiveVariable;
//import Basics.Variables.ReferenzVariablen;
//import Basics.Operators.Operatoren;
//import Basics.Methods.Methoden;
//import java.lang.reflect.Method;
//import Basics.ControlStructures.KontrollStrukturen;
//import Basics.Methods.Methoden;
//import Basics.Methods.ParameterDatenbankSimulation;
//import Basics.Methods.ParameteruebergabeBeiMethoden;
//import Basics.Methods.ParameteruebergabeBeiMethoden;
//import Basics.Constructors.KonstruktorenErklaerung;

import Basics.DataTypes.Casting;
import Basics.Ternaere_Operatoren.Ternaere_Operatoren;

public class Main_Method_Basics {

    public static void main(String[] args) {
        
        
        // BASICS => DATA TYPES => PrimitiveDataTypes.java -----------------------------------------
        /* Objektinitialisierung - wenn Methoden NICHT static sind!!!!
         * PrimitiveDataTypes primitiveDataTypes = new PrimitiveDataTypes();
            primitiveDataTypes.Ganzzahlen();
        */
        // Statische initialisierung
            //PrimitiveDataTypes.ganzzahlen();
            //PrimitiveDataTypes.double64();
            //PrimitiveDataTypes.booleanTypes();
            //PrimitiveDataTypes.charType();

        // BASICS => DATA TYPES => KomplexeDatenTypen.java -----------------------------------------
        /*
        KomplexeDatenTypen.arraysDatenTyp();
        KomplexeDatenTypen.stringDatenTyp();
        KomplexeDatenTypen.arrayList();
        KomplexeDatenTypen.hashMap();
        KomplexeDatenTypen.hashSet();
        KomplexeDatenTypen.queue();
        KomplexeDatenTypen.stack();
        */

        // BASICS => DATA TYPES => Casting.java -----------------------------------------
        /*
        Casting.doubleToInt(3.12);
        Casting.intToShort(3);
        Casting.objectToString(args);
        */

        // BASICS => Variables => PrimitiveVariable.java -----------------------------------------
        /*
        PrimitiveVariable.primVarExample();
        ReferenzVariablen.referenzVariablen(); 
        */
        
        // BASICS => Operators => Operatoren.java -----------------------------------------
        /*
        Operatoren.arithmetischeOp();
        Operatoren.zuweisungsOp();
        Operatoren.vergleichsOp();
        Operatoren.logischeOp();
        Operatoren.bitwiseOp();
        Operatoren.inkrementDekrementOp();
        Operatoren.bedingteOp();
        */

        // BASICS => Methods => Methoden.java -----------------------------------------
        /*
        Methoden.methodeA();
        Methoden.methodeB(50);
        Methoden.methodeC(); 
        int ergebnisMethodeC = Methoden.methodeC();
        System.out.println("zu methodeC - ausgabe nur mit print: " + ergebnisMethodeC);
        Methoden methoden = new Methoden();
        methoden.methodeD(10, 20); // methode ist nicht als static deklariert
        Methoden.methodeE();
        Methoden.methodeF("Hallo", 10);
        */

        // BASICS => Methods => ParameterDatenbankSimulation.java -----------------------------------------
        /*
        ParameterDatenbankSimulation parameterDatenbankSimulation = new ParameterDatenbankSimulation();
        parameterDatenbankSimulation.datenbankOperationenAusfuehren();
        */

        // BASICS => Methods => ParameteruebergabeBeiMethoden.java -----------------------------------------
        /*
        ParameteruebergabeBeiMethoden.methodenAufruf();
        */
        
        // BASICS => ControlStructures => KontrollStrukturen.java -----------------------------------------
        /*
        KontrollStrukturen.ifStatement();
        KontrollStrukturen.ifElseStatement();
        KontrollStrukturen.elseIfStatement();
        KontrollStrukturen.whileSchleife();
        KontrollStrukturen.doWhileSchleife();
        KontrollStrukturen.forSchleife();
        KontrollStrukturen.forEachSchleife(); // für arrays und collections
        */

        // BASICS => Constructors => KontrollStrukturen.java -----------------------------------------
        /* 
        KonstruktorenErklaerung obj1 = new KonstruktorenErklaerung(); // Aufruf des Standardkonstruktors
        KonstruktorenErklaerung obj2 = new KonstruktorenErklaerung(42); // Aufruf des Kopierkonstruktors
        KonstruktorenErklaerung obj3 = new KonstruktorenErklaerung(42, "Hallo"); // Aufruf des überladenen parameterisierten Konstruktors mit einer Zahl und einem Text
        KonstruktorenErklaerung obj4 = new KonstruktorenErklaerung(obj3); // Aufruf des Kopierkonstruktors
        */

        //BASICS => Ternaere_Operatoren => Ternaere_Operatoren.java
        /*
        Ternaere_Operatoren.max(1, 9);
        Ternaere_Operatoren.geradeUngerade(3);
        Ternaere_Operatoren.formatResults(false);
        Ternaere_Operatoren.getGreeting(false);
        Ternaere_Operatoren.checkEmpty("sa");
        Ternaere_Operatoren.checkSign(3);
        */
    }       
}