/* 二分法查找目标：
*   1. 二分法是一个不断递归的过程，反复调用不断缩小区间。
*   2. 本题跳出条件为子区间长度为1，或者目标在区间之外。
*/
package javapractice;

import java.util.ArrayList;

/**
 *
 * @author wanghuan
 */

public class Solution {
    public static int[] searchRange(int[] nums, int target)
    {
        int[] result = new int[2];
        ArrayList<Integer> temp = new ArrayList<Integer>();
        binarySearch(nums,0, nums.length - 1, target, temp);
        if(temp == null || temp.size() == 0)
        {
            result[0] = -1;
            result[1] = -1;
        }
        else
        {
            result[0] = temp.get(0);
            result[1] = temp.get(temp.size()-1 );
        }
        return result;
        
    }
    
    
    
    public static void binarySearch(int[] nums,int start, int end, int target, ArrayList<Integer> list)
    {
        int len = (end - start)/2;
        if(start == end)  //首位相等，说明只有一个数，如果等于目标就加入到list
        {
           if(nums[start] == target)
           {
               list.add(start);
               return;
           }
           else
               return;
        }
        if(nums[start] > target || nums[end] < target )  //如果首位大于目标，或者末尾小于目标，说明目标不在该区间
            return;
        else
        {
            binarySearch(nums,start, start + len, target, list);   //递归：对该区间进行二分，并对子区间进行搜索
            binarySearch(nums,start + len + 1, end, target, list);
        }
              
    }
}


