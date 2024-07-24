package src.JavaCourse.OOPS.constructor.Parametrised;

public class Account {
    private int accId;
    private String name;
    private double balance;
    public Account(int id, String n, double bal){
        accId = id;
        name = n;
        balance = bal;
    }

    public void showDetails(){
        System.out.println("Account Id:"+accId);
        System.out.println("Name:"+name);
        System.out.println("Balance:"+balance);
    }
}
