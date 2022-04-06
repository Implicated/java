import cn.hutool.core.util.RandomUtil;

import java.util.List;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 2/23/22 11:12
 */
public class Play {
    
    public static void main(String[] args) {
        int result = game(init());
        if (result == 0) {
            System.out.println(result);
        }
    }
    
    private static int init() {
        return 1;
    }
    
    
    public static int game(int init_high) {
        Floor f = new Floor();
        while (true) {
            int select_color = select(f.getBlocks());
            int result = play(select_color, f.getColor(), init_high);
            if (result == 0) {
                return result;
            }
        }
    }
    
    private static int select(List<Block> blocks) {
        return blocks.get(RandomUtil.randomInt(0, blocks.size())).getColor();
    }
    
    private static int play(int man_color, int floor_color, int man_high) {
        if (man_color == floor_color) {
            man_high += floor_color;
        } else {
            man_high -= floor_color;
        }
        return man_high;
    }
}
