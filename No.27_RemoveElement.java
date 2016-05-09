/* 虽然这个题只要求返回int值
*  但是只遍历一下并返回一个累加的size得到的结果是wrong anwser.
*  AC方法为：每当遇见不等于val的值，放到原数组中，从0开始
*/

public class Solution {
    public int removeElement(int[] nums, int val) {
    	int size = 0;
    	for (int i=0;i<nums.length;i++) {
    		if (nums[i] != val)
    		nums[size++] = nums[i];
    		
    	}
        return size;
    }
}