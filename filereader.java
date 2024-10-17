import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class filereader{
    public static void main(String[] args){
        Scanner scanner = null;
        try{
            File file = new File("data.txt");
            scanner = new Scanner(file);
            while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            System.out.println("line");
           }
        } catch(FileNotFoundException e){
            System.out.println("Error: File 'data.text' not found");
        } finally{
            if(scanner != null){
                scanner.close();
                System.out.println("scanner closed.");
            }
        }
    }
}