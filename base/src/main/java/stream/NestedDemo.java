package stream;

import lombok.Data;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 3/25/22 15:47
 */
@SuppressWarnings({"All"})
public class NestedDemo {
    
    @Test
    public void one() {
        Map<Integer, ListContainer> map = new HashMap<>();
        map.put(1, new ListContainer());
        Collection<ListContainer> values = map.values();
        List<Object> collect = values.stream().flatMap(e -> e.getLst().stream()).collect(Collectors.toList());
        List<Object> collect1 = map.values().stream().flatMap(e -> e.lst.stream()).collect(Collectors.toList());
        
        List<List<User>> list = new ArrayList<>();
        List<User> collect2 = list.stream().flatMap(e -> Stream.of(e.toArray(new User[0]))).collect(Collectors.toList());
    }
    
    @Test
    public void two() {
        Collection<User> m = new ArrayList<>();
        Stream<Object> objectStream = m.stream().map(e -> e.value);
        
        List<User> l = new ArrayList<>();
        User u = new User();
        u.name = "z3    ";
        u.value = "l4";
        l.add(u);
        l.stream().map(e -> e.value);
        l.forEach(e -> System.out.println(e.value));
        for (User user : l) {
            System.out.println(user.name);
        }
    }
    
    @Data
    public static class ListContainer {
        private List<Object> lst;
    }
    
    public static class User {
        private String name;
        private String value;
    }
}
