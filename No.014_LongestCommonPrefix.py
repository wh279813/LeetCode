# 字符串的操作，［］添加可以用append和insert，string添加用“＋”
# author: wang huan
class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        if not strs:
            return ""
        commonStr = strs[0]
        for i in range(len(strs)):
            commonStr = self.commonInTwo(strs[i], commonStr)
        return commonStr
        
            
    def commonInTwo(self,a, b):
        commonStr = ""
        length = len(a) if len(a) < len(b) else len(b)
        for i in range(length):
            if a[i] == b[i]:
                commonStr = commonStr + a[i]
            else:
                break
        return commonStr
        