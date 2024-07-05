package src.JavaCourse.DSA.String;

public class StringContainsOnlyDigit {

    public static boolean isDigit(String string){
        for(int i=0;i<string.length();i++){
            if(!Character.isDigit(string.charAt(i))){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String string = "123456";
        System.out.println(isDigit(string));
    }
}
