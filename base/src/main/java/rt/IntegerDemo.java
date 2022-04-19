package rt;

import org.junit.Test;
import pojo.User;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 4/16/22 15:25
 */
public class IntegerDemo {
    @Test
    public void one() {
        User one = User.getOne(1, Integer.MAX_VALUE);
        User two = User.getOne(1, Integer.MAX_VALUE);
        User three = User.getOne(1, 1);
        List<User> list = new ArrayList<>();
        list.add(one);
        // list.add(two);
        list.add(three);
        System.out.println(list.stream().mapToInt(User::getAge).sum());
    }
}
