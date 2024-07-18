package src.JavaCourse.CoreJava.String;
import java.util.*;
public class StringMethods {

    /*
    String Methods:
    1. length() : Returns the length of the string.
    2. charAt(int index) : Returns the character at the specified index.
    3. concat(String str) : Concatenates the specified string to the end of the string.
    4. replace(char oldChar, char newChar) : Replaces all occurrences of the specified char value.
    5. replace(CharSequence target, CharSequence replacement) : Replaces all occurrences of the specified target sequence.
    6. toLowerCase() : Converts all of the characters in this String to lower case.
    7. toUpperCase() : Converts all of the characters in this String to upper case.
    8. trim() : Returns a copy of the string, with leading and trailing whitespace omitted.
    9. substring(int beginIndex) : Returns a new string that is a substring of this string.
    10. substring(int beginIndex, int endIndex) : Returns a new string that is a substring of this string.
    11. startsWith(String prefix) : Tests if this string starts with the specified prefix.
    12. endsWith(String suffix) : Tests if this string ends with the specified suffix.
    13. contains(CharSequence s) : Returns true if and only if this string contains the specified sequence of char values.
    14. equals(Object anObject) : Compares this string to the specified object.
    15. equalsIgnoreCase(String anotherString) : Compares this String to another String, ignoring case considerations.
    16. compareTo(String anotherString) : Compares two strings lexicographically.
    17. compareToIgnoreCase(String str) : Compares two strings lexicographically, ignoring case differences.
    18. isEmpty() : Returns true if, and only if, length() is 0.
    19. split(String regex) : Splits this string around matches of the given regular expression.
    20. join(CharSequence delimiter, CharSequence... elements) : Returns a new String composed of copies of the CharSequence elements joined together with a copy of the specified delimiter.
    21. indexOf(int ch) : Returns the index within this string of the first occurrence of the specified character.
    22. indexOf(int ch, int fromIndex) : Returns the index within this string of the first occurrence of the specified character, starting the search at the specified index.
    23. indexOf(String str) : Returns the index within this string of the first occurrence of the specified substring.
    24. indexOf(String str, int fromIndex) : Returns the index within this string of the first occurrence of the specified substring, starting at the specified index.
    25. lastIndexOf(int ch) : Returns the index within this string of the last occurrence of the specified character.
    26. lastIndexOf(int ch, int fromIndex) : Returns the index within this string of the last occurrence of the specified character, searching backward starting at the specified index.
    27. lastIndexOf(String str) : Returns the index within this string of the last occurrence of the specified substring.
    28. lastIndexOf(String str, int fromIndex) : Returns the index within this string of the last occurrence of the specified substring, searching backward starting at the specified index.
    29. replaceAll(String regex, String replacement) : Replaces each substring of this string that matches the given regular expression with the given replacement.
    30. replaceFirst(String regex, String replacement) : Replaces the first substring of this string that matches the given regular expression with the given replacement.

    */
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(s.length());
        System.out.println(s.charAt(0));
        s = s.concat("!!");
        System.out.println(s);
        s = s.replace("World", "Java");
        System.out.println(s);

        String s1 = " Satya";
        s1 = s1.trim();  // trim() delete karta hai leading and trailing spaces ko string se  --> leading mtlb hai ki
        // string ke starting me jo space hai usko delete karta hai aur trailing mtlb hai ki string ke end me jo hai
        // usko delete karta hai.
        System.out.println(s1);

        s1 = s1.toLowerCase();
        System.out.println(s1);
        s1 = s1.toUpperCase();
        System.out.println(s1);

        s1 = s1.substring(0, 3); // substring() method is used to get the substring of the string.
        System.out.println(s1);  // output is SAT

        boolean b = s1.contains("AT"); // contains() method is used to check whether the string contains the
        // specified string or not it give true if the string present in the string otherwise give false.
        System.out.println(b); // true

        String s2 = "Hello";
        String s3 = "Hello";
        String s4 = "hello";
        System.out.println(s2.equals(s3)); // true
        System.out.println(s2.equals(s4)); // false
        System.out.println(s2.equalsIgnoreCase(s4)); // true  --> equalsIgnoreCase() method ignore the case of the
        // string and compare the string exm: Hello ka H char  and hello ka h char ko same manta hai ye method Hello
        // aur hello ko true return kiya.

        System.out.println(s2.compareTo(s3));  // 0 --> 0 means both string are equal.
        System.out.println(s2.compareTo(s4)); // -32  --> -32 means s2 is greater than s4. ASCII value of each char
        // in Hello is H = 72, e = 101, l = 108, l = 108, o = 111 and ASCII value of each char in hello is h = 104,
        // e = 101, l = 108, l = 108, o = 111. So, ASCII value of H is greater than h so s2 is greater than s4. -32
        // isliye aya kyuki H ka ASCII value h se 32 jyada hai.
        System.out.println(s2.compareToIgnoreCase(s4)); // 0

        String p = "";
        String p1 = "Tom";

        System.out.println(p.isEmpty()); // true
        System.out.println(p1.isEmpty()); // false

        String s5 = "Hello-World";
        String[] str = s5.split("-");  // split() method ka use hum string ko alag alag part me batne ke liye karte
        // hai. but hume method ke under ek regular expression(example:- - ya , ya space ya kuch bhi jo hum use
        // karna chahte hai) dena padta hai. split() method ek array return karta hai.
        for(String i : str){
            System.out.println(i); // Hello World
        }


        String s6 = String.join("-", str);
        System.out.println(s6); // Hello-World

        System.out.println(s5.indexOf('o')); // 4
        System.out.println(s5.indexOf('o', 5)); // 7
        System.out.println(s5.indexOf("World")); // 6
        System.out.println(s5.indexOf("World", 7)); // -1

        System.out.println(s5.lastIndexOf('o')); // 7
        System.out.println(s5.lastIndexOf('o', 6)); // 4
        System.out.println(s5.lastIndexOf("World")); // 6
        System.out.println(s5.lastIndexOf("World", 5)); // -1

        System.out.println(s5.replaceAll("World", "Java"));

        System.out.println(s5.replaceFirst("World", "Java")); //  Hello-Java



    }
}
