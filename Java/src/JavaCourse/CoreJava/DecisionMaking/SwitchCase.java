package src.JavaCourse.CoreJava.JavaBasic.DecisionMaking;
public class SwitchCase {
    public static void main(String[] args) {
        int choice = 2; // You can change this value to test different choices

        switch (choice) {
            case 1:
                System.out.println("You chose option 1.");
                break;
            case 2:
                System.out.println("You chose option 2.");
                break;
            case 3:
                System.out.println("You chose option 3.");
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }
}