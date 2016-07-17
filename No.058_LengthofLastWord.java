/* 非常基本的题目：字符串的基本操作
 */
package javapractice;



/**
 *
 * @author wanghuan
 */
public class Solution {
    public int lengthOfLastWord(String s) {
        int num = 0;
        char[] input = s.trim().toCharArray();
        int len = input.length;
        for(int i = len - 1; i >= 0 ; i --)
        {
            if(input[i] == ' ')
            {
                break; 
            }
            else
            {
                num ++;
            }
        }
        return num;
    }

}
