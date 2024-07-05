package src.JavaQA.NormalProgram;

public class SwitchTest {
    public static void main(String[] args) {
        char ch = 'a';
        int num = 0;
        switch(ch) {
            case 'a':
                num = 10;
                // break; removed
            case 'b':
                num = 20;
                // break; removed
            default:
                num = 30;
        }
        //System.out.println(num); // This will print 30
    }
}