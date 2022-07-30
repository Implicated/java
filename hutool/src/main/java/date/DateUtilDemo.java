package date;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.StopWatch;
import org.junit.Test;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 3/31/22 11:44
 */
public class DateUtilDemo {
    @Test
    public void week() {
        System.out.println(DateUtil.weekOfYear(new Date()));
    }

    @Test
    public void tomorrow() {
        System.out.println(DateUtil.today());
        System.out.println(DateUtil.formatDate(DateUtil.tomorrow()));
    }

    public void spend() throws Exception {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        // Thread.sleep(1111);
        stopWatch.stop();
        System.out.println(stopWatch.getTotal(TimeUnit.SECONDS));
        System.out.println(new Date());
    }
}
