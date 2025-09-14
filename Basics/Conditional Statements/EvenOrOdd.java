import java.util.*;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        //simple if-else
        if (num % 2 == 0) {
            System.out.println(num + " is even number");
        }
        else {
            System.out.println(num + " is odd number");
        }
        sc.close();
    }
}
/*
Output: 
Enter number: 4
4 is even number
Enter number: 7
7 is odd number
 */