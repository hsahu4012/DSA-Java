import java.util.Arrays;

class Day1_BasicArray{

    
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    // Computes the sum of all elements in the given array.
    public static int sumArray(int[] arr){
        int sum = 0;
        // Iterate through the array and accumulate elements into sum.
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // Finds the maximum (largest) value in the given array.
    public static int maxValue(int[] arr){
        int max = arr[0];
        // Start from index 1 because arr[0] is already considered as the initial max.
        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    // Finds the minimum (smallest) value in the given array.
    public static int minValue(int[] arr){
        int min = arr[0];
        // Start from index 1 because arr[0] is already considered as the initial min.
        for (int i = 1; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    // Counts how many elements in the array are even.
    public static int countEven(int[] arr){
        int evenCount = 0;
        // Check each element; if divisible by 2, it's even.
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                evenCount++;
            }
        }
        return evenCount;
    }


    public static int[] reverseArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){

            //1.  With Using 3rd Variable
            // int temp =  arr[start];
            // arr[start] = arr[end];
            // arr[end] = temp;

            //2.  Without Using 3rd Variable
            // arr[start] = arr[start] ^ arr[end];
            // arr[end]   = arr[start] ^ arr[end];
            // arr[start] = arr[start] ^ arr[end];

            //3. Using Addition and Substraction
            arr[start] = arr[start] + arr[end];
            arr[end] = arr[start] - arr[end];
            arr[start] = arr[start] - arr[end];

            start++;
            end--;
        }

        return arr;
    }

    public static void copyArray(int[] arr){
        int [] newArray = new int[arr.length];

        //1.  Manual Method
        // for (int i = 0; i < newArray.length; i++) {
        //     newArray[i] = arr[i];
        // }

        // 2. Fastest Method
        // System.arraycopy(arr, 0, newArray, 0, arr.length);
        
        // 3. Arrays.copyOf Method
        // newArray = Arrays.copyOf(arr, 10); // support resizing

        // 4. Using Arrays.copyOfRange() (Partial Copy)
        // newArray = Arrays.copyOfRange(arr, 1, 4);

        // 5. Using clone() Method
        // newArray = arr.clone(); // Creates a shallow copy and Perfect for primitive arrays
        //Important -  For object arrays, references are copied, not objects.

        // 6. Copy Using Streams (Java 8+)
        newArray = Arrays.stream(arr).toArray();

        printArray(newArray);
    }
    
    // Entry point of the program.
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40};

        // 1. Print Arrays
        // printArray(arr);

        // 2. Sum Arrays
        // int sum = sumArray(arr);
        // System.out.println("Sum = " + sum);

        // 3. Maximum Element
        // int max = maxValue(arr);
        // System.out.println("Max = " + max);

        // 4. Minimum Element
        // int min = minValue(arr);
        // System.out.println("Min = " + min);
        
        // 5. Count even numbers
        // int countEven = countEven(arr);
        // System.out.println("Even Count = " + countEven);

        // 6. Reverse an array - Two Pointer approach
        // arr = reverseArray(arr);
        // printArray(arr);

        // 7. Copy one array to another
        copyArray(arr);

    }
}

