package JavaQA;
import java.math.*;
public class OctToHexaDec{
    public static void main(String[] args) {
//        int octal = 175;
//        int decimal = 0;
//        int i = 0;
//        while(octal != 0) {
//            decimal += (int) ((octal % 10) * Math.pow(8, i++));
//            octal /= 10;
//        }
//
//        String hexadecimal = "";
//        char hexChars[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
//
//        while(decimal != 0) {
//            int remainder = decimal % 16;
//            hexadecimal = hexChars[remainder] + hexadecimal;
//            decimal /= 16;
//        }
//
//        System.out.println("Hexadecimal number is: " + hexadecimal);



        // Another method using Integer class

        int octal = 175;
        String octalStr = Integer.toOctalString(octal);
        int decimal = Integer.parseInt(octalStr, 8);
        String hexadecimal = Integer.toHexString(decimal);
        System.out.println("Hexadecimal number is: " + hexadecimal);
    }
}