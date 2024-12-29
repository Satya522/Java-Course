package src.JavaCourse.CoreJava.ExceptionHandling;

public class FinallyBlockInException {
    public static void main(String[] args) {

         int a[] = new int[5];
        System.out.println("Hello Guys");

        try{
            System.out.println(a[7]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Exception Handled");
        }
        finally {
            System.out.println("I will run always");
        }

        System.out.println("Bye World");
    }
}
