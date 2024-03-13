package JavaCourse.DSA.String;

public class LengthConcatString {
    public static void main(String[] args) {
        String name = "Tony Stark";
        System.out.println("Name ki length hai: "+name.length()); // name ka length count karega jo 10 hai

        String name1 = "is IronMan";
        // ise hum normally bhi jod sakte hai like result= name+name1; aur concat() method sw bhi jod sakte hai
        String result = name.concat(" "+name1); // name aur name1 jo ye jod dega aur result me Tony Stark is IronMan.
        System.out.println(result);
    }
}
