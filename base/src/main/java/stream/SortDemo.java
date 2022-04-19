package stream;

import org.junit.Test;
import pojo.User;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 4/8/22 16:35
 */
public class SortDemo {
    @Test
    public void one() {
        List<User> list = User.getList();
        list.forEach(System.out::println);
        list.sort(Comparator.comparing(User::getAge).reversed());
        System.out.println("----------------");
        list.forEach(System.out::println);
    }
    
    @Test
    public void sortByOtherList() {
        List<User> list = User.getList();
        list.forEach(System.out::println);
        List<Integer> orderList = Arrays.asList(1, 5, 3);
        sort1(list, orderList);
        System.out.println("----------------");
        list.forEach(System.out::println);
    }
    
    //如果targetList为list<实体>，则需要 get出 key 相同字段进行比较
    private static void sort2(List<User> targetList, List<Integer> orderList) {
        targetList.sort(((o1, o2) -> {
            System.out.println("o1: " + o1 + "   o2: " + o2);
            int io1 = orderList.indexOf(o1.getId());
            int io2 = orderList.indexOf(o2.getId());
            System.out.println("io1: " + io1 + "   io2: " + io2 + " io1-io2: " + (io1 - io2));
            return io1 - io2;
        }));
    }
    
    //如果targetList为list<实体>，则需要 get出 key 相同字段进行比较
    private static void sort1(List<User> targetList, List<Integer> orderList) {
        targetList.sort(((o1, o2) -> {
            int io1 = orderList.indexOf(o1.getId());
            int io2 = orderList.indexOf(o2.getId());
            if (io1 != -1) {
                io1 = targetList.size() - io1;
            }
            if (io2 != -1) {
                io2 = targetList.size() - io2;
            }
            return io2 - io1;
        }));
    }
    
    public void setListOrder(List<Integer> orderRegulation, List<User> targetList) {
        targetList.sort(((o1, o2) -> {
            int io1 = orderRegulation.indexOf(o1);
            int io2 = orderRegulation.indexOf(o2);
            return io1 - io2;
        }));
        
        System.out.println("规则数据：");
        orderRegulation.forEach(t -> System.out.print(t + " "));
        System.out.println();
        System.out.println("排列后的数据：");
        targetList.forEach(t -> System.out.print(t + " "));
    }
}
