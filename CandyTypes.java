//Question 2
//        Alice has n candies, where the ith candy is of type candyType[i]. Alice noticed that she started to gain weight, so she visited a doctor.
//
//        The doctor advised Alice to only eat n / 2 of the candies she has (n is always even). Alice likes her candies very much, and she wants to eat the maximum number of different types of candies while still following the doctor's advice.
//
//        Given the integer array candyType of length n, return the maximum number of different types of candies she can eat if she only eats n / 2 of them.
//
//        Example 1:
//        Input: candyType = [1,1,2,2,3,3]
//        Output: 3
//
//        Explanation: Alice can only eat 6 / 2 = 3 candies. Since there are only 3 types, she can eat one of each type.

package ppt_assignment2;

import java.util.Arrays;

public class CandyTypes {
    public static int maxCandies(int[] candyType) {
        int maxTypes = candyType.length / 2;
        int[] candyCount = new int[200001]; // Assuming the maximum candy type is 200000

        int uniqueTypes = 0;
        for (int candy : candyType) {
            if (candyCount[candy] == 0) {
                uniqueTypes++;
            }
            candyCount[candy]++;

            // If we have already found maximum types, we can return the result
            if (uniqueTypes == maxTypes) {
                return maxTypes;
            }
        }

        // If there are fewer unique types than maxTypes, return the number of unique types
        return uniqueTypes;
    }

    public static void main(String[] args) {
        int[] candyType = {1, 1, 2, 2, 3, 3};
        int maxTypes = maxCandies(candyType);
        System.out.println("Maximum number of different types of candies Alice can eat: " + maxTypes);
    }
}
