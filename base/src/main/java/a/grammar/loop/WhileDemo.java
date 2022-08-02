package a.grammar.loop;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 1/11/22 16:11
 */
public class WhileDemo {

    @Test
    public void one() {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        Iterator<Integer> iterator = set.iterator();
        System.out.println(iterator.hasNext());
        while (iterator.hasNext()) {
            String redisKey = String.valueOf(iterator.next());
            System.out.println(redisKey);
        }
    }

    @Test
    public void two() {
        int i = 0;
        while (true) {
            i++;
            System.out.println("hello:" + i);
            if (i > 20) {
                break;
            }
            if (i > 9) {
                continue;
            }
            System.out.println(i);
        }
    }
}