public class Day1_MaxSubarrayBruteForce {

    // 🔹 Problem
        //     Find the maximum sum of any subarray.
        //     Example:
        //     Input: [-2, 1, -3, 4, -1, 2, 1, -5, 4]
        //     Output: 6 → [4, -1, 2, 1]

    // 🧠 Thought Process
        //     Generate all subarrays
        //     Track maximum sum

    public static void maxSubarrayBruteForce(int[] arr) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                maxSum = Math.max(maxSum, sum);
            }
        }

        System.out.println("Max Sum = " + maxSum);
    }

    public static void main(String[] args) {
        
        // 45: Maximum sum subarray (Brute Force)
        // Time: O(n²)
        // Space: O(1)
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        maxSubarrayBruteForce(arr);
    }
}
