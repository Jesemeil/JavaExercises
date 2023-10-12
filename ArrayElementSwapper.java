package ArrayOperations;

public class ArrayElementSwapper {

    public void swap(int[] arr, int index1, int index2) {
        if (arr == null || index1 < 0 || index1 >= arr.length || index2 < 0 || index2 >= arr.length) {
            throw new IllegalArgumentException("Invalid input or indices out of bounds.");
        }

        arr[index1] = arr[index1] + arr[index2];
        arr[index2] = arr[index1] - arr[index2];
        arr[index1] = arr[index1] - arr[index2];
    }
}

