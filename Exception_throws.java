import java.io.FileReader;
import java.io.IOException;

public class Exception_throws {
   static void readFile() throws IOException {
        FileReader file = new FileReader("abc.txt");
        System.out.println("File opened successfully");
        file.close();
    }

    public static void main(String[] args) {

        try {
            readFile();
        } 
        catch (IOException e) {
            System.out.println("File not found!");
        }
    } 
}
