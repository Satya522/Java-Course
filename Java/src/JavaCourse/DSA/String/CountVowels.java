package src.JavaCourse.DSA.String;

public class CountVowels {
    public static void countVowelsAndConsonants(String string){
        int vowels = 0;
        int consonants =0;
        for(int i=0;i<string.length();i++){
            char ch = Character.toLowerCase(string.charAt(i));
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels++;
            }
            else if(ch >= 'a' && ch <= 'z'){   // why we use this condition because we don't want to count special
                // characters and numbers as consonants
                consonants++;
            }
        }
        System.out.println("Vowels: "+vowels);
        System.out.println("Consonants: "+consonants);
    }
    public static void main(String[] args) {
        String string = "Sachin Tendulkar";
        countVowelsAndConsonants(string);
    }
}
