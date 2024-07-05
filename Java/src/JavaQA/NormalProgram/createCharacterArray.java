package src.JavaQA.NormalProgram;
// Write a Java program to create a String object with a character array.
public class createCharacterArray {
    public static void main(String[] args) {
        char[] chars = new char[] {'T','o','n','y','S','t','a','r','k'};
        String string = String.copyValueOf(chars, 0, 4);
        System.out.println(string);
    }
}
