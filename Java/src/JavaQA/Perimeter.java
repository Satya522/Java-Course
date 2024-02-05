//Write a Java program to print the area and perimeter of a rectangle.
package JavaQA;

import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        float length = sc.nextFloat();
        System.out.print("Enter the breadth of rectangle: ");
        float breadth = sc.nextFloat();
        float area = length * breadth;
        float perimeter = 2 * (length + breadth);
        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The perimeter of the rectangle is: " + perimeter);

    }
}
