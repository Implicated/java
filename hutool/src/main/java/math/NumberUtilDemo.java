package math;

import cn.hutool.core.util.NumberUtil;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 3/19/22 21:48
 */
public class NumberUtilDemo {
    
    @Test
    public void bigDecimal() {
        System.out.println(NumberUtil.div(4, 21, 4, RoundingMode.HALF_UP));
        System.out.println(NumberUtil.div(NumberUtil.mul(4, BigDecimal.TEN, BigDecimal.TEN), 21, 2, RoundingMode.HALF_UP));
    }
}
