package Arrays;

public class MaxMin {

    public static void findMinMax(int[] arr){
        if(arr == null || arr.length == 0){
            System.out.println("Array is empty");
            return;
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]> max){
                max = arr[i];

            }
            if(arr[i]< min){
                min = arr[i];
            }
        }

        System.out.println("max"+ max);
        System.out.println(("min" + min));

    }


    public static void main(String[] args) {
     int[] arr = {13,3,6,8,4,-1,10} ;
     findMinMax(arr);
    }

}
