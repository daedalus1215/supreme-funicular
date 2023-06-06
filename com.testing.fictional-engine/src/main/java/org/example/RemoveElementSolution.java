package org.example;

public class RemoveElementSolution {
    public static void main(String[] args) {

        System.out.println(removeElement(new int[]{3,2,2,3}, 3));
    }


    private static int removeElement(int[] nums, int num) {
        int size = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != num) {
                int temp = nums[size];
                nums[size] = nums[i];
                nums[i] = temp;
                size++;
            }
        }
        return size;
    }
}
