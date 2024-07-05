package src.JavaCourse.OOPS.Constructor.Default;

public class UseAccount {
    public static void main(String[] args) {
        Account obj = new Account(); // Default Constructor called
        Account obj1 = new Account(); // Default Constructor called
        obj.showDetails(); // DC programmer ko man chaha value fill karne ka permission deta hai but agar programmar ne
        // khud koi value fill nahi ki to DC ki value fill ho jati hai
        obj1.showDetails(); // jb hum 2nd object banate tab DC call ho jata aur same value fill ho jati hai jo ki
        // programming world ke under illogical hai isliye hume parameterised constructor banana padta hai
    }
}
