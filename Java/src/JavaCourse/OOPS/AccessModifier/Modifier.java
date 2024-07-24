package src.JavaCourse.OOPS.AccessModifier;
public class Modifier {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        b1.HolderName = "Satya";
        System.out.println(b1.HolderName);
        b1.accountNumber = 1275732653;
        System.out.println(b1.accountNumber);
        b1.setPassword(12345);
        System.out.println(b1.getPassword());
        b1.setBalance(1000000);
        System.out.println(b1.balance);
    }
}
class Bank{
    public String HolderName;
    int accountNumber;
    private int password;
    protected double balance;

    public void setPassword(int newPassword){
       if(newPassword>999 && newPassword<1000000){
           password = newPassword;
       }else {
           System.out.println("Password should be of 4 to 6 digit");
       }
        password = newPassword;
    }
    public int getPassword(){
        return password;
    }
    public void setBalance(double newBalance){
        balance = newBalance;
    }

}
