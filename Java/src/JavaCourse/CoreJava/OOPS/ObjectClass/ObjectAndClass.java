package src.JavaCourse.CoreJava.OOPS.ObjectClass;

public class ObjectAndClass {

    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setColor("Red"); // we can use this method to change the color of thr pen
        System.out.println(p1.color);
        p1.color = "Green"; // or we can directly change the color of the pen
        System.out.println(p1.color);

        p1.tipSize = 5;
        System.out.println(p1.tipSize);


    }
}
    class Pen{
        String color;
        int tipSize;

        void setColor(String newColor){
            color = newColor;
        }
        void setTipSize(int newSize){
            tipSize = newSize;
        }
    }
    class newStudent{
        String name;
        int age;
        float percentage;

        void calcuPercentage(int phy, int chem, int math){
            percentage = (float) (phy + chem + math)/3;

        }
    }
