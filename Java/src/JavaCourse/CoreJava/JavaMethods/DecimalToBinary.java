package src.JavaCourse.CoreJava.JavaMethods;

public class DecimalToBinary {
    public static void decimalToBinary(int deciNum){
        int pow =0;
        int binary = 0;
        while(deciNum > 0){
            int LastDigit = deciNum % 2;
            binary = binary + LastDigit * (int)Math.pow(10, pow);
            pow++;
            deciNum /= 2;
        }
        System.out.println("Binary Number of Decimal is: "+ binary);
    }

    public static void main(String[] args) {
        decimalToBinary(12);

    }
}
