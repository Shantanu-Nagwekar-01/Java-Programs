import java.util.*;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // sc is object of scanner class;
        // System.out.print("Enter first name: ");
        // String first_name = sc.next(); // will take only first token not full line
        System.out.print("\nEnter Full name: ");
        String full_name = sc.nextLine(); // will take full line as input
        System.out.println("\nFull Name is: " + full_name);
        System.out.print("\nEnter age: ");
        int age = sc.nextInt(); // takes next integer input
        System.out.println(full_name + "'s age is " + age);
        System.out.print("Enter your height in cm: ");
        float height = sc.nextFloat(); // takes next float input
        System.out.println(full_name + "'s height is " + height + "cm.");
        sc.close();
    }
}
