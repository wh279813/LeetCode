/*
 * Java里面，证明ArrayList是线程不安全的
 * 并使用Collections.SynchronizedList方法声明一个线程安全的ArrayList，证明之
 */

package javapractice;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import javapractice.Solution;

/**
 *
 * @author wanghuan
 */

public class ThreadSecurity
{
    public static void main(String arg[])
    {   
        List unsafeList = new ArrayList();
        List safeList = Collections.synchronizedList(new ArrayList());
        
        final int N = 10000;
        for(int i = 0;i < 10; i++)
        {
            unsafeList.clear();
            safeList.clear();
            int unsafeSize = ckThreadSafe(unsafeList, N);
            int safeSize = ckThreadSafe(safeList, N);
            System.out.println("unsafe/safe: " + unsafeSize + "/" + safeSize);
        }
    }

    public static int ckThreadSafe(final List list, final int testCount) throws InterruptedException
    {
        ThreadGroup group = new ThreadGroup(list.getClass().getName() + "@" + list.hashCode());
        final Random rand = new Random();
        
        Runnable listAppender = new Runnable() {
            public void run() {
                try {
                    Thread.sleep(rand.nextInt(2));
                } catch (InterruptedException e) {
                    return;
                }
                list.add("0");
            }     
        };
        for (int i = 0; i < testCount; i++) {
            new Thread(group, listAppender, "InsertList-" + i).start();
        }
    
        while (group.activeCount() > 0) {
            Thread.sleep(10);
        }
        return list.size();
    }

}