package a.grammar.cycle;

import org.junit.Test;
import pojo.NestedClass;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 4/8/22 09:45
 */
public class ExceptionDemo {
    
    @Test
    public void ConcurrentModificationOne() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        list.forEach(e -> {
            if (e.equals(1)) {
                list.add(e * e);
            }
        });
    }
    
    @Test
    public void ConcurrentModificationTwo() {
        List<NestedClass> list = NestedClass.getList(5);
        list.forEach(e->{
            if (e.getId().equals(1)) {
                list.addAll(e.getInner());
            }
        });
    }
}
