package src.JavaCourse.CoreJava.OOPS.Encapsulation;
public class Student {
   private int roll;
     private String name;
   private double per;
   public void setStudent(int r, String s, double p){
       if(r<=0){
           System.out.println("Roll no can not be negative or zero");
       }
       else {
           roll = r;
       }
       name = s;
       per = p;
   }
   public void showStudent(){
       System.out.println("Roll: "+roll);
       System.out.println("Name: "+name);
       System.out.println("Percentage: "+per);
   }

}
