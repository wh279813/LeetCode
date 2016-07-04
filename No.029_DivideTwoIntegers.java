/* 状态：未提交成功，边界条件未满足
*  思路：分别考虑除数和被除数的符号问题，符号一致时，迭代被除数，每次减去一个除数的大小，直到小于被除数即可
*  返回迭代次数
*/
package javapractice;



/**
 *
 * @author wanghuan
 */

public class Solution {
    public static int divide(int dividend, int divisor) {
        int result = 0;
        if(divisor == 0)
            return java.lang.Integer.MAX_VALUE;
        else if (dividend < 0 && divisor < 0)     //除数被除数都小于0
        {
            dividend = - dividend;
            divisor = - divisor;
            while(dividend>=divisor)
                {
                    dividend = dividend - divisor;
                    result ++;
                }
            return result;
        }           
        else if(divisor > 0 && dividend >0)       //除数被除数都大于0
        {
            while(dividend>=divisor)
            {
                dividend = dividend - divisor;
                result ++;
            }
            return result;
        }
        else if((dividend>0 && divisor<0))        //除数大于0，被除数小于0
        {
            divisor = - divisor;
            while(dividend>=divisor)
            {
                dividend = dividend - divisor;
                result ++;
            }
            return -result;

        }
        else if(dividend<0 && divisor>0)          //除数小于0，被除数大于0
        {
            dividend = - dividend;
            while(dividend>=divisor)
            {
                dividend = dividend - divisor;
                result ++;
            }
            return -result;
        }
        else    
            return 0;
    }
}
