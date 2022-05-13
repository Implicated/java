package lambda.jcf;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 4/19/22 13:17
 */
public class ListDemo {
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, -3, 10, 4, 5));
    ArrayList<String> l = new ArrayList<>(Arrays.asList("I", "love", "you", "too"));
    
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
    
}
