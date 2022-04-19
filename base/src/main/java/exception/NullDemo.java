package exception;

import org.junit.Test;
import pojo.NestedClass;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 4/20/22 00:22
 */
public class NullDemo {
    @Test
    public void one() {
        NestedClass nestedClass = new NestedClass();
        // no exception
        System.out.println(nestedClass.getInner());
    }
}
