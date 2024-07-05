package src.JavaQA.NormalProgram;

public class BinToHexadec {
    public static void main(String[] args) {
        String binary = "101011";
        int decimal = Integer.parseInt(binary, 2); // converting to decimal
        String hexadecimal = Integer.toHexString(decimal); // converting to hexadecimal
        System.out.println("Hexadecimal number is: " + hexadecimal);
    }
}