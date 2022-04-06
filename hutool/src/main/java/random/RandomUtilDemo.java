package random;

import cn.hutool.core.util.RandomUtil;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 3/23/22 11:13
 */
public class RandomUtilDemo {
    @Test
    public void one() {
        List<Integer> l = new ArrayList<>();
        // for (int i = 0; i < 1; i++) {
        //     l.add(i);
        // }
         RandomUtil.randomEleList(l, 5).forEach(System.out::println);
    }
}
