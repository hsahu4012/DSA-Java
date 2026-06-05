public class Day1_PrefixSumArray {
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void buildPrefixSum(int[] arr) {
        int n = arr.length;
        int[] prefix = new int[n];

        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        printArray(prefix);  
    }
    public static void main(String[] args) {
        // 41: Prefix Sum Array
        // Time: O(n)
        // Space: O(n)
        int[] arr = {2, 4, 6, 8};
        buildPrefixSum(arr);
    }
}