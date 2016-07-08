/* DFS解法思路：需要往下走m - 1步，往右走n - 1步，dfs解决
 *  当row还有步数待走的时候，往下走
 *  当col当有步数待走的时候，往右走
 *  当row和col都为0时，跳出
 *
 *  (IDE和leetcode同样代码运行结果不一样，无法提交)
 *  (全局变量问题？) 
 */
package javapractice;



/**
 *
 * @author wanghuan
 */
public class Solution {
    static int nums = 0;
    public static int uniquePaths(int m, int n) {
        dfs(m - 1,n - 1);
        return  nums;       
    }
    
    public static void dfs(int row, int col)
    {
        if(row > 0)
            dfs(row - 1, col);
        if(col > 0)
            dfs(row, col - 1);
        if(row == 0 && col == 0)
            nums ++;
            return;
    }
}