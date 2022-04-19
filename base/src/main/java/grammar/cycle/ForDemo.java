package grammar.cycle;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

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
public class ForDemo {
    @Test
    public void two() {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        for (Integer integer : set) {
            fun(integer);
            if (integer == 2) {
                try {
                    System.out.println(1 / 0);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    private void fun(Integer integer) {
        System.out.println("fun" + integer);
    }
    
    private void fun(String integer) {
        System.out.println("fun:" + integer);
    }
    
    @Test
    public void one() {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        for (Integer integer : set) {
            fun("for");
            try {
                if (integer == 2) {
                    fun("if");
                    continue;
                }
                if (integer == 3) {
                    System.out.println(1 / 0);
                }
            } catch (Exception e) {
                fun("catch");
            } finally {
                fun("finally");
            }
            System.out.println();
        }
        System.out.println("----");
    }
}
