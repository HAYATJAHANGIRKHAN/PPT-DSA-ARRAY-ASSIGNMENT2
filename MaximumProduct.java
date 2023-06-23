//Question 5
//        Given an integer array nums, find three numbers whose product is maximum and return the maximum product.
//
//        Example 1:
//        Input: nums = [1,2,3]
//        Output: 6

package ppt_assignment2;

import java.util.Arrays;

public class MaximumProduct {
    public static int maximumProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        int product1 = nums[n-1] * nums[n-2] * nums[n-3]; // product of three largest elements
        int product2 = nums[0] * nums[1] * nums[n-1];    // product of two smallest elements and largest element

        return Math.max(product1, product2);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int maxProduct = maximumProduct(nums);
        System.out.println("Maximum product: " + maxProduct);
    }
}
