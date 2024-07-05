package src.JavaCourse.DSA.String;

public class ConvertUpperLowercase {
    public static String convertToUppercase(String string){
        return string.toUpperCase();
    }
    public static String convertToLowercase(String string){
        return string.toLowerCase();
    }
    public static void main(String[] args) {
        String string = "Hello World";
        System.out.println(convertToUppercase(string));
        System.out.println(convertToLowercase(string));

    }
}
