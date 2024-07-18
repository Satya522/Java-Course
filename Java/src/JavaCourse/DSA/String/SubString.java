package src.JavaCourse.DSA.String;

public class SubString {
    public static void subStringMethod(String str){
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                System.out.println(str.substring(i,j+1));
            }
        }
    }
    public static void stringBufferMethod(String str){
        int n = str.length();
        for (int i = 0; i < n; i++) {
            StringBuffer stringBuffer = new StringBuffer();
            for (int j = i; j < n; j++) {
                stringBuffer.append(str.charAt(j));
                System.out.println(stringBuffer);
            }
        }
    }

    public static  void stringBuilderMethod(String str){
        int n = str.length();
        for (int i = 0; i < n; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = i; j < n; j++) {
                stringBuilder.append(str.charAt(j));
                System.out.println(stringBuilder);
            }
        }

    }
    public static void main(String[] args) {
        stringBuilderMethod("abc");

    }
}
