# -*- coding: utf-8 -*-
# 这实际上是一个斐波那契数列问题
# dp[i] = dp[i-1] + dp[i-2]

class Solution(object):
    def climbStairs(self, n):
        """
        :type n: int
        :rtype: int
        """
        dp = [0] * (n + 1)
        dp[0] = dp[1] = 1
        
        for i in range(2, n + 1):
            dp[i] = dp[i - 1] + dp[i - 2]
            
        return dp[n]
        

