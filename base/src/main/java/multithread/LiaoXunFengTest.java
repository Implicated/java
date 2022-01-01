package multithread;

import org.junit.Test;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 12/29/21 20:39
 */
@SuppressWarnings("AlibabaAvoidManuallyCreateThread")
public class LiaoXunFengTest {
    
    @Test
    public void threadStatus() throws Exception {
        Thread t = new Thread(() -> {
            System.err.println("111");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        System.out.println("threadStatus begin");
        System.out.println(System.currentTimeMillis());
        t.start();
        // threadStatus 最多需要等待t线程1000毫秒，在继续执行
        t.join(1000);
        System.out.println(System.currentTimeMillis());
        // threadStatus 等t线程执行完毕，才继续执行
        t.join();
        System.out.println(System.currentTimeMillis());
        System.out.println("threadStatus end");
    }
    
    @Test
    public void threadBlockOne() throws Exception {
        // 匿名类
        Thread t = new Thread() {
            @Override
            public void run() {
                // 需要循环检查，自己判断是否要结束
                while (!isInterrupted()) {
                    System.err.println("111");
                }
                System.out.println("interrupt: " + isInterrupted());
            }
        };
        System.out.println("threadBlockOne begin");
        t.start();
        t.join(1);
        // 发出中断请求
        t.interrupt();
        Thread.sleep(1);
        System.out.println("threadBlockOne end");
    }
    
    /**
     * threadBlockTwo线程等待t线程，t等待tt线程
     * threadBlockTwo向t线程发出中断通知，tt.join()抛出异常
     */
    @Test
    public void threadBlockTwo() throws Exception {
        Thread t = new Thread() {
            @Override
            public void run() {
                System.err.println("t begin");
                Thread tt = new Thread(() -> {
                    System.err.println("tt begin");
                    // while (!isInterrupted()) {
                        System.err.println("tt:11111");
                    // }
                    System.err.println("tt end");
                });
                while (!isInterrupted()) {
                    System.err.println("t:11111");
                }
                try {
                    tt.start();
                    tt.join();
                } catch (InterruptedException e) {
                    System.err.println("t throws InterruptedException");
                }
                System.err.println("t end");
            }
        };
        System.out.println("threadBlockTwo begin");
        t.start();
        Thread.sleep(1000);
        System.out.println("threadBlockTwo t.interrupt()");
        t.interrupt();
        t.join();
        System.out.println("threadBlockTwo end");
    }
    
    @Test
    public void threadBlockThree() throws Exception {
        IThread t = new IThread();
        t.start();
        t.join(1);
        t.runFlag = false;
    }
    
    static class IThread extends Thread {
        // 使用volatile关键字修饰，保证不同线程共享
        // volatile保证可见性，不保证原子性
        // https://www.cnblogs.com/dolphin0520/p/3920373.html
        public volatile boolean runFlag = true;
        
        @Override
        public void run() {
            while (runFlag) {
                System.err.println("111");
            }
            System.out.println("runFlag:" + runFlag);
        }
    }
}
