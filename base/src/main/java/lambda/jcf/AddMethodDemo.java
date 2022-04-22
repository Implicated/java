package lambda.jcf;

import cn.hutool.core.lang.Pair;
import cn.hutool.core.map.MapUtil;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 4/19/22 13:17
 */
public class AddMethodDemo {
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, -3, 10, 4, 5));
    ArrayList<String> l = new ArrayList<>(Arrays.asList("I", "love", "you", "too"));
    Map<Integer, String> map = MapUtil.of(Pair.of(1, "I"), Pair.of(1, "I"), Pair.of(2, "love"), Pair.of(3, "you"), Pair.of(4, "too"));
    
    @Test
    public void collection() {
        System.out.println("foreEach");
        list.forEach(System.out::println);
        
        System.out.println("removeIf");
        list.removeIf(e -> e > 3);
        list.forEach(System.out::println);
    }
    
    @Test
    public void list() {
        System.out.println("replaceAll");
        list.replaceAll(e -> e + 1);
        list.forEach(System.out::println);
        
        System.out.println("sort");
        // list.sort(Integer::compareTo);
        // list.forEach(System.out::println);
        // l.sort((e1, e2) -> e2.length() - e1.length());
        l.sort((e1, e2) -> -1);
        l.forEach(System.out::println);
    }
    
    @Test
    public void map() {
        map.forEach((k, v) -> System.out.println("k:" + k + " v:" + v));
        System.out.println(map.getOrDefault(0, "default"));
        System.out.println(map.getOrDefault(1, "default"));
    }
}
