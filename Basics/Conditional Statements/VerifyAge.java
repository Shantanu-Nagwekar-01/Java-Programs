import java.util.*;

public class VerifyAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        //simple if-else
        if (age > 18) {
            System.out.println("You are an adult");
        }
        else {
            System.out.println("You are not an adult");
        }
        sc.close();
    }
}