/**
 *
 * @author wanghuan
 */
public class clsImplementstrStr {
    public static int strStr(String haystack, String needle) {
        if(needle.isEmpty())                    //边界情况
            return 0;
        char[] h = haystack.toCharArray();
        char[] n = needle.toCharArray();
        for(int i=0;i<h.length;i++)             //如果haystack的某一位等于首位
        {
            if(n[0]==h[i])
            {
                if (IsOverlapped(h,n,i,n.length-1)) 
                   return i;
            }
        }
        return -1;
                
    }
    
    
    //因为needle数组下标从0开始，所以参数为n.lenth-1
    public static boolean IsOverlapped(char[] haystack, char[] needle,int h,int n) {
        if(h+ needle.length > haystack.length )       //判断haystack在h位的n位之后，是否越界
            return  false;
        boolean flag = true;    //标志位初始为真，一旦有结果不同，置否。这个方法用来解决if()判断体里面有循环的问题
                                          
        while (n >= 0) {
            if(haystack[h+n]!= needle[n])
                flag=false;
            n--;
        }
        return flag;
    }
}
