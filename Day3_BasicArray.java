public class Day3_BasicArray {
    
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static boolean checkIfSorted(int[] arr){
        boolean isSorted = true;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
            
        }
        return isSorted;
    }

    private static int findSecondLargest(int[] arr) {
        if(arr.length < 2){
            throw new IllegalArgumentException("Array must have at least 2 elements");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }

        
        if (secondLargest == Integer.MIN_VALUE) {
                throw new RuntimeException("No second largest element found");
        }


        return secondLargest;
        
    }
    public static void main(String[] args) {
        int[] arr = {10, 15};

        // 9: Check if an array is sorted
        // boolean isSorted = checkIfSorted(arr);
        // System.out.println(isSorted);

        // 10: Find second largest element
        int secondLargest = findSecondLargest(arr);
        System.out.println(secondLargest);
        

    }

    
}
