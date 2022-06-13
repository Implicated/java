package stream;

import org.junit.Test;
import pojo.User;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 5/19/22 14:47
 */
public class ReduceDemo {
    @Test
    public void checkNull() {
        System.out.println(User.getListInit().stream().map(User::getScore).filter(Objects::nonNull).reduce(BigDecimal::add));
        System.out.println(User.getListInit().stream().map(User::getScore).filter(Objects::nonNull).reduce(BigDecimal::add).orElse(BigDecimal.ZERO));
        System.out.println(User.getListInit().stream().map(User::getScore).filter(Objects::nonNull).reduce(BigDecimal.ZERO, BigDecimal::add));
    }
}
