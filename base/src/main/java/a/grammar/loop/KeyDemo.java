package a.grammar.loop;

import org.junit.Test;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 1/19/22 00:53
 */
@SuppressWarnings("all")
public class KeyDemo {
    @Test
    public void returnKey() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + "start");
        for (int i = 0; i < 3; i++) {
            System.out.println("---- " + i);
            for (int j = 0; j < 3; j++) {
                System.out.println(j);
                return;
            }
        }
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + "end");
    }
    
    @Test
    public void breakKey() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + "start");
        for (int i = 0; i < 3; i++) {
            System.out.println("---- " + i);
            for (int j = 0; j < 3; j++) {
                System.out.println(j);
                break;
            }
        }
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + "end");
    }
    
    @Test
    public void continueKey() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + "start");
        for (int i = 0; i < 3; i++) {
            System.out.println("---- " + i);
            for (int j = 0; j < 3; j++) {
                System.out.println(j);
                continue;
            }
        }
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + "end");
    }
}

