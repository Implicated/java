package multithread;

import org.junit.Test;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 2/24/22 21:35
 */
public class ThreadPoolDemo {
    
    @Test
    public void one() throws InterruptedException {
        Executor executor = Executors.newCachedThreadPool();
        for (int i = 1; i <= 10; i++) {
            int index = i;
            Thread.sleep(1 * 1000);
            executor.execute(() -> {
                System.out.println(Thread.activeCount());
                System.out.println(Thread.currentThread());
            });
        }
    }
    
    @Test
    public void two() {
        Executor executor = Executors.newFixedThreadPool(3);
        for (int i = 1; i <= 10; i++) {
            final int index = i;
            
            executor.execute(() -> {
                try {
                    System.out.println("index:" + index);
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.activeCount());
            });
        }
    }
    
    @Test
    public void two_() {
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(1);
        for (int i = 1; i < 10; i++) {
            final int index = i;
            
            fixedThreadPool.execute(() -> {
                try {
                    System.out.println(index);
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            System.out.println("for end");
        }
        
    }
}
