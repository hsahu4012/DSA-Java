public class Day7_Level2Array {
    // Prints the elements of the given array in order
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Sorts the array using selection sort (min-index approach)
    public static void selectionSortwithMinIndex(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            
        }
        printArray(arr);

    }

    // Sorts the array using selection sort (max-index approach)
    public static void selectionSortwithMaxIndex(int[] arr){
       for (int i = arr.length-1; i >= 0; i--) {
            int maxIndex = 0;
            for (int j = 1; j <= i; j++) {
                if(arr[j] > arr[maxIndex]){
                    maxIndex = j;
                }
            }

            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
            
        }
        printArray(arr);
    }


    // Sorts the array using insertion sort
    public static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i-1;
            while( j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
            
        }
        printArray(arr);

    }

    
    // Moves all zero elements to the end of the array
    public static void moveZerosToEnd(int[] arr){
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                arr[index++] = arr[i];
            }
        }

        while(index < arr.length){
            arr[index++] = 0;
        }

        printArray(arr);
    }

    // Moves all negative elements to one side of the array
    public static void moveNegativeToOneSide(int[] arr){
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            if(arr[start] < 0){
                start++;
            }
            else if(arr[end] >= 0){
                end--;
            }
            else{
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }
        printArray(arr);
    }

    // Finds the missing number in a 1..n array using sum formula
    public static void findMissingNumber(int[] arr) {
        int expectedSum = (arr.length + 1) * (arr.length + 2) / 2;
        int actualSum = 0;
        for(int num : arr){
            actualSum += num;
        }
        int missingNumber = expectedSum - actualSum;
        System.out.println(missingNumber);
    }


    public static void main(String[] args) {
        int[] arr = {0,-2,1,0,-3,0,5,6,-4,-5};

        // 26: Selection Sort
        // selectionSortwithMinIndex(arr);
        // selectionSortwithMaxIndex(arr);


        // 27: Insertion Sort
        // insertionSort(arr);

        // 28: Move all zeros to the end
        // moveZerosToEnd(arr);

        // 29: Move all negative numbers to one side
        // moveNegativeToOneSide(arr);

        // 30: Find missing number (1 to n)
        // int[] missingArray = {1, 2, 4, 5};
        // findMissingNumber(missingArray);

    }
}
