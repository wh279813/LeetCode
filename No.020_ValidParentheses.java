/*
 * This problem can be solved by the data structure Stack.
 * Process: Push the left parenthesis into stack first, then determine the next input char.
 * If the next and current ones are not a pair, return false.
 */
package test;

import java.util.Stack;

/**
 *
 * @author harry.wang
 */
public class Solution {
    public static boolean isValid(String s) {
        Stack stack = new Stack();
        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length;i++)
        {
            if(arr[i]== '(' ||arr[i]== '{'||arr[i]== '[' )
            {
                stack.push(arr[i]);                                         //If left ones, push the char in sequence.
            }
            else if(arr[i]== ')' ||arr[i]== '}'||arr[i]== ']')              //For right ones, must make sure stack is not empty.
            {
                if(stack.isEmpty())
                    return false;
                else if(mapping(arr[i]) != (Character)stack.pop())          //Pop the left out, if they don't match, return false.
                    return false;
            }
        }
        if(!stack.isEmpty())
            return false;
        else
            return true;
    }
    
    /*
     * The matching relationship, tracking from right ones to left ones.
     */
    public static char mapping(char inputChar)                               
    {
        switch(inputChar)
        {
            case ')':return '(';
            case '}':return '{';
            case ']':return '[';
            default: return 0;
        }
    }
}
