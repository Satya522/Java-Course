package src.JavaCourse.OOPS.GetterSetter;

public class UseProduct {
    public static void main(String[] args) {
        Product product = new Product();
        product.setId(101);
        product.setName("Maggi");
        product.setPrice(28.0);
        System.out.println("Product id:"+product.getId());
        System.out.println("product name:"+product.getName());
        System.out.println("product price:"+product.getPrice());
    }
}
