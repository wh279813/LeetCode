/*
*/
package javapractice;


/**
 *
 * @author wanghuan
 */

public class myMethod {
    public static int mySqrt(int x) {
    	int max = x;
    	int min = 0;
    	int mid;
        if(x == 1)
            return 1;
    	while(max - min > 1)
    	{
    		mid = min + (max - min)/2;
            if(mid * mid > x)
                max = mid;
            else
                min =  mid;                
    	}

        return min;
    }
    
}


