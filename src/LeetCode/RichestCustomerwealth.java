package LeetCode;

public class RichestCustomerwealth {

    public static void main(String[] args) {

    }

    class Solution {
        public int maximumWealth(int[][] accounts) {
            int ans = Integer.MIN_VALUE;
            for(int person = 0; person < accounts.length; person++) //used for rows
            {
                int sum = 0;
                for(int account = 0 ; account < accounts[person].length; account++) //used for coloumn
                {
                    sum+= accounts[person][account];
                }

                if(sum>ans){
                    ans = sum;
                }
            }
            return ans;
        }
    }

}
