package extend;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 3/25/22 16:36
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Children extends Parent {
    private Integer id;
    // 返回类型不一样和父类
    // private List<Integer> list;
    private List<String> list;
}
