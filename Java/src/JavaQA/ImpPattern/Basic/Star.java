package src.JavaQA.ImpPattern.Basic;
/*
   *
   * *
   * * *
   * * * *
   * * * * *
 print this type

* */
public class Star {
    public static void main(String[] args) {
        for(int line=1;line<=5;line++){
            for(int star=1;star<=line;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
