package src.JavaCourse.CoreJava.OOPS.MethodOverloading;

public class Addition {
    // Overloading is achieved into 3 ways

    // By changing the Data type of the Parameter

    public int add(int a, int b){
        int c ;
        c = a + b;
        return c;
    }
    public double add(double i, double j){
        double k;
        k = i + j;
        return k;
    }
    public String add(String s1, String s2){
        String s3;
        s3 = s1+s2;
        return s3;
    }

    //  by changing the number of arguments
    public int add(int a, int b, int c){
        int d;
        d = a + b + c;
        return d;
    }
    public double add(double i, double j, double k){
        double l;
        l = i + j + k;
        return l;
    }
    public String add(String s1, String s2, String s3){
        String s4;
        s4 = s1+s2+s3;
        return s4;
    }

    // By changing the order of the arguments
    public int add(int a, int b, int c, int d){
        int e;
        e = a + b + c + d;
        return e;
    }
    public double add(double i, double j, double k, double l){
        double m;
        m = i + j + k + l;
        return m;
    }
    public String add(String s1, String s2, String s3, String s4){
        String s5;
        s5 = s1+s2+s3+s4;
        return s5;
    }

    // by changing order of the arguments
    public void show(String name, int age){
        System.out.println("Name is:"+name);
        System.out.println("Age is:"+age);
    }
    public void show( int age, String name){
        System.out.println("Age is:"+age);
        System.out.println("Name is:"+name);
    }


}
