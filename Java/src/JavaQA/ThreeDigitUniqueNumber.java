package JavaQA;
public class ThreeDigitUniqueNumber {
    public static void main(String[] args) {
        int count =0;
        int i,j,k;
        for(i=1;i<=4;i++){
            for(j=1;j<=4;j++){
                for(k=1;k<=4;k++){
                    if(i!=j && j!=k && k!=i){
                        count++;
                        System.out.println(i+""+j+""+k);
                    }
                }
            }
        }
        System.out.println("Total number of unique 3 digit numbers are: "+count);

    }
}
