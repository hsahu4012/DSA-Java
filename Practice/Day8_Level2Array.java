import java.util.HashSet;

public class Day8_Level2Array {
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void findDuplicate(int[] arr){
        boolean[] visited = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (visited[arr[i]]) {
                System.out.println("Duplicate " + arr[i]);
                break;
            }
            visited[arr[i]] = true;
        }

        
    }

    public static void findAllDuplicate(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int index = Math.abs(arr[i]);

            if (arr[index] < 0) {
                System.out.print(index + " ");
            } else {
                arr[index] = -arr[index];
            }
        }
        // printArray(arr);
    }

    public static void mergeTwoSortedArray(int[] arr1, int[] arr2){
        int i=0, j=0, k=0;
        int[] result = new int[arr1.length + arr2.length];

        while(i < arr1.length && j < arr2.length){
            if(arr1[i] <= arr2[j]){
                result[k++] = arr1[i++];
            }
            else {
                result[k++] = arr2[j++];
            }
        }
        while (i < arr1.length) {
            result[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            result[k++] = arr2[j++];
        }

        printArray(result);
    }

    public static void arraysUnion(int[] arr1, int[] arr2){
       HashSet<Integer> unionSet = new HashSet<>();
        for(int num: arr1) unionSet.add(num);
        for(int num: arr2) unionSet.add(num);

        for (int num : unionSet) {
            System.out.print(num + " ");
        }
    }

    public static void arraysIntersection(int[] arr1, int[] arr2){
        HashSet<Integer> intersectionSet = new HashSet<>();
        for(int num: arr1) intersectionSet.add(num);
        for(int num: arr2) {
            if(intersectionSet.contains(num)){
                System.out.print(num + " ");
            }
            intersectionSet.add(num);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4,4,4, 2, 2};

        // 31: Find duplicate number (single duplicate)
        // findDuplicate(arr);

        // 32: Find all duplicates in an array
        // findAllDuplicate(arr);

        // 33: Merge two sorted arrays     
        // Time: O(n + m)
        // Space: O(n + m)
        // CODE :------>
        // int[] arr1 = {1, 3, 5};
        // int[] arr2 = {2, 4, 6, 8,10};
        // mergeTwoSortedArray(arr1, arr2);

        // 34: Union of two arrays  Using HASHSET
        // Time: O(n + m)
        // Space: O(n + m)
        // CODE :------>
        // int[] a = {1, 2, 3};
        // int[] b = {2, 3, 4};
        // arraysUnion(a, b);


        // 35: Intersection of two arrays
        // Time: O(n + m)
        // Space: O(n)
        // int[] a = {1, 2, 3};
        // int[] b = {2, 3, 4};
        // arraysIntersection(a, b);

    }
}
