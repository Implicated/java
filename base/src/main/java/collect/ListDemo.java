package collect;

import cn.hutool.core.exceptions.ExceptionUtil;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 2/24/22 13:12
 */
public class ListDemo {
    public static void main(String[] args) {
        
        long curriculumNodeSize = 11;
        BigDecimal sumProgress = new BigDecimal(0);
        List<BigDecimal> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(null);
            list.add(BigDecimal.valueOf(i));
        }
        for (BigDecimal b : list) {
            sumProgress = sumProgress.add(b != null ? b : new BigDecimal(0));
        }
        sumProgress = sumProgress.divide(new BigDecimal(curriculumNodeSize), 2, BigDecimal.ROUND_UP);
        System.out.println(sumProgress);
    }
    
    @Test
    public void mod() {
        for (int i = 10000; i < 20000; i++) {
            // System.out.println(i + "|" + i % 10);
            System.out.println(i + "|" + i % 20);
            System.out.println("-----");
        }
    }
    
    @Test
    public void hu() {
        try {
            int i = 1 / 0;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(ExceptionUtil.stacktraceToString(e));
        }
    }
}
