package src.JavaCourse.CoreJava.OOPS.MethodOverloading;
public class UseAddition {
    public static void main(String[] args) {
        Addition obj = new Addition();
        System.out.println("Sum of 10 and 20 is: "+obj.add(10,20));
        System.out.println("Sum of 10.6 and 9.4 is: "+obj.add(10.4,9.4));
        System.out.println("Concatenate of good and bye is: "+obj.add("good","bye"));

        System.out.println();
        System.out.println();

        System.out.println("Sum of 10, 20 and 30 is: "+obj.add(10,20,30));
        System.out.println("Sum of 10.4, 9.4 and 7.2 is: "+obj.add(10.4,9.4,7.2));
        System.out.println("Concatenate of good, bye and morning is: "+obj.add("good","bye","morning"));

        System.out.println();
        System.out.println();

        System.out.println("Sum of 10, 20, 30 and 40 is: "+obj.add(10,20,30,40));
        System.out.println("Sum of 10.4, 9.4, 7.2 and 5.6 is: "+obj.add(10.4,9.4,7.2,5.6));
        System.out.println("Concatenate of good, bye, morning and sir is: "+obj.add("good","bye","morning","sir"));

        System.out.println();
        System.out.println();

        obj.show("John", 25);
        obj.show(25, "John");
    }

}
