public class SecondLargest {

    public static int findSecondLargest(int[] nums) {
        if (nums == null || nums.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > largest) {
                // Update both largest and secondLargest
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                // Update secondLargest if it's smaller than num and num isn't the largest
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            throw new RuntimeException("No second largest element found.");
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] nums = {10, 20, 4, 45, 97, 98};
        System.out.println("Second largest element is: " + findSecondLargest(nums));
    }
}