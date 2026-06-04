import java.util.Arrays;

class Day1_BasicArray{

    
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
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

