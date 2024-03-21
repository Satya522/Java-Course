package JavaCourse.JavaBasic.Operator;
/*Explain where the instanceof operator is used, how's it working and give example.
The instanceof operator compares an object to a specified type. You can use it to test if an object is an instance of a class, an instance of a subclass, or an instance of a class that implements a particular interface.
The instanceof operator is written as:
(object reference variable) instanceof  (class/interface type)
If the object referred by the variable on the left side of the operator passes the IS-A check for the class/interface type on the right side, then the result will be true. Otherwise the result will be false.
 */
public class InstanceofOperator {
    public static void main(String[] args) {
        String name = "James";
        boolean result = name instanceof String; // true

        System.out.println(result);
    }
}
