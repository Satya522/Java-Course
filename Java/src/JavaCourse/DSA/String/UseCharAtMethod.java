package JavaCourse.DSA.String;

// Java charAt() method ka use kiya jata hai jo string ke har character ko access karne ke liye hota hai.
public class UseCharAtMethod {
    public static void printLetters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = " World";
        String fullString = str1+str2;
        //System.out.println(fullString.charAt(0)); // ye 0 index pe jo character hai usko print karega tum index
        // change karke dekh sakte ho like 1,2,3,4,5..etc
        // agar me full character ko dekhna hai tab hame ek method banana padega jisme hum loop ka use karenge
        printLetters(fullString);
    }
}
