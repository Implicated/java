package pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 4/8/22 16:36
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User implements Comparable<User> {
    private Integer id;
    private Integer age;
    private String name;
    private BigDecimal score;
    
    public static User getOne(Integer id, Integer age) {
        return User.builder().id(id).age(age).build();
    }
    
    public static User getOneRandom() {
        return User.builder().id(new Random().nextInt()).age(new Random().nextInt()).build();
    }
    
    public static List<User> getList() {
        List<User> list = new ArrayList<>();
        list.add(getOne(1, 10));
        list.add(getOne(2, 4));
        list.add(getOne(3, 6));
        list.add(getOne(4, 6));
        list.add(getOne(5, 7));
        return list;
    }
    
    public static List<User> getListInit() {
        List<User> list = new ArrayList<>();
        list.add(new User());
        list.add(new User());
        list.add(new User());
        list.add(new User());
        return list;
    }
    
    @Override
    public int compareTo(User o) {
        return 0;
    }
}
