/* 这个题目思路很简单，寻找两个数组中相同的元素。
* 思路: 把第一个数组放入hashmap中，元素为key（key重复没关系，目的只是表明该数组这个元素即可 ）
* 再遍历第二个数组，把拥有的相同元素输出出来。 
* 这里使用了ArrayList做暂时的保存，再转化为int[]，希望以后能找到更好的方法。
*/
package javapractice;


import java.util.HashMap;
import java.util.ArrayList;
/**
 *
 * @author wanghuan
 */

public class myMethod {
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        HashMap hash = new HashMap();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < nums1.length; i++) {
            hash.put(nums1[i], null);
        }
        
        for (int j = 0; j < nums2.length; j++) {
            if (hash.containsKey(nums2[j]))
                arr.add(nums2[j]);
                hash.remove(nums2[j]);
        }
       
        int[] result = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) 
        {
            result[i] = arr.get(i).intValue();
        }
        return result;
    }
    
    
}