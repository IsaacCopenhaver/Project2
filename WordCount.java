import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class WordCount{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner scan = new Scanner(System.in);
        Scanner fileScanner;

        System.out.println("--File Processor-- \nEnter File Name:");
        String fileName = scan.next();
        File file = new File(fileName);
        fileScanner = new Scanner(file);
        
    }
}