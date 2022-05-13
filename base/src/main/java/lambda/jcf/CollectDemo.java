package lambda.jcf;

import cn.hutool.core.text.StrPool;
import org.junit.Test;
import pojo.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 4/19/22 13:17
 */
public class CollectDemo {
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, -3, 10, 4, 5));
    
    @Test
    public void foreach() {
        System.out.println("foreEach");
        list.forEach(System.out::println);
        
        System.out.println("final");
        AtomicInteger order = new AtomicInteger(1);
        list.forEach(e -> System.out.println(order.getAndIncrement()));
    }
    
    /**
     * 删除满足条件的
     */
    @Test
    public void removeIf() {
        System.out.println("removeIf");
        list.removeIf(e -> e > 3);
        list.forEach(System.out::println);
    }
    
    @Test
    public void groupby() {
        List<User> list = User.getList();
        list.add(User.getOne(1, null));
        list.stream().collect(Collectors.groupingBy(User::getAge));
    }
    
    @Test
    public void li() {
        List<Integer> lis = new ArrayList<>();
        lis.stream().map(String::valueOf).collect(Collectors.joining(StrPool.COMMA));
    }
}
