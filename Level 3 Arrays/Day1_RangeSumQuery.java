public class Day1_RangeSumQuery {
    public static void buildRangeSum(int[] arr, int left, int right) {
        int n = arr.length;
        int[] prefix = new int[n];

        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        int rangeSum = (left == 0) ? prefix[right] : prefix[right] - prefix[left - 1];
        System.out.println(rangeSum);
    }
    public static void main(String[] args) {
        
        // 42: Range Sum Query
        // Preprocessing: O(n)
        // Each query: O(1) 
        int[] arr = {2, -4, 6, 8};
        buildRangeSum(arr,1,3);
    }
}
