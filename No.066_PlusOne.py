# coding:utf-8
# 问题在于设置一个变量用来储存进位，python中向list添加使用list.insert(index,element)
# author: wang huan

class Solution(object):
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        tmp = 0
        result = []
        i = len(digits) - 1
        # 对于最后一位加1
        result.insert(0, (digits[i] + 1)%10)
        tmp = 1 if digits[i] + 1 >= 10 else 0 
        i -= 1 
        # 对于其他的位置
        while i >= 0:
            result.insert(0, (digits[i] + tmp)%10)
            tmp = 1 if (digits[i] + tmp) >= 10 else 0
            i -= 1         
        # for the remaining tmp
        if tmp == 1:
            result.insert(0,tmp)
        return result 
        

        
