public class Day1_SubarrayWithGivenSum {

    public static void subarrayWithGivenSum(int[] arr, int target) {
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == target) {
                    found = true;
                    break;
                }
            }
            if (found) break;
        }
        System.out.println(found ? "Yes" : "No");

    }
    public static void main(String[] args) {
        // 43: Subarray with given sum (Brute Force) 
        // Time: O(n²)
        // Space: O(1)
        int[] arr = {1, 4, 20, 3, 10, 5};
        int target = 33;
        subarrayWithGivenSum(arr, target);

    }
}
