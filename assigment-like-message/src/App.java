import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //When you post a message on Facebook, depending on the number of people who like your post, Facebook displays different information.

        // If no one likes your post, it doesn't display anything.
        // If only one person likes your post, it displays: [Friend's Name] likes your post.
        // If two people like your post, it displays: [Friend 1] and [Friend 2] like your post.
        // If more than two people like your post, it displays: [Friend 1], [Friend 2] and [Number of Other People] others like your post.


        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name of the friend");
        String name = sc.nextLine();
        String[] names = name.split(" ");


        if(names.length == 1)
        {
            System.out.println(names[0] + " likes your post");
        }
        else if(names.length == 2)
        {
            System.out.println(names[0] + " and " + names[1] + " like your post");
        }
        else
        {
            System.out.println(names[0] + " and " + names[1] + " and " + (names.length - 2) + " others like your post");
        }

        
    }
}
