package pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

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
public class UserCopy {
    private Integer id;
    private String age;
    
    public static UserCopy getOne(Integer id, String age) {
        return UserCopy.builder().id(id).age(age).build();
    }
    
    public static List<UserCopy> getList() {
        List<UserCopy> list = new ArrayList<>();
        list.add(getOne(1, "10"));
        list.add(getOne(2, "4"));
        list.add(getOne(3, "6"));
        list.add(getOne(4, "6"));
        list.add(getOne(5, "7"));
        return list;
    }
}
