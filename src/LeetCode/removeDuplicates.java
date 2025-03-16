package LeetCode;

//Remove Duplicates from Sorted Array
//Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
public class removeDuplicates {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] != nums[j - 1]) { // Check uniqueness
                nums[j] = nums[i]; // Place unique element
                j++;
            }
        }

        return j;
    }

    public static void main(String[] args) {
    int[] nums = {1,2,3,3,4,4,1,6};
    int k = removeDuplicates(nums);
        System.out.println("number fo unique "+ k);
    }


}
