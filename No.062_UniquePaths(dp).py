#coding: utf-8
# DP解法： 在任意一点，其上一步不外乎两种可能：
# 		1. 来自该点上边   2.来自该点左边 
#  		将两者的状态相加即可
# Dynamic Programming:
# dp[i][j] = dp[i - 1][j] + dp[i][j - 1]



class Solution:
    # @param {integer} m
    # @param {integer} n
    # @return {integer}
    def uniquePaths(self, m, n):
        dp = [[1] * n for x in range(m)]
        
        for i in range(1, m):
            for j in range(1, n):
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1]
        
        return dp[-1][-1]