package ArrayOperations;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayElementSwapper swapper = new ArrayElementSwapper();
        int[] arr = {5, 2, 6, 10, 9, 3};

        System.out.println("Original Array: " + Arrays.toString(arr));
        swapper.swap(arr, 2, 4);
        System.out.println("Swapped Array: " + Arrays.toString(arr));
    }
}
