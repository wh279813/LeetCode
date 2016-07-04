/* 递归解决该问题：
*   SearchMatch方法，不断迭代candidates,存储的candidates放入temp中
*   直到target的值结束，超出target则退出
*/
package javapractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
/**
 *
 * @author wanghuan
 */

public class Solution {
    public  List<List<Integer>> combinationSum(int[] candidates, int target) 
    {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        ArrayList<Integer> temp = new ArrayList<Integer>();     //Temp list, used to store current candidate member.
        Arrays.sort(candidates);
        SearchMatch(0,candidates,target,temp,result);
        return result; 
    }
    
    
    public static void SearchMatch(int start,int[] candidates,int target,List<Integer> temp,List<List<Integer>> result)
    {
        for(int i = start; i < candidates.length; i ++)
        {
            if(target == candidates[i])
            {
                temp.add(candidates[i]);
                result.add(new ArrayList<Integer>(temp));
                temp.remove(temp.size() -1);   // Remove the last added element in temp.
            }
            else if(target > candidates[i])
            {
                temp.add(candidates[i]);
                SearchMatch(i, candidates, target - candidates[i], temp, result);  //Recur to search the rest result members.
                temp.remove(temp.size()-1);            
            }
            else
                return;        
        }
    }
}


