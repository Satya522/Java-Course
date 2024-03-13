package JavaQA;
public class gapfulNumber {
    public static boolean isgapful(int num){
        int numLength = String.valueOf(num).length();
        int firstDigit = Integer.parseInt(String.valueOf(num).substring(0, 1));
        int lastDigit = num % 10;
        String concated = String.valueOf(firstDigit) + String.valueOf(num) + String.valueOf(lastDigit);
        int concatedNum = Integer.parseInt(concated);
        if (numLength >= 3 && concatedNum % num == 0) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int num = 192;
        System.out.println(isgapful(num));
    }
}