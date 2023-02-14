import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import javax.xml.stream.events.Characters;
public class WordCount{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner scan = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<String>();
        ArrayList<Character> chars = new ArrayList<>();
        System.out.println("--File Processor--\nEnter File Name:");
        String fileName = scan.next();
        scan.close();
        File file = new File(fileName);
        Scanner fileReader = new Scanner(file);

        while(fileReader.hasNext()){
            strings.add(fileReader.next());
        }
        fileReader.close();
        fileReader = new Scanner(file);
        while(fileReader.hasNext()){
            String temp = fileReader.next();
            for(int i = 0; i < temp.length(); i++){
                chars.add(temp.charAt(i));
            }
        }
        System.out.println("Words in File: " + strings.size());
        System.out.println("Characters in file: " + chars.size());
        fileReader.close();
        /*TreeMap<Integer, TreeSet<String>> occurrencesOfStrings = new TreeMap<Integer, TreeSet<String>>();
        for(String str : strings){
            int occurrences = 0;
            str=str.replace(".", "");
            str = str.toLowerCase();
            str = str.replace("," ,"");
            str = str.replaceAll(";" , "");
            str = str.replaceAll(":", "");
            for(String word : strings){
                word=word.replace(".", "");
                word=word.toLowerCase();
                word = word.replace(",", "");
                word = word.replaceAll(";","");
                word = word.replaceAll(":", "");

                if(str.equals(word)){
                    occurrences+= 1;
                }
            }
            if(occurrencesOfStrings.containsKey(Integer.valueOf(occurrences)) == false){
            occurrencesOfStrings.put(occurrences, new TreeSet<String>());
            }
            occurrencesOfStrings.get(Integer.valueOf(occurrences)).add(str.toLowerCase());
        }
        for(int i = 0; i < occurrencesOfStrings.size(); i++){
            Set<Integer> keys = occurrencesOfStrings.keySet();
            Object[] array = keys.toArray();
            int[] ints = new int[array.length];
            ints[i] = Integer.parseUnsignedInt(array[i].toString());
            System.out.println("Words that occured " + (ints[i]) + " times: " + occurrencesOfStrings.get(ints[i]));
        }*/

        TreeMap<Integer, TreeSet<Character>> occurrencesOfChars = new TreeMap<Integer, TreeSet<Character>>();
        for(Character char1 : chars){
            char1 = Character.toLowerCase(char1);
            int occurrences = 0;
            for(Character char2 : chars){
                char2 = Character.toLowerCase(char2);
                if(char1.equals(char2)){
                    occurrences+= 1;
                }
            }
            if(occurrencesOfChars.containsKey(Integer.valueOf(occurrences)) == false){
            occurrencesOfChars.put(occurrences, new TreeSet<Character>());
            }
            occurrencesOfChars.get(Integer.valueOf(occurrences)).add(char1);
        }
        for(int i = 0; i < occurrencesOfChars.size(); i++){
            Set<Integer> keys = occurrencesOfChars.keySet();
            Object[] array = keys.toArray();
            int[] ints = new int[array.length];
            ints[i] = Integer.parseUnsignedInt(array[i].toString());
            System.out.println("Characters that occured " + (ints[i]) + " times: " + occurrencesOfChars.get(ints[i]));
        }
    }
}