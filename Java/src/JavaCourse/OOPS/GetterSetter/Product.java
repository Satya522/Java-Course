package src.JavaCourse.OOPS.GetterSetter;

public class Product {
    private int id;
    private String name;
    private double price;
    public void setId(int i){
        if(i<0){
            System.out.println("Id can not be Negative");
            return;
        }
        id =i;
    }
    public void setName(String n){
        name = n;
    }
    public void setPrice(double p){
        if (p<0){
            System.out.println("Price must be Positive");
            return;
        }
        price = p;
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
