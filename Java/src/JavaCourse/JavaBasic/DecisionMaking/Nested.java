package JavaCourse.JavaBasic.DecisionMaking;

// nested ka mtlb yah hota hai ek hi block ke under dusra block ha hona like agar hum if block use kar rahe hai to
// uske under bhi if use lar sakte hai phir se aur agar hum if-else ka use karte hai to bhi previous ki tarah ise bhi
// use kar sakte hai
public class Nested {
    public static void main(String[] args) {
        int number = 10; // You can change this value to test different numbers

        if (number > 0) {
            System.out.println("The number is positive.");

            if (number % 2 == 0) {
                System.out.println("The number is even.");
            } else {
                System.out.println("The number is odd.");
            }
        } else {
            System.out.println("The number is not positive.");
        }
    }
}
