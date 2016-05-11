/*
 * A solution by brute-force algorithm can be accepted with time complexity of O(n^2).
 * Here there is an another better idead.
 * Process : Sort the input array. Sett head and tail pointer, head goes forward from start and tail comes back from end.
 * If the sum result is larger than target -> tail comes backward
 * If the sum result is smaller than target -> head goes forward
 */
package test;

import java.util.Arrays;
/**
 *
 * @author harry.wang
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int head = 0;
        int tail = nums.length - 1;
        while(head < tail)
        {
        	if(nums[head]+nums[tail]<target)
        		head ++;
        	else if(nums[head]+nums[tail]>target)
        		tail --
        	else
        		return new int[]{nums[head],nums[tail]};
        }
    	return null;
    }
}

