package number;

import cn.hutool.core.util.ArrayUtil;
import cn.hutool.core.util.NumberUtil;
import org.junit.Ignore;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 3/19/22 21:48
 */
public class IsGreaterDemo {

    @Test
    public void isGreater() {
        BigDecimal b = null;
        System.out.println(isGreater(b));
        System.out.println(isGreater(new BigDecimal("00")));
        System.out.println(isGreater(new BigDecimal("2"), BigDecimal.TEN, BigDecimal.ONE));
        System.out.println(isGreater(new BigDecimal("100"), BigDecimal.TEN, BigDecimal.ONE));
        System.out.println(isGreater(new BigDecimal("00"), BigDecimal.ONE, BigDecimal.TEN));
        System.out.println(isGreater(new BigDecimal("00"), new BigDecimal("030"), new BigDecimal("020"), new BigDecimal("100"), new BigDecimal("010"), BigDecimal.TEN, BigDecimal.ONE));
    }

    @Ignore
    @Test
    public void bigDecimal() {
        System.out.println(BigDecimal.TEN.divide(BigDecimal.ZERO, RoundingMode.UP));
        System.out.println(NumberUtil.div(4, 0, 4, RoundingMode.HALF_UP));
        System.out.println(NumberUtil.div(4, 21, 4, RoundingMode.HALF_UP));
        System.out.println(NumberUtil.div(NumberUtil.mul(4, BigDecimal.TEN, BigDecimal.TEN), 21, 2, RoundingMode.HALF_UP));
    }

    public static BigDecimal one(BigDecimal... num) {
        if (num.length < 2) {
            return num[0];
        }
        BigDecimal max = num[0];
        for (int i = 1; i < num.length; i++) {
            max = NumberUtil.isGreater(max, num[i]) ? max : num[i];
        }
        return max;
    }

    public static BigDecimal testx(BigDecimal... num) {
        if (Objects.isNull(num)) {
            return null;
        }
        if (num.length == 1) {
            return num[0];
        } else {
            BigDecimal greater = isGreater(ArrayUtil.remove(num, 0));
            return NumberUtil.isGreater(num[0], greater) ? num[0] : greater;
        }
    }

    public static BigDecimal isBetter(BigDecimal... num) {
        System.out.println(Arrays.toString(num));
        if (Objects.isNull(num)) {
            return null;
        }
        if (num.length == 1) {
            return num[0];
        } else {
            return isBetter(num[0], isGreater(ArrayUtil.remove(num, 0)));
            // BigDecimal better = isBetter(ArrayUtil.remove(num, 0));
            // return NumberUtil.isGreater(num[0], better) ? num[0] : better;
        }
        // return NumberUtil.isGreater(num[0], num[1]) ? num[0] : num[1];
        // if (num.length > 2) {
        // ArrayList<BigDecimal> bigDecimals = Lists.newArrayList(num);
        // bigDecimals.remove(0);
        // bigDecimals.toArray(new BigDecimal[num.length - 1]);
        // isBetter(ArrayUtil.remove(num, 0));
        // }
    }

    public static BigDecimal isGreater(BigDecimal... num) {
        System.out.println("3========");
        if (num.length == 1) {
            return isGreater(num[0]);
        } else {
            return isGreater(num[0], isGreater(ArrayUtil.remove(num, 0)));
        }
    }

    public static BigDecimal isGreater(BigDecimal bigNum1, BigDecimal bigNum2) {
        System.out.println("2========");
        return NumberUtil.isGreater(bigNum1, bigNum2) ? bigNum1 : bigNum2;
    }

    public static BigDecimal isGreater(BigDecimal bigNum) {
        System.out.println("1========");
        if (Objects.isNull(bigNum)) {
            return BigDecimal.ZERO;
        }
        return bigNum;
    }

}
