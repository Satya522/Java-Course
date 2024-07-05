package src.JavaCourse.DSA.String;

public class StringComparision {
    public static void main(String[] args) {

        // By using equals() Method
        String s1 = "Sachin";
        String s2 = "Sachin";
        String s3 = new String("Sachin");
        String s4 = "Saurav";
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true
        System.out.println(s1.equals(s4));//false

        System.out.println(); // this is only for code output clean
        System.out.println();


        String s5 = "SACHIN";
        System.out.println(s1.equals(s5));
        System.out.println(s1.equalsIgnoreCase(s5));
        System.out.println();
        System.out.println();

        // By using == operator
        // the == operator compares reference not values

        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false
        System.out.println();
        System.out.println();

        // By using compareTo() method
        /*
        The String class compareTo() method compares values lexicographically and returns an integer value that
        describes if first string is less than, equal to or greater than second string.
        Suppose s1 and s2 are two String objects. If:

        s1 == s2 : The method returns 0.
        s1 > s2 : The method returns a positive value.
        s1 < s2 : The method returns a negative value.
        */

        String s21="Sachin";
        String s22="Sachin";
        String s23="Ratan";
        System.out.println(s21.compareTo(s22));
        System.out.println(s21.compareTo(s23));
        System.out.println(s23.compareTo(s21));

    }
}
