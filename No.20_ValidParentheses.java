/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
                stack.push(arr[0]);
            }
            else if(arr[i]== ')' ||arr[i]== '}'||arr[i]== ']')
            {
                if(stack.isEmpty())
                    return false;
                else if(mapping(arr[i]) != (Character)stack.pop())
                    return false;
            }
        }
        if(!stack.isEmpty())
            return false;
        else
            return true;
    }
    
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
