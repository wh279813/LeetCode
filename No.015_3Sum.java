/*
 * For this question, even solution by brute-force algorithm can also be accecpted with a time complexity O(n^2).
 * Here we get a better way -- sort the arrary, set the header pointer and tail pointer.
 * If the sum is larger than target, move tail pointer(so the sum would become smaller). 
 * Otherwise move header pointer.
 */
package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author harry.wang
 */

public class Solution 
 {
 	//Search by Brute-force algorithm---Time complexity O(N^3)  Too much!!!
     public static List<List<Integer>> threeSumByEnum(int[] nums)
    {
        boolean Exitflag = false;
     	List<List<Integer>> result = new ArrayList<List<Integer>>();
     	for(int first=0;first<nums.length;first++)
     	{
     		for (int second=first+1;second<nums.length;second++ )
     		{
     			for (int third=second+1;third<nums.length;third++ ) 
     			{
     				if(nums[first] + nums[second] + nums[third] == 0)		//三次循环
     				{
     					List<Integer> SumToZero = new ArrayList<Integer>();
                                         SumToZero.add(nums[first]);
                                         SumToZero.add(nums[second]);
                                         SumToZero.add(nums[third]);
                                         Collections.sort(SumToZero);				//排序
                                         for(int i =0;i<result.size();i++)		
                                         {
                                             if (result.get(i).equals(SumToZero))    //如果result没有这个SumToZero，才添加
                                                 Exitflag = true;
                                                                                                                                              
                                         }
                                         if(!Exitflag)
                                         result.add(SumToZero); 
                                         Exitflag = false;                                     
     				}   				
     			}
     		}
     	}     
        System.out.println(result);  
     	return result;
    }
