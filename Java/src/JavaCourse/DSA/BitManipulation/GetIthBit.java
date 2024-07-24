package src.JavaCourse.DSA.BitManipulation;

public class GetIthBit {
    public static void main(String[] args) {
//        int  n = 7;
//        int i = 2;  // yeh ye batata hai 7 ke binary which is 00000110 form me lane pe ith i = 2  ki jo value hai use
        // hume chahiye jaise 00000110 me 0- 0, 1- 1, 2- 1, 3- 0, 4- 0, 5- 0, 6- 0, 7- 0
        // to 2th position pe jo 1 hai uski value chahiye
        // 00000110
        //

        int n = 10;
        int i = 2;
        // 00001010
        // 2nd position pe 0 hai wahi value return karna hai
        getIthBit(n, i);
    }
    public static void getIthBit(int n, int i){
        int mask = 1 << i;
        int bit = (n & mask) > 0 ? 1 : 0;
        System.out.println(bit);
    }
}
