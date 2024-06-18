package Controlflowst;
import java.io.FileReader;

public class FileHandling {
    public static void main(String[] args) {
        readFile reader = new readFile("Hello.txt");
        int data = reader.read();
        while(data != -1){
            System.out.println((char) reader.read());
            data = reader.read();

        }
    }
}
