import java.util.*;

public class tables {
    public static void main(String[] args) {
        System.out.print("Enter the number to print multiplication table: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
        sc.close();
    }
}
/*
 * Enter the number to print multiplication table: 2
 * 2 * 1 = 2
 * 2 * 2 = 4
 * 2 * 3 = 6
 * 2 * 4 = 8
 * 2 * 5 = 10
 * 2 * 6 = 12
 * 2 * 7 = 14
 * 2 * 8 = 16
 * 2 * 9 = 18
 * 2 * 10 = 20
 */