package src.JavaCourse.CoreJava.OOPS.Arguments;
// this is example variable is passed by value
public class Variables {
    public static void main(String[] args) {
        int x = 20;
        int y = 30;
        // the compiler will create a memory for x and y and pass the value to
        // 20 , 30 to an address in memory
        System.out.println("Before increment the value of x is: "+x + " and y is: "+y);
        increment(x,y);  // x and y is actual arguments

        // then increment(20,30) will be called and the value of a and b will be copied to the formal arguments a and b.
        System.out.println("After increment the value of x is: "+x + " and y is: "+y);
    }
    public static void increment(int a, int b){
        //  the compiler create a memory for a and b and pass the value of x and y is 20 and 30 at any address in memory
        a = a+5; // compiler will increment the value of "a" by 5 --> 20+5 = 25 this value store at particular address
        // where "a" is pointing
        // address
        b = b+5;  // compiler will increment the value of "b" by 5 --> 30+5 = 35 this value store at particular address
        // where "b" is pointing
        /*
        NOTE: In the increment method which is changed the value of a and b, but it will not affect the value of x
        and y.
        * */
    }
}
