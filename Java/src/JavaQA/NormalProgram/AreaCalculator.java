package src.JavaQA.NormalProgram;

import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Calculate the area of a triangle
        System.out.print("Enter the base of the triangle: ");
        float base = input.nextFloat();
        System.out.print("Enter the height of the triangle: ");
        float height = input.nextFloat();
        float triangleArea = 0.5f * base * height;
        System.out.println("Area of the triangle is: " + triangleArea);

        // Calculate area of a Circle
        System.out.print("Enter the radius value of Circle: ");
        float rad = input.nextFloat();
        float area = 3.14f * rad * rad;
        System.out.println("Area of circle is: "+area);

        // Calculate the area of a square
        System.out.print("Enter the side length of the square: ");
        float side = input.nextFloat();
        float squareArea = side * side;
        System.out.println("Area of the square is: " + squareArea);

        // Calculate the area of a rectangle
        System.out.print("Enter the length of the rectangle: ");
        float length = input.nextFloat();
        System.out.print("Enter the width of the rectangle: ");
        float width = input.nextFloat();
        float rectangleArea = length * width;
        System.out.println("Area of the rectangle is: " + rectangleArea);
    }
}
