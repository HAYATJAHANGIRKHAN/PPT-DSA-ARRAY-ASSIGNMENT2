//Question 8
//        You are given an integer array nums and an integer k.
//
//        In one operation, you can choose any index i where 0 <= i < nums.length and change nums[i] to nums[i] + x where x is an integer from the range [-k, k]. You can apply this operation at most once for each index i.
//
//        The score of nums is the difference between the maximum and minimum elements in nums.
//
//        Return the minimum score of nums after applying the mentioned operation at most once for each index in it.
//
//        Example 1:
//        Input: nums = [1], k = 0
//        Output: 0
//
//        Explanation: The score is max(nums) - min(nums) = 1 - 1 = 0.




package ppt_assignment2;

import java.util.Arrays;

public class MinimumScore {
    public int minimumScore(int[] nums, int k) {
        Arrays.sort(nums); // Sort the array in ascending order

        int n = nums.length;
        int median = nums[n / 2]; // Get the median element

        int minScore = nums[n - 1] - nums[0]; // Initialize the minimum score with the current difference

        for (int i = 0; i < n; i++) {
            int high = Math.min(median + k, nums[i] + k); // Upper limit for the element
            int low = Math.max(median - k, nums[i] - k); // Lower limit for the element

            minScore = Math.min(minScore, high - low); // Update the minimum score if necessary
        }

        return minScore;
    }

    public static void main(String[] args) {
        int[] nums = {1}; // Example input array
        int k = 0; // Example value of k

        MinimumScore minimumScore = new MinimumScore();
        int result = minimumScore.minimumScore(nums, k);

        System.out.println("Minimum score: " + result);
    }
    }

