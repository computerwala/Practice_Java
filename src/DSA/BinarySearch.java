package DSA;

public class BinarySearch {

    static int BinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;


        while (start <= end) {

            int mid = start + (end - start) / 2; // this will give us mid element of an array


            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;

            }
            else {
                return mid;

            }

        }

        return -1;
    }
}