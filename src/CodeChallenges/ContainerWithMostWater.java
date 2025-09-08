package CodeChallenges;

public class ContainerWithMostWater {
    public int maxArea(int[] height){
        int left = 0;
        int right = height.length-1;
        int maxWaterContainer = 0;

        while (left<right){
            int distance = right - left;

            int minHeight = Math.min(height[left],height[right]);

            int currentArea = minHeight * distance;

            maxWaterContainer = Math.max(maxWaterContainer,currentArea);

            if (height[left] < height[right]){
                left++;
            }else {
                right--;
            }
        }
        return maxWaterContainer;
    }
}
