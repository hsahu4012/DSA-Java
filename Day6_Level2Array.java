public class Day6_Level2Array {

    public static void printArray(int[] arr, int start,int end){
        for (int i = start; i < end; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }

        return -1;

    }

    public static int findFirstOccurance(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        int result = -1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                result = mid;
                end = mid-1;   // For First Occurance
            }
            else if(arr[mid] > target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }

        return result;

    }
    public static int findLastOccurance(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        int result = -1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                result = mid;
                start = mid+1;   // For Last Occurance
            }
            else if(arr[mid] > target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }

        return result;

    }
    public static void main(String[] args) {
        
        // 21.Binary search (sorted array)
        // int[] sortedArray = {1,2,3,4,6,7,8,9};
        // int target = 4;
        // int index = binarySearch(sortedArray, target);
        // System.out.println("Target present in Index : " + index);


        // 22: First occurrence of an element (Sorted Array)
        // 23: Last occurrence of an element (Sorted Array)
        // 24: Count occurrences using Binary Search
        // int[] sortedArray = {1,2,4,4,4,4,6,7,8,9};
        // int target = 4;
        // int firstOccurance = findFirstOccurance(sortedArray, target);
        // int lastOccurance = findLastOccurance(sortedArray, target);
        // System.out.println("Target present from Index : " + firstOccurance + " to " + lastOccurance);
        // printArray(sortedArray, firstOccurance, lastOccurance);



        // 25: Bubble Sort
        
    }
}
