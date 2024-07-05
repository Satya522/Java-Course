package src.JavaCourse.OOPS.Constructor.Parametrised;

public class UseAccount {
    public static void main(String[] args) {
        Account obj1 = new Account(101,"Amit",10000.0);
        Account obj2 = new Account(102,"Rahul",20000.0);
        obj1.showDetails();
        obj2.showDetails();
    }
}