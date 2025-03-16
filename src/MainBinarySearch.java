public class MainBinarySearch {


    public static int BinarySearch(int[] numb, int target){
        int start = 0;
        int end = numb.length-1;

        while (start <= end){
            int mid = (start+end)/2;


            if(numb[mid] == target) {
                return mid;
            }
            else if(numb[mid]< target){
                start = mid+1;
            }
            else
                end = mid -1;
        }

        return -1;
    }


    public static void main(String[] args) {

        int[] nums = {5,7,9,11,13};
        int target = 9;

        int result = BinarySearch(nums, target);

        if(result !=-1)
            System.out.println("Element found at index:" + result);
        else
            System.out.println("Element not found");

    }
}
