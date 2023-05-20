package org.example.hash;

public class ContainerWithMostWaterSolutions {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    public static int maxArea(int[] height) {
        int right = height.length -1;
        int left = 0;
        int max = 0;
        while (left < right) {
            int w = right - left;
            int h = Math.min(height[right], height[left]);
            max = Math.max(max, w * h);
            if (height[right] > height[left]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}