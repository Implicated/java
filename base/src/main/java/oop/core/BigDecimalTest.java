package oop.core;

import cn.hutool.core.util.NumberUtil;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 3/18/22 12:29
 */
public class BigDecimalTest {
    
    @Test
    public void m() {
        System.out.println(new BigDecimal(4).multiply(BigDecimal.TEN).multiply(BigDecimal.TEN));
        System.out.println(new BigDecimal(1).divide(new BigDecimal(2), 4, RoundingMode.HALF_UP));
        System.out.println(new BigDecimal(1).divide(new BigDecimal(2), 4, RoundingMode.HALF_UP).multiply(BigDecimal.TEN).multiply(BigDecimal.TEN));
        System.out.println(new BigDecimal(4).multiply(BigDecimal.TEN).multiply(BigDecimal.TEN).divide(new BigDecimal(21), 2, RoundingMode.HALF_UP));
        NumberFormat nf = NumberFormat.getPercentInstance();
        nf.setMaximumFractionDigits(2);
        System.out.println(nf.format(NumberUtil.div(4, 21, 4, RoundingMode.HALF_UP)));
    }
}
