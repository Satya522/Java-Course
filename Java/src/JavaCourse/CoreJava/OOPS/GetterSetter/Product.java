package src.JavaCourse.CoreJava.OOPS.GetterSetter;

public class Product {
    private int id;
    private String name;
    private double price;
    public void setId(int id){
        if(id<0){  // we are adding a validation check
            System.out.println("Id can not be Negative");
            return;
        }
        this.id =id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(double price){
        if (price<0){
            System.out.println("Price must be Positive");
            return;
        }
        this.price = price;
    }
    public  int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }

}
