package src.JavaCourse.CoreJava.String;

public class StringConversionMethod {

    /*
    31. toCharArray() : Converts this string to a new character array.
    32. toCharArray(int srcBegin, int srcEnd) : Converts this string to a new character array.
    33. getBytes() : Encodes this String into a sequence of bytes using the platform's default charset, storing the result into a new byte array.
    34. getBytes(String charsetName) : Encodes this String into a sequence of bytes using the named charset, storing the result into a new byte array.
    35. getBytes(Charset charset) : Encodes this String into a sequence of bytes using the given charset, storing the result into a new byte array.
    36. valueOf(boolean b) : Returns the string representation of the boolean argument.
    37. valueOf(char c) : Returns the string representation of the char argument.
    38. valueOf(char[] data) : Returns the string representation of the char array argument.
    39. valueOf(char[] data, int offset, int count) : Returns the string representation of a specific subarray of the char array argument.
    40. valueOf(double d) : Returns the string representation of the double argument.
    41. valueOf(float f) : Returns the string representation of the float argument.
    42. valueOf(int i) : Returns the string representation of the int argument.
    43. valueOf(long l) : Returns the string representation of the long argument.
    44. valueOf(Object obj) : Returns the string representation of the Object argument.
    45. valueOf(String s) : Returns the string representation of the String argument.
    46. toString() : This object (which is already a string!) is itself returned.

    *
    */
    public static void main(String[] args) {
        String str = "Hello World";
        char[] arr = str.toCharArray();
        for(char c : arr){
            System.out.print(c);  // H e l l  W o r l d
        }
        System.out.println();

        byte[] b = str.getBytes();
        for(byte i : b){
            System.out.print(i + " ");  // 72 101 108 108 111 32 87 111 114 108 100
        }
        System.out.println();

        System.out.println(String.valueOf(true)); // true
        System.out.println(String.valueOf('a')); // a
        System.out.println(String.valueOf(12)); // 12
        System.out.println(String.valueOf(12.34)); // 12.34
        System.out.println(String.valueOf(12.34f)); // 12.34
        System.out.println(String.valueOf("Hello")); // Hello
        System.out.println(String.valueOf(new String("Hello"))); // Hello

        System.out.println(str.toString());  // Hello World


    }
}
