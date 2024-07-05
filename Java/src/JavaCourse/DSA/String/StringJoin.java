package src.JavaCourse.DSA.String;

public class StringJoin {
    public static void main(String[] args) {
        // join() method return a string joined with the given delimiter/separator between each element.
        String joinString1 = String.join("-", "well", "done", "java");
        System.out.println(joinString1);  // well-done-java
        String date = String.join("/", "16","06","1998");
        System.out.println(date);  // 16/06/1998


     /*
      //  In the case of null as a delimiter, we get null pointer exception.

        String str = String.join(null, "well", "done", "java");
        System.out.println(str);  // nullwelldonejava
     */


     /*
       // In the case of null as an element, we get null pointer exception.
        StringJoiner class is used to construct the sequence of characters separated by a delimiter. Now, we can use the StringJoiner class to join the strings.

        StringJoiner sj = new StringJoiner(",");
        sj.add("well");
        sj.add("done");
        sj.add("java");
        System.out.println(sj); // well,done,java

     */

        /*

        StringJoiner sj = new StringJoiner(",", "[", "]");
        sj.add("well");
        sj.add("done");
        sj.add("java");
        System.out.println(sj); // [well,done,java]
        * */

    }
}
