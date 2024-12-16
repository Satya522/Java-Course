package src.JavaCourse.CoreJava.JavaMethods;

public class BinaryToDecimal {

    public  static  void binaryToDecimal(int binNum){
        int decimal = 0;
        int power = 0;
        while(binNum > 0){
            int lastDigit = binNum % 10;
            decimal += lastDigit * (int)Math.pow(2, power);
            power++;
            binNum /= 10;
        }
        System.out.println("Decimal Number of Binary is: "+  decimal);
    }
    public static void main(String[] args) {
        binaryToDecimal(101);

    }
}
