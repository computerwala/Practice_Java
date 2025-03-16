package Arrays;

/*ArraysExample
//        Let's consider an example for better understanding.
//
//        Input:
//
//        Array: [1, 4, 20, 3, 10, 5]
//        Target Sum: 33
//        Output:
//
//        Subarray: [20, 3, 10]
//        Process:
//
//        Initialize start = 0, end = 0, current_sum = 0.
//        Add array[end] to current_sum → current_sum = 1, end = 1.
//        Add array[end] to current_sum → current_sum = 5, end = 2.
//        Add array[end] to current_sum → current_sum = 25, end = 3.
//        Add array[end] to current_sum → current_sum = 28, end = 4.
//        Add array[end] to current_sum → current_sum = 38, end = 5.
//        Since current_sum > target sum, subtract array[start] from current_sum → current_sum = 37, start = 1.
//        Since current_sum > target sum, subtract array[start] from current_sum → current_sum = 33, start = 2.
//        current_sum now equals the target sum.
//        The subarray [20, 3, 10] from index 2 to 4 is the solution.
//
//        Edge Cases
//        Empty Array: If the array is empty, there is no subarray to find.
//        Single Element: If the array has one element, check if it equals the target sum.
//        All Elements Greater Than Sum: If all elements are greater than the target sum, no valid subarray exists.


//package Arrays;

//    Example
//    Let's consider an example for better understanding.
//
//    Input:
//    Array: [1, 4, 20, 3, 10, 5]
//    Target Sum: 33
//    Output:
//
//    Subarray: [20, 3, 10]
//    Process:
//    Initialize start = 0, end = 0, current_sum = 0.
//    Add array[end] to current_sum → current_sum = 1, end = 1.
//    Add array[end] to current_sum → current_sum = 5, end = 2.
//    Add array[end] to current_sum → current_sum = 25, end = 3.
//    Add array[end] to current_sum → current_sum = 28, end = 4.
//    Add array[end] to current_sum → current_sum = 38, end = 5.
//    Since current_sum > target sum, subtract array[start] from current_sum → current_sum = 37, start = 1.
//    Since current_sum > target sum, subtract array[start] from current_sum → current_sum = 33, start = 2.
//    current_sum now equals the target sum.
//    The subarray [20, 3, 10] from index 2 to 4 is the solution.
//
//    Edge Cases
//    Empty Array: If the array is empty, there is no subarray to find.
//    Single Element: If the array has one element, check if it equals the target sum.
//    All Elements Greater Than Sum: If all elements are greater than the target sum, no valid subarray exists.*/
    public class SubarraySum {


        public  static  void findSubArraySum(int[] arr, int targetSum) {
            int start = 0;
            int currentSum = 0;


            for (int end = 0; end < arr.length ; end++) {
                currentSum += arr[end];


                while (currentSum > targetSum && start <= end ){
                    currentSum -=arr[start];
                    start++;

                }

                if (currentSum == targetSum){
                    System.out.println("subarray sum found:" + start + "to" + end);
                    return;
                }
            }
            // if no subarray found
            System.out.println("no subarray found");


        }

    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int targetSum = 33;


        findSubArraySum(arr, targetSum);
    }


    }










