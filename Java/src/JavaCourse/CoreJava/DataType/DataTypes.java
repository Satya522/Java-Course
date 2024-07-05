package src.JavaCourse.CoreJava.JavaBasic.DataType;
// full details of data types and range read README.md file
public class DataTypes {
    public static void main(String[] args) {
        // Primitive Data Types
        byte byteVar = 10;
        short shortVar = 100;
        int intVar = 1000;
        long longVar = 10000L;
        float floatVar = 1.23f;
        double doubleVar = 123.456;
        boolean booleanVar = true;
        char charVar = 'A';

        // Non-Primitive Data Types
        String stringVar = "Hello, Everyone!";
        int[] arrayVar = {1, 2, 3, 4, 5};

        System.out.println("Byte: " + byteVar);
        System.out.println("Short: " + shortVar);
        System.out.println("Int: " + intVar);
        System.out.println("Long: " + longVar);
        System.out.println("Float: " + floatVar);
        System.out.println("Double: " + doubleVar);
        System.out.println("Boolean: " + booleanVar);
        System.out.println("Char: " + charVar);
        System.out.println("String: " + stringVar);
        System.out.print("Array: ");
        for (int i : arrayVar) {
            System.out.print(i + " ");
        }
    }
}