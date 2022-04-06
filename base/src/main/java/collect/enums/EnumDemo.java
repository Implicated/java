package collect.enums;

import org.junit.Test;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 3/9/22 15:35
 */
public class EnumDemo {
    @Test
    public void switchKey() {
        Integer i = null;
        switch (i) {
            case 1:
                System.out.println(i);
            case 2:
                System.out.println(i);
            case 3:
                System.out.println(i);
            default:
                System.out.println("default");
        }
    }
}
