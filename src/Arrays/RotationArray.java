package Arrays;

import java.util.Arrays;

public class RotationArray {

    public static boolean areRotation(int[] arr1, int[] arr2){
        if(arr1.length != arr2.length){
            return false;
        }

        String str1 = Arrays.toString(arr1).replaceAll("[\\[\\], ]", "");
        String str2 = Arrays.toString(arr1).replaceAll("[\\[\\], ]", "");

        String concatenated  = str1 + str1;

        return concatenated.contains(str2);

    }



    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {3,4,5,1,2};

        if(areRotation(arr1,arr2)){
            System.out.println("the array are rotation of each other");
        } else {
            System.out.println("the array are not rotational other");
        }

    }


}
