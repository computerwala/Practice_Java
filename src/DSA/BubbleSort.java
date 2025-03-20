package DSA;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int arr[]= {2,3,4,6,7};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int bubble(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {

                if(arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }

            }

        }

    }
}
