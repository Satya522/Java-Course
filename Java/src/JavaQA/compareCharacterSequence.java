package JavaQA;

public class compareCharacterSequence {
    public static void main(String[] args) {
        String s1 = "TonyStark";
        String s2 = "tonyStark";
        // create a CharSequence object names charSequence with value "TonyStark
        CharSequence charSequence = "TonyStark";
        System.out.println("Comparing "+s1+" and "+charSequence+": "+s1.contentEquals(charSequence));
        System.out.println("Comparing "+s2+" and "+charSequence+": "+s2.contentEquals(charSequence));

    }
}
