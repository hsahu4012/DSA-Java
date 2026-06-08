public class Day1_CountSubarraysSumK {

    // Count total number of subarrays whose sum equals k.
    // Example:
    // Input: [1, 1, 1], k = 2
    // Output: 2
    // 🧠 Thought Process (Brute Force)

    // Try all subarrays
    // Count when sum == k

    public static void countSubarraysSumK(int[] arr, int k) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    count++;
                }
            }
        }

        System.out.println(count);

    }



    public static void main(String[] args) {
        // 44: Count subarrays with sum = K
        // Time: O(n²)
        // Space: O(1)
        int[] arr = {1, 1, 1};
        int k = 2;
        countSubarraysSumK(arr, k);

    }
}
