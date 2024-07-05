package src.JavaCourse.OOPS.ObjectClass;

public class UseStudent {
    public static void main(String[] args) {
       Student s = new Student();
       s.roll = 10;
       s.name = "Satya";
       s.per = 87.6;
       System.out.println("Roll: "+s.roll);
       System.out.println("Name: "+s.name);
       System.out.println("percentage: "+s.per);
    }
}
