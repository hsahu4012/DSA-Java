class Day4_BasicArray{

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int linearSearch(int[] array, int target){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
    

    public static int countFrequency(int[] array, int target){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                count++;
            }
        }
        return count;
    }
    
    public static int[] replaceWithSquare(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * array[i];
        }
        return array;
    }

    

    public static int differenceFinder(int[] array){
        if(array.length < 1){
            throw new IllegalArgumentException("Array is empty");
        }
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];   
            }
            if (max < array[i]) {
                max = array[i];
                
            }
        }
        return max - min;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,1,2,5,2,1};
        
        // 13. Linear Search
        // int target = 0;
        // int firstIndex = linearSearch(arr, target);
        // System.out.println("target " + target + " found in : " + firstIndex);


        // 14. Count frequency of a given element
        // int target = 1;
        // int frequency = countFrequency(arr, target);
        // System.out.println("target " + target + " found : " + frequency + " times");

        // 15. Replace all elements with their squares
        // arr = replaceWithSquare(arr);  // Use 2 pointer approach if array is sorted with negative number
        // printArray(arr);

        // 16. Find difference between maximum and minimum element
        int difference = differenceFinder(arr);
        System.out.println(difference);

    }
}