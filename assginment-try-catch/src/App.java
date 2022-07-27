import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        //Write a program in java to accept the members of a list through the keyboard and display the members more than a specific value + try catch to make sure user do not input string.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of members in the list: ");
        int numberOfMembers = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        
        try {
            for (int i = 0; i < numberOfMembers; i++) {
                System.out.println("Enter the member: ");
                int member = scanner.nextInt();
                list.add(member);
            }
        } catch (Exception e) {
            System.out.println("You have entered a string");
            return;
        }
        System.out.println("Enter the value: ");
            int value = scanner.nextInt();
        try {
            
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) > value) {
                    System.out.println(list.get(i));
                }
            }
        } catch (Exception e) {
            System.out.println("Please enter a number");
            return;
        }
        
    }
}
