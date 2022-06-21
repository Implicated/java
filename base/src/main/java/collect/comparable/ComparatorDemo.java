package collect.comparable;

import org.junit.Test;
import pojo.User;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Comparator.*;


/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 5/25/22 23:11
 */
@SuppressWarnings("DuplicatedCode")
public class ComparatorDemo {
    private List<Integer> integerList = Arrays.asList(4, 1, 2, 0);
    private List<User> users = User.getList();
    
    @Test
    public void one() {
        System.out.println("origin:" + integerList);
        Collections.sort(integerList);
        System.out.println("no  param:" + integerList);
        
        Collections.sort(integerList, comparingInt(e -> {
            if (e == 4) {
                return 0;
            } else {
                return e;
            }
        }));
        System.out.println("two param:" + integerList);
        
        // integerList.collect.sort(comparingInt(e -> {return 1;}));
        integerList.sort(comparingInt(e -> 1));
        System.out.println("list.collect.sort:" + integerList);
    }
    
    /**
     *
     */
    @Test
    public void two() {
        System.out.println("origin:   " + users);
        Collections.sort(users);
        System.out.println("no  param:" + users);
        
        // redirect java.util.List#collect.sort
        // Collections.collect.sort(users, comparingInt(User::getId));
        // System.out.println("two param:" + users);
        
        users.sort(comparingInt(User::getAge));
        System.out.println("list.collect.sort:" + users);
    }
    
    @Test
    public void npe() {
        List<User> listInit = User.getListInit();
        users.addAll(listInit);
        System.out.println("origin:   " + users);
        
        // first nullsFirst() will handle the cases when the b>User</b> objects are null
        //second nullsFirst() will handle the cases when the rerun value of Bean::getVal is null.
        users.add(null);
        users.sort(nullsFirst(comparing(User::getId, nullsLast(naturalOrder()))));
        System.out.println("list.collect.sort:" + users);
    }
    
    @Test
    public void reversed() {
        List<User> listInit = User.getListInit();
        users.addAll(listInit);
        System.out.println("origin:   " + users);
        
        users.add(null);
        users.sort(nullsFirst(comparing((User e) -> {
            if (e.getId() == 4) {
                return 1;
            }
            return e.getId();
        }, nullsFirst(naturalOrder()))).reversed());
        users.sort(reverseOrder());
        System.out.println("list.collect.sort:" + users);
    }
}
