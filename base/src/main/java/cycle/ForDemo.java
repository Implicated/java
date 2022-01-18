package cycle;

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
}
