package src.JavaQA.GfG.String;

public class BeautifulString {
    public static int makeBeautifulString(String str){
        int count1=0;  // for pattern '0101...'
        int count2 =0;  // for pattern '1010...'
        for (int i = 0; i < str.length(); i++) {
            if((i%2 == 0 && str.charAt(i) != '0') || (i%2 != 0 && str.charAt(i) != '1')){
                count1++;
            }
            if ((i % 2 == 0 && str.charAt(i) != '1') || (i % 2 != 0 && str.charAt(i) != '0')) {
                count2++;
            }
        }
        return Math.min(count1, count2);
    }
    public static void main(String[] args) {
        String str = "1001";
        System.out.println(makeBeautifulString(str));
    }
}
