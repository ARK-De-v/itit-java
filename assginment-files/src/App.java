import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class App {
    public static void main(String[] args) throws Exception {
       //Write a program that reads a text file and displays the longest word in the file.
        List<String> path = Files.readAllLines(Paths.get("test.txt"));
        String[] words = path.toString().split(" ");
        String longestWord = "";
        for(String word : words)
        {
            if(word.length() > longestWord.length())
            {
                longestWord = word;
            }
        }
        System.out.println(longestWord);

        
    }
}
