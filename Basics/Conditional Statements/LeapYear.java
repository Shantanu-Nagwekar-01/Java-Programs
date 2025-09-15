import java.util.*;

public class LeapYear {
    public static void main(String[] args) {
        System.out.print("Enter year: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a leap year.");
                }
                else {
                    System.out.println(year + " is not a leap year.");
                }
            }
            else {
                System.out.println(year + " is a leap year.");
            }
        }
        else {
            System.out.println(year + " is not a leap year.");
        }
        sc.close();
    }
}
/*
Enter year: 2000
2000 is a leap year.
Enter year: 2001
2001 is not a leap year.
Enter year: 1900
1900 is not a leap year.
Enter year: 1600
1600 is a leap year.
 */