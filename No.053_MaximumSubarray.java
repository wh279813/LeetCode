/* 动态规划（Dynamic programming):
*   
*
*/
package javapractice;

/**
 *
 * @author wanghuan
 */

public class myMethod {
    public int maxSubArray(int[] nums) {   
        int n = nums.length;
        if(n == 0)
            return 0;
        int[] dp = new int[n];
        int maxSum = nums[0];
        dp[0] = nums[0];
        
        for (int i = 1;i < n; i++)
        {
            dp[i] = max(dp[i-1] + nums[i],nums[i]);
            maxSum = max(maxSum,dp[i]);
        }
        return maxSum;
    }
    
    
    public static int max(int a, int b) {
        return a>b? a : b;
    }
}


