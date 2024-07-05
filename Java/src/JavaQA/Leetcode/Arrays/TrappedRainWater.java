package Arrays;

public class TrappedRainWater {
    public static int trappedWater(int[] height){
        int n = height.length;
        // calculate left max Boundary
        int[] leftMaxBoundary = new int[n];
        leftMaxBoundary[0] = height[0];
        for (int i = 1; i < n;i++) {
            leftMaxBoundary[i] = Math.max(height[i], leftMaxBoundary[i-1]);
        }
        // calculate right max boundary
        int[] rightMaxBoundary = new int[n];
        rightMaxBoundary[n-1] = height[n-1];
        for (int i = n-2; i>=0; i--) {
            rightMaxBoundary[i] = Math.max(height[i], rightMaxBoundary[i+1]);
        }
        // loop
        int trappedRainWater = 0;
        for (int i = 0; i < n; i++) {
            // water level = min(leftmax, rightmax)
            int waterLevel = Math.min(leftMaxBoundary[i], rightMaxBoundary[i]);
            // trapped water = (water level - height)*width
            trappedRainWater += waterLevel - height[i];
        }
        return trappedRainWater;
    }
    public static void main(String[] args) {
        int[] height = {4,2,0,6,3,2,5};
        System.out.println(trappedWater(height));
    }
}
