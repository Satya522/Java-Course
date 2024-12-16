package src.JavaCourse.CoreJava.OOPS.constructor.Default;

public class Account {
    private int accId;
    private String name;
    private double balance;
    public Account(){
        accId = 101;
        name = "Amit";
        balance = 10000.0;
        System.out.println("Default Constructor Called...");
    }

    public void showDetails(){
        System.out.println("Account Id:"+accId);
        System.out.println("Name:"+name);
        System.out.println("Balance:"+balance);
    }
}

