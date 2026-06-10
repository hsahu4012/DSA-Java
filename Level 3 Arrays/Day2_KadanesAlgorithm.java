// Question 46: Kadane’s Algorithm (Maximum Subarray Sum)

// 🔹 Problem
    // Find the maximum sum of a contiguous subarray.
// Example:
    // Input: [-2,1,-3,4,-1,2,1,-5,4]
    // Output: 6 → [4,-1,2,1]
// 🧠 Core Idea
    // Either extend the current subarray OR
    // Start a new subarray from current element
public class Day2_KadanesAlgorithm {
    public static void findMaximumSubarray(int[] arr) {
        int maxSoFar = arr[0];
        int currentSum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSoFar = Math.max(maxSoFar, currentSum);
        }
        System.out.println("Maximum Subarray Sum = " + maxSoFar);
    }

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        findMaximumSubarray(arr);
    }
}