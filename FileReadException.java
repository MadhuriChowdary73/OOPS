import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadException {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:/Users/CSE Lab1/Documents/24206/Game.java"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } 
        catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } 
        catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
