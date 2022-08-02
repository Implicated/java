package time;

import cn.hutool.core.date.DateUtil;
import org.junit.Test;

import java.time.LocalDate;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 6/20/22 16:31
 */
public class DateDemo {
    @Test
    public void one() {
        System.out.println(LocalDate.now().getMonthValue());
    }

    @Test
    public void week() {
        System.out.println(DateUtil.weekOfYear(DateUtil.parseDate("2011-01-01")));
        System.out.println(DateUtil.weekOfYear(DateUtil.parseDate("2011-01-02")));
        System.out.println(DateUtil.weekOfYear(DateUtil.parseDate("2011-01-03")));
        System.out.println(DateUtil.weekOfYear(DateUtil.parseDate("2017-01-01")));
        System.out.println(DateUtil.weekOfYear(DateUtil.parseDate("2018-01-01")));
        // System.out.println(DateUtil.weekOfYear(DateUtil.parseDate("2022-07-31")));
        // System.out.println(DateUtil.weekOfYear(DateUtil.parseDate("2022-08-01")));
        // System.out.println(DateUtil.weekOfYear(DateUtil.parseDate("2022-08-02")));
        // System.out.println(DateUtil.weekOfYear(DateUtil.parseDate("2022-08-03")));
        // System.out.println(DateUtil.weekOfYear(DateUtil.parseDate("2022-08-04")));
        // System.out.println(DateUtil.weekOfYear(DateUtil.parseDate("2022-08-05")));
        // System.out.println(DateUtil.weekOfYear(DateUtil.parseDate("2022-08-06")));
        // System.out.println(DateUtil.weekOfYear(DateUtil.parseDate("2022-08-07")));
        // System.out.println(DateUtil.weekOfYear(DateUtil.parseDate("2022-08-08")));
    }
}
