package time;

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
}
