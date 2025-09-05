import java.util.*;

public class printSum {
    public static void main(String[] args) {
        System.out.print("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int sum = a + b;
        System.out.println(a + " + " + b + " = " + sum);
        sc.close();
    }
}
/*
 * Output:
 * Enter two numbers: 12 13
 * 12 + 13 = 25
 */