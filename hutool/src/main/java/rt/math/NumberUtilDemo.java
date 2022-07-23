package rt.math;

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
    public void isGreater() {
        System.out.println(isGreater(new BigDecimal("00")));
    }

    @Test
    public void bigDecimal() {
        System.out.println(BigDecimal.TEN.divide(BigDecimal.ZERO, RoundingMode.UP));
        System.out.println(NumberUtil.div(4, 0, 4, RoundingMode.HALF_UP));
        System.out.println(NumberUtil.div(4, 21, 4, RoundingMode.HALF_UP));
        System.out.println(NumberUtil.div(NumberUtil.mul(4, BigDecimal.TEN, BigDecimal.TEN), 21, 2, RoundingMode.HALF_UP));
    }

    public static BigDecimal isGreater(BigDecimal... num) {
        if (num.length < 2) {
            return num[0];
        }
        BigDecimal max = num[0];
        for (int i = 1; i < num.length; i++) {
            max = NumberUtil.isGreater(max, num[i]) ? max : num[i];
        }
        return max;
    }
}
