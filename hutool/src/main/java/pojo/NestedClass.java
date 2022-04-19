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
 * @since 4/8/22 09:48
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NestedClass {
    private Integer id;
    private List<NestedClass> inner;
    
    private static List<NestedClass> getInnerWithInner() {
        List<NestedClass> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(NestedClass.builder().id(i).build());
        }
        return list;
    }
    
    public static NestedClass getOne() {
        return NestedClass.builder().id(1).inner(getInnerWithInner()).build();
    }
    
    public static List<NestedClass> getList(Integer size) {
        List<NestedClass> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(getOne());
        }
        return list;
    }
}
