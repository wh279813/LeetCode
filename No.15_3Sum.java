/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harry.wang
 */
public class Solution 
{
    public static List<List<Integer>> threeSum(int[] nums)
    {
    	List<List<Integer>> result = new ArrayList<List<Integer>>();
    	for(int first=0;first<nums.length;first++)
    	{
    		for (int second=first+1;second<nums.length;second++ )
    		{
    			for (int third=second+1;third<nums.length;third++ ) 
    			{
    				if(nums[first] + nums[second] + nums[third] == 0)
    				{
    					List<Integer> SumToZero = new ArrayList<Integer>();
                                        SumToZero.add(nums[first]);
                                        SumToZero.add(nums[second]);
                                        SumToZero.add(nums[third]);
    					result.add(SumToZero);
    				}   				
    			}
    		}
    	}     
    	return result;
    }
}
