package JavaQA;

public class OctToBin {
    public static void main(String[] args) {
        String octal = "12";   // Why we take String input? Because we can't take 0 in the beginning of integer type
        // variable. so we take it as a string and then convert it to integer.
        int integer = Integer.parseInt(octal, 8); // converting to integer
        String binary = Integer.toBinaryString(integer); // Converting to binary
        System.out.println("Binary number is: " + binary);
    }
}
