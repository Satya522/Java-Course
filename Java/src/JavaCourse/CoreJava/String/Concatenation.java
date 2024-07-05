package src.JavaCourse.CoreJava.String;

public class Concatenation {
    public static void main(String[] args) {
        String s = "Hello" + " World";
        System.out.println(s);
        String s1 = 50+50 + "hello"+40+40;
        System.out.println(s1);

        String s2 = "Sachin";
        String s3 = " Tendulkar";
        String s4 = s2.concat(s3);
        System.out.println(s4);
    }
}
