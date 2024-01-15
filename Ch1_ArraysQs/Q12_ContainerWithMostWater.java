package Ch1_ArraysQs;

public class Q12_ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
    static int maxArea(int[] height) {
        int left = 0; //Points to the left stick of the container
        int right = height.length - 1; //Points to the Right stick of the container
        int maxArea = 0;

        while(left < right){
            int area = Math.min(height[left], height[right]) * (right - left);

            maxArea = Math.max(area, maxArea);

            if(height[left] < height[right]){
                left++; //If the left height of the stick is smaller than the right stick then going to the next stick
            }else{
                right--; //If the Right height of the stick is smaller than the left stick then going to the next stick
            }
        }
        return maxArea;
    }
}
