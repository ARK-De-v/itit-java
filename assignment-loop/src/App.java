import java.util.*;

public class App  {

    public static void main(String[] args)
    {
        /*1- Write a program to count how many numbers between 1 and 100 are divisible by 3 with no remainder.
         Display the count on the console. */
         
        Scanner sc = new Scanner(System.in);
        byte total = 0;
        for(byte i=1 ;i<100;i++ )
        {
            if(i%3==0)
            {
                total+=1;
            }
        }
        System.out.println(total);
    }
}
