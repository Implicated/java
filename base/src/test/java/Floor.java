import cn.hutool.core.util.RandomUtil;
import lombok.Data;

import java.util.List;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 2/23/22 11:27
 */
@Data
public class Floor {
    private int length;
    private int width;
    private int color;
    private List<Block> blocks;
    
    public Floor() {
        this.blocks = new Block().gen();
        this.width = this.blocks.size();
        int maxNum = 0;
        for (Block b : this.blocks) {
            if (b.getNum() > maxNum) {
                maxNum = b.getNum();
            }
        }
        this.length = maxNum;
        this.color = this.blocks.get(RandomUtil.randomInt(1, this.blocks.size())).getColor();
    }
}
