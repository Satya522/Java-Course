package src.JavaCourse.DSA.BitManipulation;
/*
 How to convert binary to decimal ?
 1. Get the binary number
 2. Start from the right and multiply the digit with 2^position
    position is 0 based index
 3. Add all the results to get the decimal number
 Example: 1101
 1*2^0 + 0*2^1 + 1*2^2 + 1*2^3 = 1 + 0 + 4 + 8 = 13
 *
* */
public class BinaryToDecimal {
    public static void main(String[] args) {
        int binNo = 1101;
        System.out.println(binaryToDecimal(binNo));
    }

    private static int binaryToDecimal(int binary) {
        int decimal = 0;
        int position = 0;
        while (binary > 0) {
            int remainder = binary % 10;
            decimal += (int) (remainder * Math.pow(2, position));
            binary = binary / 10;
            position++;
        }
        return decimal;

    }
}
