
//Question 3
//        We define a harmonious array as an array where the difference between its maximum value
//        and its minimum value is exactly 1.
//
//        Given an integer array nums, return the length of its longest harmonious subsequence
//        among all its possible subsequences.
//
//        A subsequence of an array is a sequence that can be derived from the array by deleting some or no elements without changing the order of the remaining elements.
//
//        Example 1:
//        Input: nums = [1,3,2,2,5,2,3,7]
//        Output: 5
//
//        Explanation: The longest harmonious subsequence is [3,2,2,2,3].



package ppt_assignment2;

import java.util.Arrays;

public class HarmoniousSubsequence {
    public static int findLHS(int[] nums) {
        Arrays.sort(nums); // Sort the array in ascending order

        int maxLength = 0;
        int start = 0;
        int end = 0;

        while (end < nums.length) {
            int diff = nums[end] - nums[start];

            if (diff == 1) {
                int currentLength = end - start + 1;
                maxLength = Math.max(maxLength, currentLength);
                end++;
            } else if (diff > 1) {
                start++;
            } else {
                end++;
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
        int result = findLHS(nums);
        System.out.println("The length of the longest harmonious subsequence is: " + result);
    }
}
