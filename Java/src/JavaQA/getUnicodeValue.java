package JavaQA;

public class getUnicodeValue {
    public static void main(String[] args) {
        String string = "TonyStark";
        for(int i=0;i<string.length();i++){
            char ch = string.charAt(i);
            int unicode = ch;
            System.out.println(ch+" : "+unicode);
        }
    }
}
