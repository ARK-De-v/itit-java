import java.util.*;

public class App  {

    public static void main(String[] args)
    {
        /*Write a program and ask the user to enter an English word.
         Count the number of vowels (a, e, o, u, i) in the word. So, if the user enters "inadequate",
          the program should display 6 on the console. */
        Scanner sc = new Scanner(System.in);
        byte counter =0;
        String word;
        System.out.println("enter a word");
        word = sc.nextLine();
        for (int i = 0; i < word.length(); i++)
        {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u')
            {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
