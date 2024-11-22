import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileWriter;   // Import the FileWriter class

public class Main {
    public static void main(String[] args) {


        EvidenceUzivatelu = new EvidenceUzivatelu();
        





























      /*  try {
            File myObj = new File("src\\text.txt");                 //vypisovani
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {                     //    ctrl + shift + / = komentar
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }*/


/*        File myObj = new File("filename.txt");         //mazani
        if (myObj.delete()) {
            System.out.println("Deleted the file: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the file.");
        } */



/*
        File myObj = new File("src\\text.txt");                                         //popisovani
        if (myObj.exists()) {
            System.out.println("File name: " + myObj.getName());
            System.out.println("Absolute path: " + myObj.getAbsolutePath());
            System.out.println("Writeable: " + myObj.canWrite());
            System.out.println("Readable " + myObj.canRead());
            System.out.println("File size in bytes " + myObj.length());
        } else {
            System.out.println("The file does not exist.");
        }

*/

    /*    try {
            FileWriter myWriter = new FileWriter("text.txt");
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }





        try{
            File myObj = new File("text.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {                     //    ctrl + shift + / = komentar
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }*/


    }
}
