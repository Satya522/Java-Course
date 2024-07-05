package src.JavaCourse.DSA.Arrays.OneD;
public class TrappingWater {

    public static int trap(int[] height){
        int n= height.length; // length of array

        // Auxillary array ka left max boundary nikalane ke liye
        int[] leftMax = new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(leftMax[i-1],height[i]);
        }
        // Auxillary array ka right max boundary nikalane ke liye
        int[] rightMax = new int[n];
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1],height[i]);
        }
        int trap=0;
        int width=1; // width change ho sakta hai mere case me width 1 hai

        // loop to calculate trapped water
        for(int i=0;i<n;i++){

            // min of leftmax and rightmax boundary
            int waterLevel = Math.min(leftMax[i],rightMax[i]);

            // tapped water = waterLevel - height of current building * width
            trap += (waterLevel-height[i])*width;
        }
        return trap;
    }

    public static void main(String[] args) {
        int[] height = {4,2,0,6,3,2,5};
        System.out.println("Trapped water is: " + trap(height));
    }
}