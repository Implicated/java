import cn.hutool.core.util.RandomUtil;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 2/23/22 11:45
 */
@Data
public class Block {
    private int color;
    private int num;
    
    public Block() {
        this.color = Random.randomColor();
        this.num = Random.randomNum();
    }
    
    public List<Block> gen() {
        List<Block> list = new ArrayList<>();
        for (int i = 0; i < RandomUtil.randomInt(1, 3); i++) {
            list.add(new Block());
        }
        return list;
    }
}
