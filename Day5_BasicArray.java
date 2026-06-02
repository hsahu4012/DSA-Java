public class Day5_BasicArray {
    public static void printArray(int[] arr, int length){
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void printArrayInReverse(int[] arr){
        for (int i = arr.length -1 ; i > 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
    

    public static boolean isPalindromeArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        boolean isPalindrome = true;

        while(start < end){
            if(arr[start] != arr[end]){
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        return isPalindrome;
    }

    
    public static void findAverage(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        double average = (double) sum / arr.length;  
        System.out.println("Average = " + average);      
    }

    public static void RemoveAllZeroes(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                arr[index++] = arr[i];
            }
        }
        
        // Move Zeroes to END
        while (index < arr.length) {
                arr[index++] = 0;
        }

        printArray(arr, arr.length);
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,1,2,5,2,1};

        // 17. Print Array in reverse Order
        // printArrayInReverse(arr);

        // 18. Check if array is palindrome
        // int[] palimdromeArray = {1,2,3,4,5,6,6,5,4,3,7,7,2,1};
        // boolean isPalindrome = isPalindromeArray(palimdromeArray);
        // System.out.println("Palindrome = " + isPalindrome);
        
        // 19. Find average of array elements
        // findAverage(arr);

        // 20. Remove all zeros (maintain order)
        // int [] zeroesArray = {0,1,2,0,3,0,4,0,0,5};
        // RemoveAllZeroes(zeroesArray);
        
    }
}
