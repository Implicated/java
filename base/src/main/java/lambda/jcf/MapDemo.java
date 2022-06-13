package lambda.jcf;

import cn.hutool.core.lang.Pair;
import cn.hutool.core.map.MapUtil;
import org.junit.Test;
import pojo.User;

import java.util.*;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 4/19/22 13:17
 */
@SuppressWarnings("all")
public class MapDemo {
    Map<Integer, String> map = MapUtil.of(Pair.of(0, null), Pair.of(1, "I"), Pair.of(1, "I"), Pair.of(2, "love"), Pair.of(3, "you"), Pair.of(4, "too"));
    Map<Integer, List<User>> userMap = MapUtil.of(Pair.of(0, User.getList()), Pair.of(1, User.getList()), Pair.of(1, User.getList()));
    
    
    @Test
    public void removeIf() {
        // userMap.forEach((K, v) -> {
        //     v.forEach(user -> {
        //         if (Objects.isNull(user) || !(user.getAge() > 5)) {
        //             v.remove(user);
        //         }
        //     });
        // });
        userMap.forEach((k, v) -> {
            Iterator<User> iterator = v.iterator();
            if (Objects.isNull(iterator.next()) || !(iterator.next().getAge() > 5)) {
                iterator.remove();
            }
        });
        userMap.forEach((k,v)->{
            System.out.println("k:" + k + " v:" + v);
        });
    }
    
    /**
     * 获取value，不存在返回default
     */
    @Test
    public void getOrDefault() {
        map.forEach((k, v) -> System.out.println("k:" + k + " v:" + v));
        System.out.println(map.getOrDefault(0, "default"));
        System.out.println(map.getOrDefault(1, "default"));
        
        Map<Integer, String> map = MapUtil.of(Pair.of(1, "1"), Pair.of(2, "2222"), Pair.of(3, "333"), Pair.of(4, "444"));
    }
    
    /**
     * 不存在才put
     */
    @Test
    public void putIfAbsent() {
        map.forEach((k, v) -> System.out.println("k:" + k + " v:" + v));
        System.out.println("----");
        map.putIfAbsent(1, "hello");
        map.putIfAbsent(5, "hello");
        map.forEach((k, v) -> System.out.println("k:" + k + " v:" + v));
    }
    
    /**
     * 同时匹配k，v才删除
     */
    @Test
    public void remove() {
        map.forEach((k, v) -> System.out.println("k:" + k + " v:" + v));
        System.out.println("----");
        map.remove(1, "I");
        map.forEach((k, v) -> System.out.println("k:" + k + " v:" + v));
    }
    
    /**
     * 同时匹配k，v才替换
     */
    @Test
    public void replace() {
        map.forEach((k, v) -> System.out.println("k:" + k + " v:" + v));
        System.out.println("----");
        map.replace(1, "Ii");
        map.forEach((k, v) -> System.out.println("k:" + k + " v:" + v));
    }
    
    /**
     * 全部替换, lambda body is neither value nor void compatible
     */
    @Test
    public void replaceAll() {
        map.forEach((k, v) -> System.out.println("k:" + k + " v:" + v));
        System.out.println("----");
        map.replaceAll((k, v) -> v.toUpperCase(Locale.ROOT));
        map.forEach((k, v) -> System.out.println("k:" + k + " v:" + v));
    }
    
    @Test
    public void merge() {
        map.forEach((k, v) -> System.out.println("k:" + k + " v:" + v));
        System.out.println("----");
        map.forEach((k, v) -> System.out.println("k:" + k + " v:" + v));
    }
    
    /**
     * 关联BiFunction结果到key上，结果为null会删除
     */
    @Test
    public void computer() {
        map.forEach((k, v) -> System.out.println("k:" + k + " v:" + v));
        System.out.println("----");
        map.compute(1, (k, v) -> {
            return null;
        });
        map.compute(0, (k, v) -> {
            if (k > 2) {
                return "hello";
            } else {
                return "world";
            }
        });
        map.forEach((k, v) -> System.out.println("k:" + k + " v:" + v));
    }
    
    /**
     * 对应的key不存在 or value 是null，才执行computer
     */
    @Test
    public void computeIfAbsent() {
        map.forEach((k, v) -> System.out.println("k:" + k + " v:" + v));
        System.out.println("----");
        map.computeIfAbsent(0, k -> {
            if (k > 2) {
                return "hello";
            } else {
                return "world";
            }
        });
        map.computeIfAbsent(1, k -> {
            if (k > 2) {
                return "hello";
            } else {
                return "world";
            }
        });
        map.computeIfAbsent(90, k -> {
            if (k > 2) {
                return "hello";
            } else {
                return "world";
            }
        });
        map.forEach((k, v) -> System.out.println("k:" + k + " v:" + v));
    }
    
    /**
     * 对应的key存在 or value不是null，才执行computer
     */
    @Test
    public void computeIfPresent() {
        map.forEach((k, v) -> System.out.println("k:" + k + " v:" + v));
        System.out.println("----");
        map.computeIfPresent(0, (k, v) -> {
            if (k > 2) {
                return "hello";
            } else {
                return "world";
            }
        });
        map.computeIfPresent(1, (k, v) -> {
            if (k > 2) {
                return "hello";
            } else {
                return "world";
            }
        });
        map.computeIfPresent(90, (k, v) -> {
            if (k > 2) {
                return "hello";
            } else {
                return "world";
            }
        });
        map.forEach((k, v) -> System.out.println("k:" + k + " v:" + v));
    }
}
