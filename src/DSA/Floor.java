package DSA;

public class Floor {

    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        int ans = Floor(arr, target);
        System.out.println(ans);

    }


    static  int Floor(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target < arr[mid] ){
                end = end - 1;

            } else if(target > arr[mid]){
                start = mid + 1;

            } else {
                return  mid;

            }


        }
        return end;

}
