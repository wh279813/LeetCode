# coding: utf-8

# author: wang huan

class Solution(object):
    def firstUniqChar(self, s):
        """
        :type s: str
        :rtype: int
        """
        # 声明一个hashtable，key为不重复的字母，发现重复则剔除掉，value为该字母的position
        ht = {}
        for i in range(len(s)):
            # 如果存在于hashtable中
            if s[i] in ht:
                ht[s[i]] = len(s)
            # 如果不存在
            ht[s[i]] = i 
            
        if not ht:
            # 返回hashtable中第一个录入的字母
            return -1
        else:
            print ht.values()
            l = ht.values()
            min(l)
            
            
        
test = Solution()
ex = "leetcode"
print test.firstUniqChar(ex)
        
        