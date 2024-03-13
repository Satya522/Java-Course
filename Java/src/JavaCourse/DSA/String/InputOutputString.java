package JavaCourse.DSA.String;

import java.util.Scanner;
//Note: Input me hum kuch bhi de sakte lekin wo java ke character set me hona chahiye jaise ki ASCII and UNICODE etc.
public class InputOutputString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // next() iska mtlb ye hai yeh sirf ek words print karega example: "Tony stark" isme sirf
        // tony hi print hoga
        // lekin agar hum iske jagah nextLine() use karenge to pura line print karega.

        String name = scanner.nextLine();
        System.out.println(name);
    }
}
