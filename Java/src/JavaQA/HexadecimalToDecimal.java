package JavaQA;

import java.util.Scanner;

// write a java program to convert a hexadecimal  number to decimal number
// hexadecimal number are those number which are in base 16 --> 0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F are the hexadecimal number
// 0x is used to represent hexadecimal number
// 0x1 = 1
// 0x2 = 2
// 0x3 = 3
// 0x4 = 4
// 0x5 = 5
// 0x6 = 6
// 0x7 = 7
// 0x8 = 8
// 0x9 = 9
// 0xA = 10
// 0xB = 11
// 0xC = 12
// 0xD = 13
// 0xE = 14
// 0xF = 15
// 0x10 = 16
// 0x11 = 17
// 0x12 = 18
// 0x13 = 19
// 0x14 = 20
// 0x15 = 21
// 0x16 = 22
// 0x17 = 23
// 0x18 = 24
// 0x19 = 25
// 0x1A = 26
// 0x1B = 27
// 0x1C = 28
// 0x1D = 29
// 0x1E = 30
// 0x1F = 31
// 0x20 = 32
// 0x21 = 33
// 0x22 = 34
// 0x23 = 35
// 0x24 = 36
// 0x25 = 37
// 0x26 = 38
// 0x27 = 39
// 0x28 = 40
// 0x29 = 41
// 0x2A = 42
// 0x2B = 43
// 0x2C = 44
// 0x2D = 45
// 0x2E = 46
// 0x2F = 47
// 0x30 = 48
// 0x31 =
public class HexadecimalToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the hexadecimal number: ");
        String hexadecimalNumber = scanner.nextLine();  // suppose we take 0x2B
        int decimalNumber = Integer.parseInt(hexadecimalNumber, 16);
        System.out.println("Decimal Number is: " + decimalNumber);   // output is 43
    }
}
