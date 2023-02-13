import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class WordCount{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner scan = new Scanner(System.in);
        int charsInFile = 0;
        ArrayList<String> strings = new ArrayList<String>();
        System.out.println("--File Processor--\nEnter File Name:");
        String fileName = scan.next();
        File file = new File(fileName);
        Scanner fileReader = new Scanner(file);
        do{
            strings.add(fileReader.next());
        }while(fileReader.hasNext());
        System.out.println("Words in File: " + strings.size());
        scan.close();
    }
}