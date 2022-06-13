import org.junit.Test;
import pojo.User;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 5/25/22 11:51
 */
public class OrderDemo {
    private List<User> list = User.getList();
    private List<Integer> intList = Arrays.asList(1, 2, 3, 0);
    
    @Test
    public void nullDemo() {
        Collections.sort(intList);
        Collections.sort(list);
        // list.add(User.getOne(null, null));
        // list.add(User.getOneRandom());
        // list.add(User.getOne(null, null));
        // Ordering.natural().nullsFirst().sortedCopy(list);
    }
}
