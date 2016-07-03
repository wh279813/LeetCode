class Solution(object):
	
    def lengthOfLIS(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        n = len(nums)
        if not nums or n == 0:
        	return 0

        dp = [1] * n
        maxSum = 1

        for i in range(0,n):
        	for j in range(0,i):
        		if (nums[i] > nums[j] and dp[j] + 1 > dp[i]):
        			dp[i] = dp[j] + 1
        	maxSum = max(maxSum,dp[i])
        return maxSum

test = Solution()    
input = [10, 9, 2, 5, 3, 7, 101, 18]
result = test.lengthOfLIS(input)
print(result)