package src.JavaCourse.CoreJava.ExceptionHandling;
// all code are example of RunTimeException
public class TryCatchException {
    public static void main(String[] args) {

          int a[] = new int[5];
        System.out.println("Hello Guys");
/*
        try{
            int x = 10/0;
            System.out.println(a[6]);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bound Exception");
        }
        catch (ArithmeticException e){
            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
            System.out.println(e); // or we can write it System.out.println(e.toString());
        }

        // Or we can write it like this
*/

        try{
            int result = 5/0;
            System.out.println(a[8]);

        }
//        catch (ArrayIndexOutOfBoundsException | ArithmeticException e){
//            System.out.println("Handling the Exception");
//        }
        // we can write it like this catch() block

        catch (Exception e){
            System.out.println("Handling the Exception"); // it will handle all type of exception in java
        }

        System.out.println("bye guys");
    }
}
