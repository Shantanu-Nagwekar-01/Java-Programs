import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        final float PI = 3.14F;
        System.out.print("Enter radius of circle: ");
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        float area = PI * radius * radius;
        System.out.println("\nThe Area of Circle with radius " + radius + " is " + area + " sq. units");
        sc.close();
    }
}
/*
 * Output:
 * Enter radius of circle: 7
 * 
 * The Area of Circle with radius 7 is 153.86002 sq. units
 */