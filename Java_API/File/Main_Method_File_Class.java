package Java_API.File;

public class Main_Method_File_Class {
    
    public static void main(String[] args) {
        
        File_IO_Basics.readFile();
        //File_IO_Basics.readFileB();
        //File_IO_Basics.writeFile();
        File_IO_Basics.appendFile();
        File_IO_Basics.writeStringToFile("Ich überschreibe vorhandenen content");
        File_IO_Basics.writeStringToFileB("Das ist der Content und das alte wird nicht überschreiben");
        
    }
}
