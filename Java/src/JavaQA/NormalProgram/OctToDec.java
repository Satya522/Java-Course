package src.JavaQA.NormalProgram;

public class OctToDec {
    public static void main(String[] args) {
        String octal = "12";
        int integer = Integer.parseInt(octal, 8); // Converting to integer
        System.out.println("Decimal number is: " + integer);

    }
}
