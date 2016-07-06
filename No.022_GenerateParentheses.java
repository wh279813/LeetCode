/* 基本素养:只要见到求所有可能组合的情况（所有可能组合的个数）， 首先立马想几个概念词：DFS、递归、回溯!
 *               (   
 *         ((       () 
 *      (((    (()     ()(
 *   ((()   (()(  (())
 *      .               .
 *      .               .
 *  深度优先搜索，记录路径，得到需要条件后回溯，继续遍历
 */
package javapractice;


import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author wanghuan
 */
public class Solution {
    public static List<String> generateParenthesis(int n) {
        ArrayList<String> lists = new ArrayList<String>();    
        dfs(lists,"", n , n);
        return lists;
    }
    
    public static void dfs(ArrayList<String> tmp, String str,int l,int r) //参数中的l,r是还需要添加的左右括号数量
    {
        if(l > r)                           //不用再额外计数以使左括号的数量大于右括号
            return;
        if(l > 0)                           
        {                                   
            dfs(tmp,str + "(", l -1, r);
        }
        if(r > 0)
        {              
            dfs(tmp,str + ")", l, r - 1);           //先加左括号还是右括号由36行和31行的顺序决定
        }
        if(l == 0 && r == 0)       
            tmp.add(str);
            return;
    }
}