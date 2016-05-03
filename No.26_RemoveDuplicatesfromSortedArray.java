public class Solution {
    public int removeDuplicates(int[] nums) 
    {
        int result = 1;
        if(nums == null)
            return 0;
        else if(nums.length == 1)
            return 1;
        else
        {
            for(int i = 1;i < nums.length;i++)
            {
                if(nums[i]!=nums[i-1])              //从第二位开始每当该位与上一位不同，结果加1
                {
                    result ++;
                }
            }
            return result;
        }     
    }
}
