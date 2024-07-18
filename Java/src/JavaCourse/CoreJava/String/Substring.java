package src.JavaCourse.CoreJava.String;
// Java me already substring method hota hai jo ki string ke kisi bhi part ko return karta hai
// Syntax: String substring(int startIndex, int endIndex)
// the startIndex is inclusive hota hai jiska mtlb hai ki vo index khud bhi include hoga lekin endIndex exclude hota
// hai jiska mtlb ye hai ki vo index khud include nhi hoga
// agar humne kewal ek hi index pass kiya to vo us index se lekar end tak ka part return kar dega

public class Substring {

    // yaha hum khud se ek substring method banayenge

    // si = start index
    // ei = ending index
//    public static String subString(String string, int si,int ei){
//        String substr = "";
//        for(int i=si;i<ei;i++){
//            substr += string.charAt(i);
//        }
//        return substr;
//    }
    public static void main(String[] args) {
        String string = "TonyStark";
        //System.out.println(string.substring(0,4));// ye humne jo method banaya hai uske liye hai
        System.out.println(string.substring(0,4)); // ye inbuilt method hai jo ki string class me already hai

    }
}
