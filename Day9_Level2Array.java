import java.util.HashMap;

public class Day9_Level2Array {

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void findCommonElement(int[] A, int[] B, int[] C) {
        int i = 0, j = 0, k = 0;
        while(i < A.length && j < B.length && k < C.length){
            if(A[i] == B[j] && B[j] == C[k]){
                System.out.print(A[i] + " ");
                i++; j++; k++;
            }
            else if(A[i] < B[j]){
                i++;
            }
            else if(B[j] < C[k]){
                j++;
            }
            else{
                k++;
            }
        }
        
    }
    public static void arraysEqual(int[] A, int[] B) {
        
        if (A.length != B.length) {
            System.out.println("Not Equal");
            return;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : A) {
            map.put(num, map.getOrDefault(num, 0)+1 );
        }

        for (int num : B) {
            if (!map.containsKey(num) || map.get(num) == 0) {
                System.out.println("Not Equal");
                return;
            }
            map.put(num, map.get(num) - 1);
        }
        System.out.println("Equal");

    }

    public static void rotateArrayBy1(int[] arr){

        int lastIndexValue = arr[arr.length -1];
        for (int i =arr.length -1; i > 0; i--) {
            arr[i] = arr[i - 1]; 
            
        }
        arr[0] = lastIndexValue;
        printArray(arr);
    } 

    
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }
    public static void rotateArrayByK(int[] arr, int k){
        k = k % arr.length;

        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);

        printArray(arr);
    } 

    public static void rotateArrayByKRight(int[] arr, int k){
        k = k % arr.length;

        reverse(arr, 0, arr.length  - k - 1);
        reverse(arr, arr.length - k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);

        printArray(arr);
    } 


    public static void main(String[] args) {
        
        // 36: Find common elements in 3 sorted arrays
        // Time: O(n1 + n2 + n3)
        // Space: O(1)
        // int[] A = {1, 5, 10, 20, 40, 80};
        // int[] B = {6, 7, 20, 80, 100};
        // int[] C = {3, 4, 15, 20, 30, 70, 80};
        // findCommonElement(A, B, C);

        // 37: Check if two arrays are equal
        // Time: O(n)
        // Space: O(n)
        // int[] a = {1, 2, 3};
        // int[] b = {3, 2, 1};
        // arraysEqual(a, b);


        // 38: Rotate array by 1 
        // Time: O(n)
        // Space: O(1)
        // int[] arr = {1, 2, 3, 4};
        // rotateArrayBy1(arr);

        // 39: Rotate array by k (Left rotation)
        // Time: O(n) 
        // Space: O(1)
        // int[] arr = {1, 2, 3, 4, 5};
        // int k = 2;        
        // rotateArrayByK(arr, k);

        // 40: Rotate array by k (Right rotation)
        // Time: O(n) 
        // Space: O(1)
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;        
        rotateArrayByKRight(arr, k);

        


       

    }
}
