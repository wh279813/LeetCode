# coding: utf-8
# 思路：Sliding Window
# 利用两个指针，一个指向子字符串的开头，一个指向子字符串的结尾，两个指针之间不允许出现重复字符，
# 利用哈希表存储已经出现过的字符，以及该字符出现的位置，向右移动右指针，
# 如果当前指向的字符出现在子字符串当中，则将左指针指向子字符串中这个字符出现位置的下一个位置。
	
# author: wang huan

class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        left = right = 0
        maxCount = 0
        count = 0
        ht = {}   # 用一个hashtable记录所在位置，key是char，value是所在position
        while right < len(s):
        	# 如果右指针指向的字母是重复的：
        	if s[right] in ht and ht[s[right]] >= left:
        		maxCount = max(maxCount, right - left)
        		left = ht[s[right]] + 1 

        	# 如果右指针指向的字母是不重复的：
        	ht[s[right]] = right # 把新录到的字母－位置加入hashtable
        	right += 1 

        maxCount = max(maxCount , right - left)
       	return maxCount




        
        