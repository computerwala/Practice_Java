package LeetCode;

public class FirstAndLastPostion {

    public static void main(String[] args) {



    }

    public int[] searchRange(int[] nums, int target){

        int ans = {-1, -1};
        //check for first occurence if the target first
        ans[0]  = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }

        return ans;

    }

    un

}
