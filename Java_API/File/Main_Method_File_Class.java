package Java_API.File;

public class Main_Method_File_Class {
    
    public static void main(String[] args) {
        
        file_IO_Basics();
        file_json();
        
    }

    private static void file_IO_Basics(){
        File_IO_Basics.readFile();
        //File_IO_Basics.readFileB();
        //File_IO_Basics.writeFile();
        File_IO_Basics.appendFile();
        File_IO_Basics.writeStringToFile("Ich überschreibe vorhandenen content");
        File_IO_Basics.writeStringToFileB("Das ist der Content und das alte wird nicht überschreiben");

    }

    private static void file_json(){
        //file_IO_Basics();
        //File_JSON.loadFromJSON();
        //File_JSON.writeToJSON();
        //File_JSON.displayWordsFromJSON();
        //File_JSON.displayArraysFromJSON();
    }
}
