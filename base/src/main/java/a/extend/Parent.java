package a.extend;

import lombok.Data;

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
@Data
public class Parent {
    private Integer id;
    private List<String> list;
    
    private String name = "parent";
    public String nick = "parent";
}
