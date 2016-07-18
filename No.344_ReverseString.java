/*
 * 字符串的基本操作：倒序
 */
package javapractice;

/**
 *
 * @author wanghuan
 */
public class clsReverseInt {
      public String reverseString(String str){
        int length = str.length();
        String temString = "";
        for(int i=length;i>0;i--)
        {
            temString = temString + str.charAt(i-1);
        }
        return temString;
    }
}
