package base;

import org.junit.Test;
import pojo.ListNode;

import java.util.Objects;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 6/9/22 16:05
 */
public class ListNodeDemo {
    @Test
    public void fore() {
        ListNode one = ListNode.getOne();
        while (Objects.nonNull(one)) {
            System.out.println(one.getVal());
            one = one.getNext();
        }
    }
    
    @Test
    public void recursive() {
        recursive(ListNode.getOne());
    }
    
    public void recursive(ListNode one) {
        if (Objects.isNull(one)) {
            return;
        }
        recursive(one.getNext());
        System.out.println(one.getVal());
    }
}
