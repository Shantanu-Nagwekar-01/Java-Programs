import java.util.*;

public class DaysOfWeek {
    public static void main (String[] args) {
        System.out.print("Enter number from 1 to 7: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        switch(n) {
            case 1 : 
                System.out.println("It's a Monday");
                break;
            
            case 2 : 
                System.out.println("It's a Tuesday");
                break;

            
            case 3 : 
                System.out.println("It's a Wednesday");
                break;
            
            case 4 : 
                System.out.println("It's a Thursday");
                break;
            
            case 5 : 
                System.out.println("It's a Friday");
                break;
            
            case 6 : 
                System.out.println("It's a Saturday");
                break;
            
            default :
                System.out.println("It's a Sunday");
        }
    }
}
/*
Output: 
Enter number from 1 to 7: 2
It's a Tuesday
Enter number from 1 to 7: 3
It's a Wednesday
Enter number from 1 to 7: 7
It's a Sunday
 */