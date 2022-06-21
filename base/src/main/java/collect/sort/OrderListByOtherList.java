package collect.sort;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 5/26/22 16:54
 */
public class OrderListByOtherList {
    private List<Integer> list1 = Arrays.asList(92956, 92983, 93042);
    private List<Integer> list2 = Arrays.asList(92956, 92983, 93042, 93043);
    private List<Integer> orderList = Arrays.asList(92957, 92958, 92960, 92961, 92962, 92963, 92964, 92965, 92966, 92983, 93043);
    
    @Test
    public void nullTest() {
        System.out.println("origin :       " + list1);
        nullsFirst(list1);
        System.out.println("nullsFirst  :   " + list1);
    }
    
    @Test
    public void check() {
        System.out.println("origin :   " + list1);
        check(list1, 0);
        System.out.println("collect.sort  0:   " + list1);
        check(list1, 1);
        System.out.println("collect.sort  1:   " + list1);
        check(list1, -2);
        System.out.println("collect.sort -2:   " + list1);
    }
    
    @Test
    public void compare() {
    
    }
    
    /**
     * negative integer is reversed
     */
    public void check(List<Integer> list, Integer sgn) {
        list.sort((e1, e2) -> {
            return sgn;
        });
    }
    
    public void nullsFirst(List<Integer> list) {
        list.sort((e1, e2) -> {
            int ie1 = orderList.indexOf(e1);
            int ie2 = orderList.indexOf(e2);
            int i = ie1 - ie2;
            System.out.println("result:" + i);
            return i;
        });
    }
    
    public void nullsLast(List<Integer> list, Integer sgn) {
        list.sort((e1, e2) -> sgn);
    }
}
